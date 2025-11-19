
package Controlador;

import Modelo.dao.AlumnoDAO;
import Vista.Alumnos_Datos;
import Vista.FormMenuPrincipal;
import Vista.Matricula_Datos;
import javax.swing.JOptionPane;
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
    
        public void eliminarMatricula(String DniAlumno, Alumnos_Datos tbAlumno) {
        if (DniAlumno == null || DniAlumno.isEmpty()) {
            JOptionPane.showMessageDialog(tbAlumno, "Seleccione una matrícula para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(tbAlumno, "¿Está seguro de eliminar la matrícula " + DniAlumno + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            if (dao.eliminarAlumno(DniAlumno)) {
                JOptionPane.showMessageDialog(tbAlumno, "Matrícula eliminada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                // Recargar la tabla en la vista
                tbAlumno.mostrarDatosEnVisor("MATRICULA");
            } else {
                JOptionPane.showMessageDialog(tbAlumno, "Error al eliminar la matrícula.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
