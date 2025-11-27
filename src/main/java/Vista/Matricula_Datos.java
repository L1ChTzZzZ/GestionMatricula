package Vista;

import Controlador.ControladorMatricula;
import javax.swing.table.DefaultTableModel;
import Modelo.Cconexion;
import Modelo.Matricula;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class Matricula_Datos extends javax.swing.JFrame {
    private Usuario usuarioLogueado;
    private ControladorMatricula controller = new ControladorMatricula();

    public Matricula_Datos() {
        initComponents();
        mostrarDatosEnVisor("MATRICULA");
        this.setLocationRelativeTo(null);
        this.setTitle("Matriculas");
        this.setTitle("Gestión de Matricula");
    }
    
    public Matricula_Datos(Usuario usuario) {
        initComponents();
        this.usuarioLogueado = usuario; 
        mostrarDatosEnVisor("MATRICULA"); 
        this.setLocationRelativeTo(null);
        this.setTitle("Gestión de Matricula");
    }
        public Modelo.Usuario getUsuarioLogueado() {
        return this.usuarioLogueado;
    }
        
        

    public void mostrarDatosEnVisor(String tabla) {
        DefaultTableModel modeloConDatos = controller.cargarDatosMatricula(tabla);
        visor.setModel(modeloConDatos);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        visor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        visor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(visor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 818, 410));

        jButton2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton2.setText("REFRESCAR");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 150, 80));

        btnAtras.setText("<");
        btnAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 59, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("GESTION DE MATRICULAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\logo50sinfondo.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 110));

        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, 150, 80));

        btnModificar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 150, 80));

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, 150, 80));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\Fondo.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -580, -1, -1));
        jLabel4.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrarDatosEnVisor("MATRICULA");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        controller.retrocederAMenu(this, usuarioLogueado);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int filaSeleccionada = visor.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String idMatricula = visor.getValueAt(filaSeleccionada, 0).toString();
        controller.eliminarMatricula(idMatricula, this);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
           int filaSeleccionada = visor.getSelectedRow();
    
    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar una fila para modificar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    // 1. Obtener los valores editados directamente de la tabla (visor)
    
    // Asumimos que el ID (Columna 0) no es editable
    String id = visor.getValueAt(filaSeleccionada, 0).toString();
    
    // Obtener los demás valores de las celdas (ya editados por el usuario)
    String fecha = visor.getValueAt(filaSeleccionada, 1).toString();
    String montoStr = visor.getValueAt(filaSeleccionada, 2).toString();
    String tipoPago = visor.getValueAt(filaSeleccionada, 3).toString();
    String idUsuario = visor.getValueAt(filaSeleccionada, 4).toString();
    String dniAlumno = visor.getValueAt(filaSeleccionada, 5).toString();
    String idClase = visor.getValueAt(filaSeleccionada, 6).toString();
    
    // Variables para conversión
    double monto = 0.0;
    java.sql.Date fechaPagoSQL = null;

    // 2. Conversión de Monto (String a double)
    try {
        monto = Double.parseDouble(montoStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El 'Monto total' debe ser un número válido en la tabla.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // 3. Conversión de Fecha (String a java.sql.Date)
    try {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
        java.util.Date parsedDate = format.parse(fecha);
        fechaPagoSQL = new java.sql.Date(parsedDate.getTime());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "El formato de fecha en la tabla es incorrecto (use AAAA-MM-DD).", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // 4. Crear el objeto Matricula
    Modelo.Matricula matriculaModificada = new Modelo.Matricula(
        id, fechaPagoSQL, monto, tipoPago, idUsuario, dniAlumno, idClase
    );

    // 5. Delegar la acción al controlador
    controller.modificarMatricula(matriculaModificada, this);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
            FormMatricula formulario = new FormMatricula(usuarioLogueado);
            formulario.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Matricula_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matricula_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matricula_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matricula_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matricula_Datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables
}
