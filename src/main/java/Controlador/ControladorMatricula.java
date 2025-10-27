package controlador; // o el paquete que uses para tu controlador

import Modelo.Matricula;
import javax.swing.table.DefaultTableModel;
import Modelo.dao.MatriculaDAO;
import Vista.FormMenuPrincipal;
import Vista.Matricula_Datos;
import javax.swing.JOptionPane;


public class ControladorMatricula {
    
    private MatriculaDAO dao = new MatriculaDAO();
    private static FormMenuPrincipal menuPrincipal;
    private static Matricula_Datos matriculaDatos;
    

    public ControladorMatricula() {
        this.dao = new MatriculaDAO();
    }

    public DefaultTableModel cargarDatosMatricula(String tabla) {
        DefaultTableModel model = dao.mostrarMatriculas(tabla);       
        return model;
    }
    
    public void retrocederAMenu(Matricula_Datos vistaActual, Modelo.Usuario usuarioLogueado) {

        vistaActual.dispose();

        FormMenuPrincipal menuPrincipal = new FormMenuPrincipal(usuarioLogueado);

        menuPrincipal.setVisible(true);
    }
    
    public void eliminarMatricula(String idMatricula, Matricula_Datos vista) {
        if (idMatricula == null || idMatricula.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Seleccione una matrícula para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(vista, "¿Está seguro de eliminar la matrícula " + idMatricula + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            if (dao.eliminarMatricula(idMatricula)) {
                JOptionPane.showMessageDialog(vista, "Matrícula eliminada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                // Recargar la tabla en la vista
                vista.mostrarDatosEnVisor("MATRICULA");
            } else {
                JOptionPane.showMessageDialog(vista, "Error al eliminar la matrícula.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
        public void modificarMatricula(Matricula matricula, Matricula_Datos vista) {
        if (matricula.getIdMatricula() == null || matricula.getIdMatricula().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Seleccione una matrícula para modificar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (dao.modificarMatricula(matricula)) {
            JOptionPane.showMessageDialog(vista, "Matrícula modificada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            vista.mostrarDatosEnVisor("MATRICULA");
            
        } else {
            JOptionPane.showMessageDialog(vista, "Error al modificar. Revise claves foráneas o el formato de fecha.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
