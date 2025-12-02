package controladores;

import modelos.Clase;
import modelos.daos.ClaseDAO;
import modelos.Usuario;
import vistas.Clases_Datos;
import vistas.FormMenuPrincipal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorClase {

    private ClaseDAO dao = new ClaseDAO();

        public ControladorClase() {
        this.dao = new ClaseDAO();
    }
    public DefaultTableModel cargarDatosClases(String tabla) {
        DefaultTableModel model = dao.mostrarClases(tabla);       
        return model;
    }

    // Modificar clase
    public void modificarClase(Clase clase, Clases_Datos vista) {
        if (clase.getId_clase() == null || clase.getId_clase().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Seleccione una Clase para modificar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (dao.modificarClase(clase)) {
            JOptionPane.showMessageDialog(vista, "Clase modificada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            vista.mostrarDatosEnVisor("CLASES");
            
        } else {
            JOptionPane.showMessageDialog(vista, "Error al modificar. Revise claves foráneas o el formato de fecha.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Eliminar clase
    public void eliminarClase(String idClase, Clases_Datos vista) {     
        if (idClase == null || idClase.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Seleccione una clase para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(vista, "¿Está seguro de eliminar la matrícula " + idClase + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            if (dao.eliminarClase(idClase)) {
                JOptionPane.showMessageDialog(vista, "Matrícula eliminada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                // Recargar la tabla en la vista
                vista.mostrarDatosEnVisor("MATRICULA");
            } else {
                JOptionPane.showMessageDialog(vista, "Error al eliminar la matrícula.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Volver al menú
    public void retrocederAMenu(Clases_Datos vista, Usuario usuario) {
        vista.dispose();
        new FormMenuPrincipal(usuario).setVisible(true);
    }
}