package controladores;

import java.sql.SQLException;
import modelos.ModeloVehiculo;
import java.util.ArrayList;
import vistas.vistaVehiculos;

public class controladorVehiculo {

    private ModeloVehiculo objVehiculo;

    public controladorVehiculo() {
        objVehiculo = new ModeloVehiculo();
    }

    public void guardarDatos(ArrayList datitos) throws SQLException {
        objVehiculo.hacerConexion();
        objVehiculo.guardarDatos(datitos);
    }
}