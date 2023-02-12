package entidades;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;

/**
 *
 * @author Luis
 */
public class Composite implements IProducto{
    String nombreCliente;
    String DNI;
    GregorianCalendar Fecha;
    String Direccion;
    boolean Activo;
    ArrayList<IProducto> listaIProductos=new ArrayList();
    int numproductos;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public GregorianCalendar getFecha() {
        return Fecha;
    }

    public void setFecha(GregorianCalendar Fecha) {
        this.Fecha = Fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<IProducto> getListaIProductos() {
        return listaIProductos;
    }

    public void setListaIProductos(ArrayList<IProducto> listaIProductos) {
        this.listaIProductos = listaIProductos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public boolean isActivo() {
        return Activo;
    }

    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }

    public int getNumproductos() {
        return numproductos;
    }

    public void setNumproductos(int numproductos) {
        this.numproductos = numproductos;
    }
    
    
    
    @Override
    public void añadir(IProducto x) {
        listaIProductos.add(x);
        numproductos++;
    }
    @Override
    public void eliminar(IProducto x) {
        listaIProductos.remove(x);
        numproductos--;
    }
    @Override
    public Iterator crearIterador() {
        return listaIProductos.iterator();
    }

    @Override
    public String getNombreproducto() {
        return "Cliente: "+getNombreCliente();
    }

    @Override
    public double getPreciounitario() {
        Iterator<IProducto> i=listaIProductos.iterator();
        float total=0;
        while(i.hasNext())
            total+=i.next().getPreciounitario();
        return total;}

    @Override
    public String getDescripcion() {
        return "Cliente: "+nombreCliente+".DNI: "+DNI+"";
    }
}
