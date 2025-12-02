package controladores;

import modelos.Profesor;
import modelos.daos.ProfesorDAO;
import vistas.FormMenuPrincipal;
import vistas.Profesores_Datos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorProfesor {
    
    private ProfesorDAO dao = new ProfesorDAO();

    public ControladorProfesor() {
        this.dao = new ProfesorDAO();
    }

    // ===============================
    //         CARGAR DATOS
    // ===============================
    public DefaultTableModel cargarProfesores() {
        return dao.mostrarProfesores();
    }

    // ===============================
    //            AGREGAR
    // ===============================
    public boolean agregarProfesor(Profesor profesor, Profesores_Datos vista) {

        if (profesor == null) {
            JOptionPane.showMessageDialog(vista, "Formulario vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (dao.agregarProfesor(profesor)) {
            JOptionPane.showMessageDialog(vista, "Profesor agregado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(vista, "Error al agregar profesor.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // ===============================
    //            MODIFICAR
    // ===============================
    public boolean modificarProfesor(Profesor profesor, Profesores_Datos vista) {

        if (profesor == null || profesor.getDniProfesor() == null) {
            JOptionPane.showMessageDialog(vista, "Seleccione un profesor válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (dao.actualizarProfesor(profesor)) {
            JOptionPane.showMessageDialog(vista, "Profesor modificado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(vista, "Error al modificar profesor.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // ===============================
    //            ELIMINAR
    // ===============================
    public boolean eliminarProfesor(String dni, Profesores_Datos vista) {
        
        if (dni == null || dni.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Seleccione un profesor para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        int confirm = JOptionPane.showConfirmDialog(vista, 
                "¿Está seguro de eliminar al profesor con DNI " + dni + "?",
                "Confirmar Eliminación", 
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {

            if (dao.eliminarProfesor(dni)) {
                JOptionPane.showMessageDialog(vista, "Profesor eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                JOptionPane.showMessageDialog(vista, "Error al eliminar profesor.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }

        return false;
    }

    // ===============================
    //         RETROCEDER MENÚ
    // ===============================
    public void retrocederAMenu(Profesores_Datos vista, modelos.Usuario usuarioLogueado) {
        vista.dispose();
        FormMenuPrincipal menu = new FormMenuPrincipal(usuarioLogueado);
        menu.setVisible(true);
    }
        public void retrocederAMenu2(Profesores_Datos vista) {
        vista.dispose();
    }
}