package entidades;

import java.util.Iterator;

public class Producto implements IProducto{
    private String nombreproducto; 
    private String marca; 
    private String modelo; 
    private String dimensiones; 
    private double preciounitario;
    private int stock; 
    private int categoria; 
    private String codigoproducto; 
    private String lugardefabricacion;
    private String distribuidor; 
    private double peso;
    private boolean Activo;
    public Producto() {
            this("sony psp 4k uhd","sony","psp","13x14x34",23.5,12,0000,"1706fd12","Peru","amazon",23,true);
}
    public Producto(String nombreproducto,String marca, String modelo, String dimensiones, double preciounitario, int stock, int categoria,String codigoproducto, String lugardefabricacion, String distribuidor, double peso, boolean Activo) {
        this.nombreproducto=nombreproducto;
        this.marca = marca;
        this.modelo = modelo;
        this.dimensiones = dimensiones;
        this.preciounitario = preciounitario;
        this.stock = stock;
        this.categoria=categoria;
        this.codigoproducto = codigoproducto;
        this.lugardefabricacion = lugardefabricacion;
        this.distribuidor = distribuidor;
        this.peso = peso;
        this.Activo = Activo;
    }
    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }
    @Override
    public String getNombreproducto() {
        return nombreproducto;
    }
    @Override
    public double getPreciounitario() {
        return preciounitario;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }   
    public String getMarca() {
        return marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }    
    public String getModelo() {
        return modelo;
    }    
    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }
    public String getDimensiones() {
        return dimensiones;
    }   
    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }    
    public int getStock() {
        return stock;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    public int getCategoria() {
        return categoria;
    }   
    public void setCodigoproducto(String codigoproducto) {
        this.codigoproducto = codigoproducto;
    }   
    public String getCodigoproducto() {
        return codigoproducto;
    }
    public void setLugardefabricacion(String lugardefabricacion) {
        this.lugardefabricacion = lugardefabricacion;
    }
    public String getLugardefabricacion() {
        return lugardefabricacion;
    }
    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }
    public String getDistribuidor() {
        return distribuidor;
    }  
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }   
    public void setActivo(boolean Activo) {
        this.Activo = Activo;
    }
    public boolean isActivo() {
        return Activo;
    }
    public int getTamañoProducto(){
        return getNombreproducto().length()*2+getMarca().length()*2 + getModelo().length()*2 + getDimensiones().length()*2 + 8 + 4 + 4 + getCodigoproducto().length()*2 + getLugardefabricacion().length()*2 + getDistribuidor().length()*2 + 4 + 1 + 2 ;
    }
    @Override
    public String toString() {
        return  "Nombre Product" + getNombreproducto() + "Marca=" + getMarca() + ", modelo=" + getModelo() + ", dimensiones=" + getDimensiones() + ", preciounitario=" + getPreciounitario() + ", stock=" + getStock() + "categoria"+ getCategoria() + ",codigoproducto=" + getCodigoproducto() + ", lugardefabricacion=" + getLugardefabricacion() + ", distribuidor=" + getDistribuidor() + ", peso=" + getPeso() + ", isActivo=" + isActivo() + '}';
    }
    @Override
    public void añadir(IProducto x) {}
    @Override
    public void eliminar(IProducto x) {}
    @Override
    public Iterator crearIterador() {
        return null;
    } 
    @Override
    public String getDescripcion() {
        return "Descripcion: "+"Marca: "+marca+" .Modelo: "+modelo+" .Dimensiones: "+dimensiones+" .Lugar de fabricación: "+lugardefabricacion+" .Distribuidor: "+distribuidor+". Peso: "+peso;
    }
}