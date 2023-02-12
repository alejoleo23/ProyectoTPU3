package forms;

import entidades.AccesoAleatorio;
import entidades.AccesoAleatorioProducto;
import entidades.Compra;
import entidades.IProducto;
import entidades.Producto;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class DialogArticulos extends javax.swing.JDialog {

    public DialogArticulos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIralcarritoDialogArticulos = new javax.swing.JButton();
        btnSaliralMenuDialogArticulos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTituloInterfazPrincipal2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbArticulos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProductos = new javax.swing.JList<>();
        btnBoton1 = new javax.swing.JButton();
        btnBoton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblImagenProduto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPrecioUnitario = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        spnCantidadDialogArticulos = new javax.swing.JSpinner();
        btnAñadiralcarritoDialogArticulos = new javax.swing.JButton();
        lblValoracion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtValoración = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPrecioUnitario = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDescripcionProducto = new javax.swing.JTextPane();
        btnAñadirListaDeseos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 480));
        setName("DialogRecibo"); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIralcarritoDialogArticulos.setText("Ir al carrito");
        btnIralcarritoDialogArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIralcarritoDialogArticulosActionPerformed(evt);
            }
        });
        getContentPane().add(btnIralcarritoDialogArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, -1));

        btnSaliralMenuDialogArticulos.setText("Salir al Menú");
        btnSaliralMenuDialogArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaliralMenuDialogArticulosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaliralMenuDialogArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, -1, -1));

        jPanel1.setBackground(new java.awt.Color(31, 185, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloInterfazPrincipal2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTituloInterfazPrincipal2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTituloInterfazPrincipal2.setText("Lista de Productos");
        jPanel1.add(lblTituloInterfazPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Productos"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Categoria:");
        jLabel2.setEnabled(false);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        cmbArticulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione categoria", "Accesorios y suministros", "Camara y fotografia", "Coches y vehículos electrónicos", "Computadoras y accesorios", "Auriculares", "Audio en casa", "Audio y video portatil", "TV y video" }));
        cmbArticulos.setEnabled(false);
        cmbArticulos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbArticulosItemStateChanged(evt);
            }
        });
        jPanel2.add(cmbArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 180, -1));

        lstProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lstProductos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Lista de Productos" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstProductos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstProductosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstProductos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 370, 350));

        btnBoton1.setText("Buscar");
        btnBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoton1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        btnBoton2.setText("Opcion2");
        jPanel2.add(btnBoton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 390, 430));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles del Producto"));

        lblImagenProduto.setBackground(new java.awt.Color(255, 255, 255));
        lblImagenProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forms/baseline_collections_black_48dp.png"))); // NOI18N
        lblImagenProduto.setText("Imagen");
        lblImagenProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblImagenProduto.setFocusable(false);

        jLabel4.setText("Descripción del producto:");

        lblPrecioUnitario.setText("Precio Unitario");

        lblCantidad.setText("Cantidad");

        spnCantidadDialogArticulos.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        btnAñadiralcarritoDialogArticulos.setText("Añadir al carrito");

        lblValoracion.setText("Valoración:");

        txtValoración.setFocusable(false);
        jScrollPane2.setViewportView(txtValoración);

        txtPrecioUnitario.setFocusable(false);
        jScrollPane3.setViewportView(txtPrecioUnitario);

        txtDescripcionProducto.setFocusable(false);
        jScrollPane4.setViewportView(txtDescripcionProducto);

        btnAñadirListaDeseos.setText("Añadir a la lista de deseos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImagenProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblValoracion)
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblPrecioUnitario)
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblCantidad)
                                .addGap(87, 87, 87)
                                .addComponent(spnCantidadDialogArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btnAñadiralcarritoDialogArticulos))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnAñadirListaDeseos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblImagenProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValoracion)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecioUnitario)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantidad)
                            .addComponent(spnCantidadDialogArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(btnAñadiralcarritoDialogArticulos)
                        .addGap(17, 17, 17)
                        .addComponent(btnAñadirListaDeseos)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 470, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIralcarritoDialogArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIralcarritoDialogArticulosActionPerformed
        // TODO add your handling code here:
        DialogRecibo x =new DialogRecibo(new javax.swing.JFrame(),true);
        x.setLocationRelativeTo(null);
        x.setTitle("Finalizar Compra");
        x.setVisible(true);
    }//GEN-LAST:event_btnIralcarritoDialogArticulosActionPerformed

    private void btnSaliralMenuDialogArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaliralMenuDialogArticulosActionPerformed
        dispose();
    }//GEN-LAST:event_btnSaliralMenuDialogArticulosActionPerformed

    private void lstProductosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstProductosValueChanged
        String DIR_IMG="src\\images\\producto\\";
        rsscalelabel.RSScaleLabel.setScaleLabel(lblImagenProduto,DIR_IMG+String.format("%03d",(lstProductos.getSelectedIndex()+1))+".jpg");
        Producto get = (Producto) y.get(lstProductos.getSelectedIndex()+1);
        txtPrecioUnitario.setText(String.valueOf(get.getPreciounitario()));
        txtDescripcionProducto.setText(get.getDescripcion());
        txtValoración.setText("    5 estrellas");
//        IProducto producto= 
    }//GEN-LAST:event_lstProductosValueChanged

    private void btnBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoton1ActionPerformed
        // TODO add your handling code here:
//        AccesoAleatorio AccProducto=new AccesoAleatorioProducto();
//        String codigopro = txtBusqueda.getText().trim();
//        if(codigopro.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "¡No se ingreso el nombre de la persona!", "Advertencia", JOptionPane.WARNING_MESSAGE);
//            return;
//        } 
//        AccProducto.crearFile( new File("producto.txt") );
//        int i = AccProducto.buscarRegistro( codigopro );
//        if(i==-1) {
//            JOptionPane.showMessageDialog(this, "Ningún registro coincide con los datos de búsqueda.", "Advertencia", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        JOptionPane.showMessageDialog(this, "La primera coincidencia indica: "+AccProducto.get(i), "Notificación", JOptionPane.INFORMATION_MESSAGE);
//        AccProducto.cerrar();
    }//GEN-LAST:event_btnBoton1ActionPerformed

    private void cmbArticulosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbArticulosItemStateChanged
////////////                AccesoAleatorio AccProducto=new AccesoAleatorioProducto();
////////////        AccProducto.crearFile(new File("producto.txt"));
////////////        DefaultListModel x=new DefaultListModel();
////////////        if(evt.getStateChange()==ItemEvent.SELECTED){
////////////            if(cmbArticulos.getSelectedIndex()>0){
////////////                Producto c;
////////////                for(int i=0;i<80;i++){
////////////                    c=(Producto)AccProducto.get(i);
////////////                    x.addElement(c.getNombreproducto());
////////////                    //if(String.format("%03d",(lstProductos.getSelectedIndex()+1))==c.getCodigoproducto())
////////////                    //{datos[z]=((Producto)AccProducto.get(i)).getNombreproducto();
////////////                    //z++;}
////////////                }
//////////////                datos=AccProducto.buscarRegistro2(String.format("%03d",(lstProductos.getSelectedIndex()+1)));
////////////                //datos=AccProducto.buscarRegistro2(lstProductos.getSelectedIndex());
//////////////                cmbArticulos.setModel(new DefaultComboBoxModel(datos));
////////////                lstProductos.setModel(x);
//////////////lstProductos.setModel(new DefaultComboBoxModel(datos));
////////////                AccProducto.cerrar();
////////////            }
////////////        }
    }//GEN-LAST:event_cmbArticulosItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        // TODO add your handling code here:
        AccesoAleatorio AccProducto=new AccesoAleatorioProducto();
        AccProducto.crearFile(new File("producto.txt"));
                Producto c;
                for(int i=0;i<80;i++){
                    c=(Producto)AccProducto.get(i);
                    y.addElement(c);
                    x.addElement(c.getNombreproducto());
                }
                    //if(String.format("%03d",(lstProductos.getSelectedIndex()+1))==c.getCodigoproducto())
                    //{datos[z]=((Producto)AccProducto.get(i)).getNombreproducto();
                    //z++;}
                
//                datos=AccProducto.buscarRegistro2(String.format("%03d",(lstProductos.getSelectedIndex()+1)));
                //datos=AccProducto.buscarRegistro2(lstProductos.getSelectedIndex());
//                cmbArticulos.setModel(new DefaultComboBoxModel(datos));
                lstProductos.setModel(x);
//lstProductos.setModel(new DefaultComboBoxModel(datos));
                AccProducto.cerrar();
            
        
    }//GEN-LAST:event_formWindowOpened
    DefaultListModel x=new DefaultListModel();
    DefaultListModel y=new DefaultListModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirListaDeseos;
    private javax.swing.JButton btnAñadiralcarritoDialogArticulos;
    private javax.swing.JButton btnBoton1;
    private javax.swing.JButton btnBoton2;
    private javax.swing.JButton btnIralcarritoDialogArticulos;
    private javax.swing.JButton btnSaliralMenuDialogArticulos;
    private javax.swing.JComboBox<String> cmbArticulos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblImagenProduto;
    private javax.swing.JLabel lblPrecioUnitario;
    private javax.swing.JLabel lblTituloInterfazPrincipal2;
    private javax.swing.JLabel lblValoracion;
    private javax.swing.JList<String> lstProductos;
    private javax.swing.JSpinner spnCantidadDialogArticulos;
    private javax.swing.JTextPane txtDescripcionProducto;
    private javax.swing.JTextPane txtPrecioUnitario;
    private javax.swing.JTextPane txtValoración;
    // End of variables declaration//GEN-END:variables

}
