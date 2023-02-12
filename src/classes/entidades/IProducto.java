/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.entidades;

import java.util.*;

/**
 *
 * @author Luis
 */
public interface IProducto {
    public String getNombreproducto();
    public double getPreciounitario();
    public String getDescripcion();
    //Añadir los get que faltan
    public void añadir(IProducto x);
    public void eliminar(IProducto x);
    public Iterator crearIterador();
}
