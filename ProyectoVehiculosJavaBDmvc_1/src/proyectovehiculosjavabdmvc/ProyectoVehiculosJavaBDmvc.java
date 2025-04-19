package proyectovehiculosjavabdmvc;

import controladores.controladorUsuario;
import java.sql.SQLException;

public class ProyectoVehiculosJavaBDmvc {

    public static void main(String[] args) throws SQLException {
        controladorUsuario objConusu = new controladorUsuario();
        objConusu.iniciarVista();
    }
    
}
