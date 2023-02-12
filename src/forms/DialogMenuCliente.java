
package forms;

import javax.swing.JOptionPane;

public class DialogMenuCliente extends javax.swing.JDialog {

    public DialogMenuCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTituloInterfazPrincipal1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnComprarMenuCliente = new javax.swing.JButton();
        btnHistorialMenuCliente = new javax.swing.JButton();
        btnActualizarDatosMenuClientes = new javax.swing.JButton();
        btnVolverMenuCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(31, 185, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloInterfazPrincipal1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTituloInterfazPrincipal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloInterfazPrincipal1.setText("Menú Cliente");
        jPanel1.add(lblTituloInterfazPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forms/baseline_collections_black_48dp.png"))); // NOI18N
        jLabel3.setText("Imagen");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel3.setFocusable(false);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 190));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 250, 210));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarMenuCliente.setText("Comprar");
        btnComprarMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarMenuClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnComprarMenuCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        btnHistorialMenuCliente.setText("Historial de compras");
        btnHistorialMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialMenuClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnHistorialMenuCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        btnActualizarDatosMenuClientes.setText("Actualizar Datos (Menu)");
        btnActualizarDatosMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosMenuClientesActionPerformed(evt);
            }
        });
        jPanel2.add(btnActualizarDatosMenuClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        btnVolverMenuCliente.setText("Volver al menú principal");
        btnVolverMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolverMenuCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarMenuClienteActionPerformed
        DialogArticulos x =new DialogArticulos(new javax.swing.JFrame(),true);
        x.setLocationRelativeTo(null);
        x.setTitle("Lista de Artículos");
        x.setVisible(true);
    }//GEN-LAST:event_btnComprarMenuClienteActionPerformed

    private void btnVolverMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuClienteActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVolverMenuClienteActionPerformed

    private void btnHistorialMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialMenuClienteActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Coming Soon","Historial de Compras",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnHistorialMenuClienteActionPerformed

    private void btnActualizarDatosMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosMenuClientesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Coming Soon","Actualizar Datos",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnActualizarDatosMenuClientesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarDatosMenuClientes;
    private javax.swing.JButton btnComprarMenuCliente;
    private javax.swing.JButton btnHistorialMenuCliente;
    private javax.swing.JButton btnVolverMenuCliente;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblTituloInterfazPrincipal1;
    // End of variables declaration//GEN-END:variables
}
