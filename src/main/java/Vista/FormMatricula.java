
package Vista;

import Modelo.Alumno;
import Modelo.ClaseCompleta;
import Modelo.DAO.ClaseCompletaDAO;
import Modelo.Usuario;
import Modelo.Matricula;
import Modelo.dao.AlumnoDAO;
import Modelo.dao.MatriculaDAO;
import Controlador.ControladorMatricula;
import javax.swing.JOptionPane;

public class FormMatricula extends javax.swing.JFrame {
    private Usuario usuarioLogueado;
    private ControladorMatricula controller = new ControladorMatricula();
    private String dniAlumnoSeleccionado;
    
    ClaseCompletaDAO cb = new ClaseCompletaDAO();
    
    MatriculaDAO matriculaDAO = new MatriculaDAO();
    
    
    public FormMatricula() {
        initComponents();
        
    }

    public FormMatricula(Usuario usuario) {
        initComponents();
        this.usuarioLogueado = usuario;
        setLocationRelativeTo(null);
        cb.RellenarCB("CLASES", "id_clase", cbClase);
    }
    
        private void limpiarFormulario() {
        txtBuscarDni.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        dniAlumnoSeleccionado = null;
        cbTipoPago.setSelectedIndex(0);
        cbClase.setSelectedIndex(0);
        jdcFechaPago.setDate(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbClase = new javax.swing.JComboBox<>();
        txtDescripcion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtHorario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtPago = new javax.swing.JTextField();
        txtProfesor = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnAgregarMatricula = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cbTipoPago = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jdcFechaPago = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtBuscarDni = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        BGMatricula = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras.setText("<");
        btnAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 59, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("AGREGAR MATRICULA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\logo50sinfondo.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 110));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\pizarra.png")); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setText("DESCRIPCION:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 25));

        cbClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClaseActionPerformed(evt);
            }
        });
        jPanel4.add(cbClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 190, -1));

        txtDescripcion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel4.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 280, 50));

        jLabel15.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel15.setText("HORARIO:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 25));

        txtHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioActionPerformed(evt);
            }
        });
        jPanel4.add(txtHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 190, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel16.setText("PAGO:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, 25));

        jLabel17.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel17.setText("PROFESOR:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 80, 25));

        txtPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagoActionPerformed(evt);
            }
        });
        jPanel4.add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, -1));

        txtProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfesorActionPerformed(evt);
            }
        });
        jPanel4.add(txtProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 190, -1));

        jLabel22.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel22.setText("CLASE:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 25));

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel23.setText("ASIGNACION DE CLASES");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 320, 380));

        btnAgregarMatricula.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnAgregarMatricula.setText("AGREGAR MATRICULA");
        btnAgregarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMatriculaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 310, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setText("INFORMACION DEL PAGO");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\tarjeta-de-debito.png")); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        cbTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YAPE", "EFECTIVO", "TARJETA" }));
        cbTipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoPagoActionPerformed(evt);
            }
        });
        jPanel3.add(cbTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 140, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel14.setText("FECHA DEL PAGO:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 25));

        jLabel21.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel21.setText("TIPO DE PAGO:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 25));
        jPanel3.add(jdcFechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 140, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 310, 180));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel20.setText("APELLIDO:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, 25));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel18.setText("BUSCAR ALUMNO");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\nota-adhesiva.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel24.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel24.setText("DNI:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 40, 25));

        jLabel25.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel25.setText("NOMBRE:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, 25));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 180, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, -1));

        txtBuscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarDniActionPerformed(evt);
            }
        });
        jPanel2.add(txtBuscarDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 140, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\buscar.png")); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 310, 210));

        BGMatricula.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\iws\\src\\main\\java\\img\\Fondo.png")); // NOI18N
        jPanel1.add(BGMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, 1000, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        controller.retrocederADatosMatricula(this, usuarioLogueado);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAgregarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMatriculaActionPerformed
        if (dniAlumnoSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Debe buscar un alumno antes de registrar la matrícula.");
            return;
        }

        boolean ok = matriculaDAO.registrarMatriculaCompleta(
                dniAlumnoSeleccionado,  
                cbTipoPago.getSelectedItem().toString(),
                new java.sql.Date(jdcFechaPago.getDate().getTime()),
                cbClase.getSelectedItem().toString(),
                usuarioLogueado.getIdUsuario()
        );

        if (ok) {
            JOptionPane.showMessageDialog(this, "Matrícula registrada correctamente");
            limpiarFormulario();
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar matrícula");
        }
    }//GEN-LAST:event_btnAgregarMatriculaActionPerformed

    private void txtProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfesorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfesorActionPerformed

    private void txtPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagoActionPerformed

    private void txtHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void cbClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClaseActionPerformed

        String idSeleccionado = (String) cbClase.getSelectedItem();
        if (idSeleccionado == null || idSeleccionado.isEmpty()) return;

        ClaseCompleta datos = cb.obtenerDatosClaseCompleta(idSeleccionado);

        if (datos != null) {
            txtHorario.setText(datos.getHorario());
            txtPago.setText(String.valueOf(datos.getMensualidad()));
            txtDescripcion.setText(datos.getDescripcion());
            txtProfesor.setText(datos.getNombreProfesor());
        }
    }//GEN-LAST:event_cbClaseActionPerformed

    private void cbTipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoPagoActionPerformed

    private void txtBuscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarDniActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String dni = txtBuscarDni.getText();

        AlumnoDAO alumnoDAO = new AlumnoDAO();
        Alumno alumno = alumnoDAO.buscarPorDni(dni);

        if (alumno != null) {
            txtNombre.setText(alumno.getNombre());
            txtApellido.setText(alumno.getApellido());
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró un alumno con ese DNI");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FormMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMatricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGMatricula;
    private javax.swing.JButton btnAgregarMatricula;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbClase;
    private javax.swing.JComboBox<String> cbTipoPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private com.toedter.calendar.JDateChooser jdcFechaPago;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscarDni;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtProfesor;
    // End of variables declaration//GEN-END:variables
}
