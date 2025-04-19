package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloUsuario {
    String usuario;
    String url;
    String clave;
    Connection conex;

    public ModeloUsuario() {
        usuario = "root";
        url = "jdbc:mysql://localhost:3306/adminautos";
        clave = "";
        conex = null;
    }

    public void hacerConexion() throws SQLException {
        conex = DriverManager.getConnection(url, usuario, clave);
        System.out.println("Conexión exitosa: " + conex);
    }

    public void guardarDatos(ArrayList datitos) throws SQLException {
        if (conex == null) {
            throw new SQLException("La conexion no existe aun xd.");
        }
        String sql = "INSERT INTO usuario (cedula, contraseña) VALUES (?, ?)";
        try (PreparedStatement pstmt = conex.prepareStatement(sql)) {
            pstmt.setInt(1, (int) datitos.get(0));
            pstmt.setString(2, (String) datitos.get(1));

            pstmt.executeUpdate();
            System.out.println("Datos guardados bien xd.");
        } catch (SQLException e) {
            System.err.println("Error al guardar esos datitos: " + e.getMessage());
            throw e;
        }
    }
}