package controladores;

import java.sql.SQLException;
import modelos.ModeloUsuario;
import java.util.ArrayList;
import vistas.vistaUsuario;
import vistas.vistaVehiculos;

public class controladorUsuario {

    private vistaUsuario objVista;
    private ModeloUsuario objUsuario;
    private vistaVehiculos objVehiculo;

    public controladorUsuario() {
        objUsuario = new ModeloUsuario();
    }

    public void iniciarVista() {
        objVista = new vistaUsuario();
        objVista.setVisible(true);
    }
    public void establecerDatos(int datoCedula){
        objVehiculo = new vistaVehiculos(datoCedula);
    }
    public void guardarDatos(ArrayList datitos) throws SQLException {
        objUsuario.hacerConexion();
        objUsuario.guardarDatos(datitos);
        objVehiculo.setVisible(true);
    }
}