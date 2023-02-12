package forms;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InterfazPrincipal extends javax.swing.JFrame {

    public InterfazPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloInterfazPrincipal1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnInformeError = new javax.swing.JButton();
        btnSalirPrincipal = new javax.swing.JButton();
        btnOlvidoContra = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(31, 185, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloInterfazPrincipal1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloInterfazPrincipal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloInterfazPrincipal1.setText("Sistema de compras");
        jPanel1.add(lblTituloInterfazPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Menú"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setText("Login");
        btnLogin.setMargin(new java.awt.Insets(20, 30, 20, 30));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 30));

        btnRegister.setText("Register");
        btnRegister.setMargin(new java.awt.Insets(20, 30, 20, 30));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 30));

        btnInformeError.setText("Informe de error");
        btnInformeError.setToolTipText("");
        btnInformeError.setMargin(new java.awt.Insets(20, 30, 20, 30));
        btnInformeError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeErrorActionPerformed(evt);
            }
        });
        jPanel2.add(btnInformeError, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 30));

        btnSalirPrincipal.setText("Salir");
        btnSalirPrincipal.setMargin(new java.awt.Insets(20, 30, 20, 30));
        btnSalirPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirPrincipalActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalirPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, 30));

        btnOlvidoContra.setText("Olvidé mi contraseña");
        btnOlvidoContra.setActionCommand("");
        btnOlvidoContra.setMargin(new java.awt.Insets(20, 30, 20, 30));
        btnOlvidoContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvidoContraActionPerformed(evt);
            }
        });
        jPanel2.add(btnOlvidoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 30));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 470, 170));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 292, 210));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forms/baseline_collections_black_48dp.png"))); // NOI18N
        jLabel3.setText("Imagen Proyecto");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel3.setFocusable(false);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 190));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 250, 210));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private JFrame getFrame(){
        return this;
    }
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        DialogRegistrarse x =new DialogRegistrarse(new javax.swing.JFrame(),true){
            //Con esto cuando llamemos a dispose de vNueva abrimos la principal
            @Override
            public void dispose(){
                //Hacemos visible la principal
                getFrame().setVisible(true);
                //Cerramos vNueva
                super.dispose();
            }
        };
        //Hacemos visible a vNueva
        x.setLocationRelativeTo(null);
        x.setTitle("Registro");
        this.setVisible(false);
        x.setVisible(true);
        //Cerramos la principal
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnOlvidoContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvidoContraActionPerformed
        // TODO add your handling code here:
        DialogRecuperar x =new DialogRecuperar(new javax.swing.JFrame(),true);
        x.setLocationRelativeTo(null);
        x.setTitle("Recuperar Contraseña");
        x.setVisible(true);
        
    }//GEN-LAST:event_btnOlvidoContraActionPerformed

    private void btnInformeErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeErrorActionPerformed
        // TODO add your handling code here:
        DialogError x =new DialogError(new javax.swing.JFrame(),true);
                x.setLocationRelativeTo(null);
        x.setTitle("Reporte Error");
        x.setVisible(true);
    }//GEN-LAST:event_btnInformeErrorActionPerformed

    private void btnSalirPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirPrincipalActionPerformed
        String[] options = {"Si","Nel"};
        int x = JOptionPane.showOptionDialog(null, "Desea cerrar el programa :v?","Salir",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if(x==0)
            System.exit(0);
    }//GEN-LAST:event_btnSalirPrincipalActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        DialogLogin x =new DialogLogin(new javax.swing.JFrame(),true){
            //Con esto cuando llamemos a dispose de vNueva abrimos la principal
            @Override
            public void dispose(){
                //Hacemos visible la principal
                getFrame().setVisible(true);
                //Cerramos vNueva
                super.dispose();
            }
        };
        //Hacemos visible a vNueva
        x.setLocationRelativeTo(null);
        x.setTitle("LoGIN");
        this.setVisible(false);
        x.setVisible(true);
        //Cerramos la principal
    }//GEN-LAST:event_btnLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInformeError;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnOlvidoContra;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnSalirPrincipal;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblTituloInterfazPrincipal1;
    // End of variables declaration//GEN-END:variables
}
