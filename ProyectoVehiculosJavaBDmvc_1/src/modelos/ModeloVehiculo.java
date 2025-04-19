package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ModeloVehiculo {
    String usuario;
    String url;
    String clave;
    Connection conex;

    public ModeloVehiculo() {
        usuario = "root";
        url = "jdbc:mysql://localhost:3306/adminautos";
        clave = "";
        conex = null;
        try {
            hacerConexion();
        } catch (SQLException e) {
            System.err.println("Errorgogogogogogogogogogogo" + e.getMessage());
        }
    }

    public void hacerConexion() throws SQLException {
        if (conex == null || conex.isClosed()) {
            conex = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexión bien  " + conex);
        }
    }

    public void guardarDatos(ArrayList datitos) throws SQLException {
        if (conex == null || conex.isClosed()) {
            hacerConexion();
        }

        String datoSql = "INSERT INTO vehiculos (placa, datos_adicionales, combustible, marca, datoU) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement manejoDatosXd = conex.prepareStatement(datoSql)) {
            manejoDatosXd.setString(1, (String) datitos.get(0));
            manejoDatosXd.setString(2, (String) datitos.get(1));
            manejoDatosXd.setString(3, (String) datitos.get(2));
            manejoDatosXd.setString(4, (String) datitos.get(3));
            manejoDatosXd.setString(5, (String) datitos.get(4));

            manejoDatosXd.executeUpdate();
            System.out.println("Datos guardados bien xd.");
        } catch (SQLException e) {
            System.err.println("Error al guardar esos datitos: " + e.getMessage());
            throw e;
        }
    }

    public List<Object[]> obtenerTodosLosVehiculosDesdeDB() throws SQLException {
        List<Object[]> vehiculos = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            if (conex == null || conex.isClosed()) {
                hacerConexion();
            }
            connection = conex;

            statement = connection.createStatement();
            String sql = "SELECT placa, marca, combustible, datos_adicionales, datoU FROM vehiculos";
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Object[] fila = new Object[5];
                fila[0] = resultSet.getString("placa");
                fila[1] = resultSet.getString("marca");
                fila[2] = resultSet.getString("combustible");
                fila[3] = resultSet.getString("datos_adicionales");
                fila[4] = resultSet.getInt("datoU");
                vehiculos.add(fila);
            }
        } finally {
            if (resultSet != null) try { resultSet.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (statement != null) try { statement.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
        return vehiculos;
    }
}