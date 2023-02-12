/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.entidades;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class AccesoAleatorioCompra extends AccesoAleatorio{
    private static RandomAccessFile  flujo;
    private static int numeroRegistros;
    private static final int tamañoRegistro = 80;  
    @Override
    public void crearFile(File archivo){
        try {
            if (!archivo.exists() || archivo.isFile())//Pregunta si el archivo existe y que sea un archivo
            {
                flujo = new RandomAccessFile(archivo, "rw");// Crea un archivo paralectura y escritura
            
            numeroRegistros = (int) Math.ceil(
                    (double) flujo.length() / (double) tamañoRegistro);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoAleatorioCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccesoAleatorioCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
      public boolean set(int i,Object compra){
           if(i >= 0 && i <= getNumeroRegistros()) {
            if(((Compra)compra).getTamaño()> tamañoRegistro) {
                System.out.println("\nTamaño de registro excedido.");
            } else {
                try {
                    flujo.seek(i*tamañoRegistro);
                    flujo.writeUTF(((Compra)compra).getNombreCliente());
                    flujo.writeUTF(((Compra)compra).getDNI());
                    flujo.writeInt(((Compra)compra).getAño());
                    flujo.writeInt(((Compra)compra).getMes());
                    flujo.writeInt(((Compra)compra).getDia());
                    flujo.writeUTF(((Compra)compra).getDireccion());
                    flujo.writeBoolean(((Compra)compra).isActivo());
                    flujo.writeInt(((Compra)compra).getNumproductos());
                    //Guardas los produtos
                    for(int j=0;j<((Compra)compra).listaIProductos.size();j++){
                        flujo.writeUTF(((Producto)((Compra)compra).listaIProductos.get(j)).getMarca());
                        flujo.writeUTF(((Producto)((Compra)compra).listaIProductos.get(j)).getNombreproducto());
                        flujo.writeUTF(((Producto)((Compra)compra).listaIProductos.get(j)).getMarca());
                        flujo.writeUTF(((Producto)((Compra)compra).listaIProductos.get(j)).getModelo());
                        flujo.writeUTF(((Producto)((Compra)compra).listaIProductos.get(j)).getDimensiones());
                        flujo.writeDouble(((Producto)((Compra)compra).listaIProductos.get(j)).getPreciounitario());
                        flujo.writeInt(((Producto)((Compra)compra).listaIProductos.get(j)).getStock());
                         flujo.writeInt(((Producto)((Compra)compra).listaIProductos.get(j)).getCategoria());
                        flujo.writeUTF(((Producto)((Compra)compra).listaIProductos.get(j)).getCodigoproducto());
                        flujo.writeUTF(((Producto)((Compra)compra).listaIProductos.get(j)).getLugardefabricacion());
                         flujo.writeUTF(((Producto)((Compra)compra).listaIProductos.get(j)).getDistribuidor());
                        flujo.writeDouble(((Producto)((Compra)compra).listaIProductos.get(j)).getPeso());
                        flujo.writeBoolean(((Producto)((Compra)compra).listaIProductos.get(j)).isActivo());
                    }
                    return true;
                } catch (IOException ex) {
                    Logger.getLogger(AccesoAleatorioCompra.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            System.out.println("\nNúmero de registro fuera de límites.");
        }
        return false;
    }        
    @Override
      public Compra get(int i){
        if(i >= 0 && i <= getNumeroRegistros()) {
            try {
                flujo.seek(i * tamañoRegistro);
                IProducto x = new Compra(flujo.readUTF(), flujo.readUTF(), new GregorianCalendar(flujo.readInt(),flujo.readInt()-1,flujo.readInt()),flujo.readUTF(),flujo.readBoolean(),flujo.readInt());
                for(int j=0;j<((Compra)x).getNumproductos();j++){
                    x.añadir(new Producto(flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(), flujo.readDouble(), flujo.readInt(),flujo.readInt(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readDouble(),flujo.readBoolean()));
                return (Compra)x;
                }
            } catch (IOException ex) {
                Logger.getLogger(AccesoAleatorioCompra.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("\nNúmero de registro fuera de límites.");
            return null;
        }
        return null;
    }
    @Override
      public void cerrar() {
        try {
            flujo.close();
        } catch (IOException ex) {
            Logger.getLogger(AccesoAleatorioCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public int getNumeroRegistros() {
        return numeroRegistros;
    }
    @Override
    public int buscarRegistroInactivo() {
        for(int i=0; i<getNumeroRegistros(); i++) 
        {
            try {
                flujo.seek(i * tamañoRegistro);
                if(!get(i).isActivo())
                    return i;
            } catch (IOException ex) {
                Logger.getLogger(AccesoAleatorioProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1;        
    }
    @Override
    public boolean eliminar(String aEliminar) {
        int pos = buscarRegistro(aEliminar);
        if(pos == -1) return false;
        Compra productoEliminado = get(pos);
        productoEliminado.setActivo(false);
        set(pos, productoEliminado);
        return true;
    }
    @Override
    public void compactarArchivo(File archivo) {
        crearFile(archivo); // Abrimos el flujo.
        Compra[] listado = new Compra[numeroRegistros];
        for(int i=0; i<numeroRegistros; ++i)
            listado[i] = get(i);
        cerrar(); // Cerramos el flujo.
        archivo.delete(); // Borramos el archivo.
        File tempo = new File("temporal.dat");
        crearFile(tempo); // Como no existe se crea.
        for(Compra p : listado)
            if(p.isActivo())
                añadir(p);
        cerrar();
        tempo.renameTo(archivo); // Renombramos.
    }
    @Override
    public void añadir(Object cliente) {
        int inactivo = buscarRegistroInactivo();
        if(set(inactivo==-1?numeroRegistros:inactivo, cliente))
            numeroRegistros++;
   }
    @Override
    public int buscarRegistro(String buscado) {
        Compra c;
        if (buscado == null) {
            return -1;
        }
        for(int i=0; i<getNumeroRegistros(); i++) {
            try {
                flujo.seek(i * tamañoRegistro);
            } catch (IOException ex) {
                Logger.getLogger(AccesoAleatorioCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            c = get(i);
            //Implementar con un for
            Iterator<IProducto> j=c.listaIProductos.iterator();
            while(j.hasNext())
            if(((Producto)j.next()).getCodigoproducto().equals(buscado)&&((Producto)j.next()).isActivo())
                return i;
        }
        return -1;}

}