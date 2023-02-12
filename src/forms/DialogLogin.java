
package forms;

import entidades.AccesoAleatorio;
import entidades.AccesoAleatorioCliente;
import entidades.AccesoAleatorioProducto;
import entidades.Cliente;
import entidades.Producto;
import static entidades.Validaciones.*;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
public class DialogLogin extends javax.swing.JDialog {
    public DialogLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoginLogin = new javax.swing.JButton();
        btnAtrasLogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTituloInterfazPrincipal1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnOlvidoContra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLoginLogin.setText("Login");
        btnLoginLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoginLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        btnAtrasLogin.setText("Volver");
        btnAtrasLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtrasLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        jPanel1.setBackground(new java.awt.Color(31, 185, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloInterfazPrincipal1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloInterfazPrincipal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloInterfazPrincipal1.setText("Inicio de sesión");
        jPanel1.add(lblTituloInterfazPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Inicio de sesión"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DNI");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setText("Password");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });
        jPanel3.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 160, -1));
        jPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 160, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 310, 120));

        btnOlvidoContra.setBackground(new java.awt.Color(255, 255, 255));
        btnOlvidoContra.setText("Olvidé mi contraseña");
        btnOlvidoContra.setMargin(new java.awt.Insets(20, 30, 20, 30));
        btnOlvidoContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvidoContraActionPerformed(evt);
            }
        });
        getContentPane().add(btnOlvidoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 200, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forms/baseline_person_black_48dp.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 210, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private JDialog getFrame(){
        return this;
    }
    private void btnLoginLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginLoginActionPerformed
        //if(txtDNI.getText() == null ? txtPassword.getText() == null : txtDNI.getText().equals(txtPassword.getText()))
        {
            //VALIDACION DE LOGIN
            
            
            AccesoAleatorio archivo=new AccesoAleatorioCliente();
            archivo.crearFile( new File("Clientes.txt") );
            String DNI=txtDNI.getText();
            String pswrd=String.valueOf(txtPassword.getPassword()),pswrd2=null;
                Cliente c;
                for(int i=0;i<archivo.getNumeroRegistros();i++){
                    c=(Cliente)archivo.get(i);
                    int j=archivo.buscarRegistro(DNI);
                    if(j!=-1)
                        pswrd2=c.getPassword();
                }
                archivo.cerrar();
                if(pswrd == null ? pswrd2 == null : pswrd.equals(pswrd2)){
                    JOptionPane.showMessageDialog(null,"Inicio de sesión correcto","Inicio de Sesión",JOptionPane.INFORMATION_MESSAGE);
            DialogMenuCliente x =new DialogMenuCliente(new javax.swing.JFrame(),true);
            x.setLocationRelativeTo(null);
            x.setTitle("Lista de Artículos");
            this.dispose();
            x.setVisible(true);}
        }
    }//GEN-LAST:event_btnLoginLoginActionPerformed

    private void btnAtrasLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasLoginActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAtrasLoginActionPerformed

    private void btnOlvidoContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvidoContraActionPerformed
        // TODO add your handling code here:
        DialogRecuperar x =new DialogRecuperar(new javax.swing.JFrame(),true);
        x.setLocationRelativeTo(null);
        x.setTitle("Recuperar Contraseña");
        x.setVisible(true);

    }//GEN-LAST:event_btnOlvidoContraActionPerformed

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        ValidarNumeroEntero(evt);    
    }//GEN-LAST:event_txtDNIKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasLogin;
    private javax.swing.JButton btnLoginLogin;
    private javax.swing.JButton btnOlvidoContra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblTituloInterfazPrincipal1;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
