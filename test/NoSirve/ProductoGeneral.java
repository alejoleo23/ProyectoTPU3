package NoSirve;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Iterator;

/**
 *
 * @author Luis
 */
public class ProductoGeneral{
    //HOJA
    String nombre;
    float precioNeto;
    //Otros
////    String marca;
////    String modelo;
////    String dimensiones;
////    double preciounitario;
////    int stock;
////    String codigoproducto;
////    String lugardefabricacion;
////    String distribuidor;
////    double peso;
////    boolean Activo;

    public ProductoGeneral(String nombre, float precioNeto) {
        this.nombre = nombre;
        this.precioNeto = precioNeto;
    }

    public String getNombre() {
        return "Minicomponente";
    }

    public float getPrecioNeto() {
        return precioNeto;
    }

//    public void añadir(IProducto x) {}
//
//    public void eliminar(IProducto x) {}

    public Iterator crearIterador() {
        return null;
    }
}
