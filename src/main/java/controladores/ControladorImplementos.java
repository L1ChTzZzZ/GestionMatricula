
package controladores;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Implemento;
import modelos.daos.ImplementoDAO;
import vistas.FormImplementos;
import vistas.FormMenuPrincipal;
import vistas.Implementos_Datos;
import vistas.Matricula_Datos;

public class ControladorImplementos {
    private ImplementoDAO dao = new ImplementoDAO();
    
    public ControladorImplementos() {
        this.dao = new ImplementoDAO();
    }
    
        public DefaultTableModel cargarDatosImplementos(String tabla) {
        DefaultTableModel model = dao.mostrarImplementos(tabla);       
        return model;
    }
        
        public void eliminarImplementos(String id_implemento, Implementos_Datos vista) {
        if (id_implemento == null || id_implemento.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Seleccione un implemento para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(vista, "¿Está seguro de eliminar el Implemento " + id_implemento + "?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            if (dao.eliminarMatricula(id_implemento)) {
                JOptionPane.showMessageDialog(vista, "Implemento eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                // Recargar la tabla en la vista
                vista.mostrarDatosEnVisor("IMPLEMENTO");
            } else {
                JOptionPane.showMessageDialog(vista, "Error al eliminar el implemento.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
            
        public void modificarImplementos(Implemento implemento, Implementos_Datos vista) {
        if (implemento.getIdImplemento() == null || implemento.getIdImplemento().isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Seleccione un implemento para modificar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (dao.modificarImplemento(implemento)) {
            JOptionPane.showMessageDialog(vista, "Implemento modificado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            vista.mostrarDatosEnVisor("IMPLEMENTO");
            
        } else {
            JOptionPane.showMessageDialog(vista, "Error al modificar. Revise claves foráneas o el formato de fecha.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        
    public void registrarImplemento(Implemento i, FormImplementos vista) {

        boolean ok = dao.registrarImplementoCompleto(
                i.getIdImplemento(),
                i.getNombre(),
                i.getTipo(),
                i.getStock(),
                i.getPrecio()
        );

        if (ok) {
            JOptionPane.showMessageDialog(vista, "Implemento registrado correctamente");
        } else {
            JOptionPane.showMessageDialog(vista, "Error al registrar Implemento", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        
        public void retrocederAMenu4(Implementos_Datos vista, modelos.Usuario usuarioLogueado) {
        vista.dispose();
        FormMenuPrincipal menu = new FormMenuPrincipal(usuarioLogueado);
        menu.setVisible(true);
    }
        public void retrocederAMenu5(FormImplementos vista, modelos.Usuario usuarioLogueado) {
        vista.dispose();
    }
}
