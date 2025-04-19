package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
   
    public List<Object[]> obtenerUsuarios() throws SQLException {
        List<Object[]> usuarios = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            if (conex == null || conex.isClosed()) {
                hacerConexion();
            }
            connection = conex;

            statement = connection.createStatement();
            String sql = "SELECT cedula, contraseña FROM usuario";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Object[] fila = new Object[2];
                fila[0] = resultSet.getInt("cedula");
                fila[1] = resultSet.getString("contraseña");
                usuarios.add(fila);
            }
        } finally {
            if (resultSet != null) try { resultSet.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (statement != null) try { statement.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
        return usuarios;
    }
    
}