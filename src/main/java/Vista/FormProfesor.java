
package Vista;

import Controlador.ControladorProfesor;
import javax.swing.JOptionPane;

public class FormProfesor extends javax.swing.JFrame {
    
   private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormProfesor.class.getName());
    private Profesores_Datos vistaAnterior;
    private ControladorProfesor controller = new ControladorProfesor();
    
    FormProfesor() {
        initComponents();
    }
    
    public FormProfesor(Profesores_Datos vista) {
        initComponents();
        this.vistaAnterior = vista;
        setLocationRelativeTo(null);
        this.setTitle("Agregar Profesor");
    }


    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BGMatricula = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(670, 596));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setMinimumSize(new java.awt.Dimension(670, 620));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnAgregar.setText("REGISTRAR PROFESOR");
        btnAgregar.addActionListener(this::btnAgregarActionPerformed);
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 230, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\logo50sinfondo.png")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 110));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("REGISTAR PROFESOR");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDireccion.addActionListener(this::txtDireccionActionPerformed);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 190, -1));

        txtTelefono.addActionListener(this::txtTelefonoActionPerformed);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 190, -1));

        txtCorreo.addActionListener(this::txtCorreoActionPerformed);
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 190, -1));

        txtApellido.addActionListener(this::txtApellidoActionPerformed);
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 190, -1));

        txtNombre.addActionListener(this::txtNombreActionPerformed);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 190, -1));

        txtDni.addActionListener(this::txtDniActionPerformed);
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 190, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel13.setText("DNI:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 45, 25));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel7.setText("Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 70, 25));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setText("Apellido:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 70, 25));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel9.setText("Correo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 60, 25));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel10.setText("Dirección:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 80, 25));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel3.setText("Teléfono:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 80, 25));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel11.setText("DATOS DEL PROFESOR");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\Profesor2.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 70));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 370, 370));

        BGMatricula.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\Fondo.png")); // NOI18N
        jPanel2.add(BGMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 670, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Validar campos vacíos
        if (txtDni.getText().trim().isEmpty() || 
            txtNombre.getText().trim().isEmpty() || 
            txtApellido.getText().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Complete al menos DNI, Nombre y Apellido.", 
                "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Crear objeto Profesor
        Modelo.Profesor profesor = new Modelo.Profesor(
            txtDni.getText().trim(),
            txtNombre.getText().trim(),
            txtApellido.getText().trim(),
            txtCorreo.getText().trim(),
            txtDireccion.getText().trim(),
            txtTelefono.getText().trim()
        );

        // Agregar a través del controlador
        if (controller.agregarProfesor(profesor, vistaAnterior)) {
            vistaAnterior.cargarDatos();
            this.dispose();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormProfesor(null).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGMatricula;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
