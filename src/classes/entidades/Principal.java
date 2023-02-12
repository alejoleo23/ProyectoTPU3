package classes.entidades;

import forms.InterfazPrincipal;

public class Principal {

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
            }
        });
    
//////    IProducto cliente= new Compra("Alejo","12345678",new GregorianCalendar(2018,12,17),"Av. :v",true,0);
//////    IProducto producto=new Producto("sony psp 4k uhd","sony","psp","13x14x34",23.5,12,0000,"1706fd12","Peru","amazon",23,true);
//////    IProducto dvd=new Producto("Otra TV","sony","psp","13x14x34",23.5,12,0000,"1706fd12","Peru","amazon",23,true);
//////    cliente.añadir(producto);
//////    cliente.añadir(dvd);
//////    System.out.println(cliente.getPreciounitario());
//////    System.out.println(producto.getPreciounitario());
//////    }
    //Gregorian 640, compra 1512
    }
}
