package NoSirve;


import entidades.Producto;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Compra{
    String DNI;
    GregorianCalendar Fecha;
    ArrayList<Producto> productos;
    double MontoTotal;
    String Direccion;
    boolean Activo;
    public Compra(String DNI, GregorianCalendar Fecha, ArrayList<Producto> productos, double MontoTotal, String Direccion, boolean Activo) {
        this.DNI = DNI;
        this.Fecha = Fecha;
        this.productos = productos;
        this.MontoTotal = MontoTotal;
        this.Direccion = Direccion;
        this.Activo = Activo;
    }
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

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getMontoTotal() {
        return MontoTotal;
    }

    public void setMontoTotal(double MontoTotal) {
        this.MontoTotal = MontoTotal;
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
    
    public int getTamaño(){
        return getDNI().length()*2 + getDireccion().length()*2 +1+ 2;
    }
    @Override
    public String toString() {
        return "HistorialCompras{" + "DNI=" + getDNI() + ", Fecha=" + getFecha() + ", productos=" + getProductos() + ", MontoTotal=" + getMontoTotal() + ", Direccion=" + getDireccion() + '}';
    }
    
    
    
    
}
