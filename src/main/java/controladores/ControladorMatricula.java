package controladores; // o el paquete que uses para tu controlador

import modelos.Matricula;
import javax.swing.table.DefaultTableModel;
import modelos.daos.MatriculaDAO;
import vistas.Alumnos_Datos;
import vistas.FormAlumno;
import vistas.FormMatricula;
import vistas.FormMenuPrincipal;
import vistas.FormProfesor;
import vistas.Matricula_Datos;
import vistas.Profesores_Datos;
import javax.swing.JOptionPane;


public class ControladorMatricula {
    
    private MatriculaDAO dao = new MatriculaDAO();

    public ControladorMatricula() {
        this.dao = new MatriculaDAO();
    }

    public DefaultTableModel cargarDatosMatricula(String tabla) {
        DefaultTableModel model = dao.mostrarMatriculas(tabla);       
        return model;
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
    
    public void retrocederAMenu(Matricula_Datos vista, modelos.Usuario usuarioLogueado) {
        vista.dispose();
        FormMenuPrincipal menu = new FormMenuPrincipal(usuarioLogueado);
        menu.setVisible(true);
    }
    
    public void retrocederAMenu2(FormMatricula vista, modelos.Usuario usuarioLogueado) {
        vista.dispose();
        FormMenuPrincipal menu = new FormMenuPrincipal(usuarioLogueado);
        menu.setVisible(true);
    }
    

    
    public void retrocederADatosMatricula(FormMatricula vista, modelos.Usuario usuarioLogueado) {
        vista.dispose();
        Matricula_Datos menu = new Matricula_Datos(usuarioLogueado);
        menu.setVisible(true);
    }
    
    public void retrocederADatosAlumno(FormAlumno vista, modelos.Usuario usuarioLogueado) {
        vista.dispose();
        FormAlumno menu = new FormAlumno(usuarioLogueado);
        menu.setVisible(true);
    }
    
    public void retrocederADatosProfesor(FormProfesor vista, modelos.Usuario usuarioLogueado) {
        vista.dispose();
        Profesores_Datos menu = new Profesores_Datos(usuarioLogueado);
        menu.setVisible(true);
    }
    
        public void retrocederADatosAlumno2(FormAlumno vista, modelos.Usuario usuarioLogueado) {
        vista.dispose();
    }
}
