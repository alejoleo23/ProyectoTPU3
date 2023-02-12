
package forms;

import javax.swing.JOptionPane;

public class DialogError extends javax.swing.JDialog {

    public DialogError(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblEmailDialogError = new javax.swing.JLabel();
        txtEmailError = new javax.swing.JTextField();
        btnEnviarError = new javax.swing.JButton();
        btnVolverError = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTituloInterfazPrincipal1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("¿En que podemos ayudarle?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 340, 20));

        lblEmailDialogError.setText("Email");
        getContentPane().add(lblEmailDialogError, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));
        getContentPane().add(txtEmailError, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 320, -1));

        btnEnviarError.setLabel("Enviar");
        btnEnviarError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarErrorActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviarError, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        btnVolverError.setLabel("Volver");
        btnVolverError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverErrorActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolverError, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        jPanel1.setBackground(new java.awt.Color(31, 185, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloInterfazPrincipal1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloInterfazPrincipal1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTituloInterfazPrincipal1.setText("Informe de Errores");
        jPanel1.add(lblTituloInterfazPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 590, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        jLabel2.setText("Brindenos una dirección de correo electrónico para poder comuncarnos con usted:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 480, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverErrorActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverErrorActionPerformed

    private void btnEnviarErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarErrorActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Solicitud Enviada","Informe de Errores",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnEnviarErrorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarError;
    private javax.swing.JButton btnVolverError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblEmailDialogError;
    private javax.swing.JLabel lblTituloInterfazPrincipal1;
    private javax.swing.JTextField txtEmailError;
    // End of variables declaration//GEN-END:variables
}
