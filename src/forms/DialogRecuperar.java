
package forms;

public class DialogRecuperar extends javax.swing.JDialog {

    public DialogRecuperar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRecuperarContraseña = new javax.swing.JButton();
        btnVolverRecuperar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTituloInterfazPrincipal1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(410, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRecuperarContraseña.setText("Recuperar Contraseña");
        getContentPane().add(btnRecuperarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        btnVolverRecuperar.setText("Volver");
        btnVolverRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverRecuperarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolverRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jPanel1.setBackground(new java.awt.Color(31, 185, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloInterfazPrincipal1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloInterfazPrincipal1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTituloInterfazPrincipal1.setText("Olvidé mi contraseña");
        lblTituloInterfazPrincipal1.setAlignmentX(0.5F);
        jPanel1.add(lblTituloInterfazPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 390, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Correo:");
        jLabel2.setMaximumSize(new java.awt.Dimension(22, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(22, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(22, 14));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 80, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DNI:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 30));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 170, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 170, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 350, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverRecuperarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnVolverRecuperarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecuperarContraseña;
    private javax.swing.JButton btnVolverRecuperar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblTituloInterfazPrincipal1;
    // End of variables declaration//GEN-END:variables
}
