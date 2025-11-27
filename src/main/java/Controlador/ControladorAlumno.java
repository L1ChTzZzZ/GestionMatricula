
package Controlador;

import Modelo.dao.AlumnoDAO;
import Vista.Alumnos_Datos;
import Vista.FormMenuPrincipal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorAlumno {
    
    private AlumnoDAO dao = new AlumnoDAO();
    
    public DefaultTableModel cargarDatosAlumnos(String tabla) {
        DefaultTableModel model = dao.mostrarAlumnos(tabla);
        return model;
    }
    
    public void retrocederAMenu3(Alumnos_Datos vista, Modelo.Usuario usuarioLogueado) {
        vista.dispose();
        FormMenuPrincipal menu = new FormMenuPrincipal(usuarioLogueado);
        menu.setVisible(true);
    }
    
    public void eliminarAlumno(String DniAlumno, Alumnos_Datos tbAlumno) {
        if (DniAlumno == null || DniAlumno.isEmpty()) {
            JOptionPane.showMessageDialog(tbAlumno, "Seleccione un Alumno para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(tbAlumno, "¿Está seguro de eliminar los datos de este Alumno:  " + DniAlumno + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            if (dao.eliminarAlumno(DniAlumno)) {
                JOptionPane.showMessageDialog(tbAlumno, "Alumno eliminada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                // Recargar la tabla en la vista
                tbAlumno.mostrarDatosDeLaTabla("ALUMNO");
            } else {
                JOptionPane.showMessageDialog(tbAlumno, "Error al eliminar el Alumno.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
