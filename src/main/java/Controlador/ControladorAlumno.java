
package Controlador;

import Modelo.dao.AlumnoDAO;
import Vista.Alumnos_Datos;
import Vista.FormMenuPrincipal;
import javax.swing.table.DefaultTableModel;

public class ControladorAlumno {
    
    private AlumnoDAO dao = new AlumnoDAO();
    
    public DefaultTableModel cargarDatosMatricula(String tabla) {
        DefaultTableModel model = dao.mostrarAlumnos(tabla);
        return model;
    }
    
    public void retrocederAMenu3(Alumnos_Datos vista, Modelo.Usuario usuarioLogueado) {
        vista.dispose();
        FormMenuPrincipal menu = new FormMenuPrincipal(usuarioLogueado);
        menu.setVisible(true);
    }
}
