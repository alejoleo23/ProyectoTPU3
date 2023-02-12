package entidades;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccesoAleatorioProducto extends AccesoAleatorio{
    
    private static RandomAccessFile  flujo;
    private static int numeroRegistros;
    private static final int tamañoRegistro = 180;
    
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
      public void cerrar(){
        try {
            flujo.close();
        } catch (IOException ex) {
            Logger.getLogger(AccesoAleatorioProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }      
    @Override
       public boolean set(int i, Object producto){
        if(i >= 0 && i <= getNumeroRegistros()) {
            if(((Producto)producto).getTamañoProducto() > tamañoRegistro) {
                System.out.println("\nTamaño de registro excedido.");
            } else {
                try {
                    flujo.seek(i*tamañoRegistro);
                    flujo.writeUTF(((Producto)producto).getNombreproducto());
                    flujo.writeUTF(((Producto)producto).getMarca());
                    flujo.writeUTF(((Producto)producto).getModelo());
                    flujo.writeUTF(((Producto)producto).getDimensiones());
                    flujo.writeDouble(((Producto)producto).getPreciounitario());
                    flujo.writeInt(((Producto)producto).getStock());
                     flujo.writeInt(((Producto)producto).getCategoria());
                    flujo.writeUTF(((Producto)producto).getCodigoproducto());
                    flujo.writeUTF(((Producto)producto).getLugardefabricacion());
                     flujo.writeUTF(((Producto)producto).getDistribuidor());
                    flujo.writeDouble(((Producto)producto).getPeso());
                    flujo.writeBoolean(((Producto)producto).isActivo());
                    return true;
                } catch (IOException ex) {
                    Logger.getLogger(AccesoAleatorioProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            System.out.println("\nNúmero de registro fuera de límites.");
        }
        return false;
    }      
    @Override
     public int buscarRegistroInactivo(){
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
    public  boolean eliminar(String aEliminar) {
        int pos = buscarRegistro(aEliminar);
        if(pos == -1) return false;
        Producto productoEliminado = get(pos);
        productoEliminado.setActivo(false);
        set(pos, productoEliminado);
        return true;
    }   
    @Override
    public void compactarArchivo(File archivo){
        crearFile(archivo); // Abrimos el flujo.
        Producto[] listado = new Producto[numeroRegistros];
        for(int i=0; i<numeroRegistros; ++i)
            listado[i] = get(i);
        cerrar(); // Cerramos el flujo.
        archivo.delete(); // Borramos el archivo.
        File tempo = new File("temporal.dat");
        crearFile(tempo); // Como no existe se crea.
        for(Producto p : listado)
            if(p.isActivo())
                añadir(p);
        cerrar();
        tempo.renameTo(archivo); // Renombramos.
    }  
    @Override
    public void añadir(Object producto){
        int inactivo = buscarRegistroInactivo();
        if(set(inactivo==-1?numeroRegistros:inactivo, producto))
            numeroRegistros++;
    }
    @Override
    public int getNumeroRegistros() {
        return numeroRegistros;
    }
    @Override
    public Producto get(int i){
        if(i >= 0 && i <= getNumeroRegistros()) {
            try {
                flujo.seek(i * tamañoRegistro);
                return new Producto(flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(), flujo.readDouble(), flujo.readInt(),flujo.readInt(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readDouble(),flujo.readBoolean());
            } catch (IOException ex) {
                Logger.getLogger(AccesoAleatorioProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("\nNúmero de registro fuera de límites.");
            return null;
        }
        return null;
    }
    @Override
    public int buscarRegistro(String buscado) {
        Producto c;
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
            if(c.getCodigoproducto().equals(buscado) && c.isActivo()) {
                return i;
            }
        }
        return -1;
    }
    public String[] buscarRegistro2(int buscado) {
        String[] datos=new String[5];
        Producto c;
        int z=0;
        if (buscado == -1) {
            return null;
        }
        for(int i=0; i<getNumeroRegistros(); i++) {
            try {
                flujo.seek(i * tamañoRegistro);
            } catch (IOException ex) {
                Logger.getLogger(AccesoAleatorioCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            c = get(i);
            if((c.getCategoria()+1)==buscado && c.isActivo()) {
//                datos[z]=c.getNombreproducto();
                datos[z]="asdasdasdsa";
                z++;
            }
        }
        return datos;
    }
}
