package entidades;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AccesoAleatorioCliente extends AccesoAleatorio{
    
    private RandomAccessFile flujo;
    private int numeroRegistros;
    private final int tamañoRegistro = 80;
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
            Logger.getLogger(AccesoAleatorioCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public boolean set(int i, Object cliente){
        if(i >= 0 && i <= getNumeroRegistros()) {
            if(((Cliente)cliente).getTamañoCliente() > tamañoRegistro) {
                System.out.println("\nTamaño de registro excedido.");
            } else {
                try {
                    flujo.seek(i*tamañoRegistro);
                    flujo.writeUTF(((Cliente)cliente).getNombres());
                    flujo.writeUTF(((Cliente)cliente).getApellidos());
                    flujo.writeUTF(((Cliente)cliente).getDNI());
                    flujo.writeUTF(((Cliente)cliente).getEmail());
                    flujo.writeUTF(((Cliente)cliente).getDepartamento());
                    flujo.writeUTF(((Cliente)cliente).getCiudad());
                    flujo.writeUTF(((Cliente)cliente).getDistrito());
                    flujo.writeUTF(((Cliente)cliente).getDireccion());
                    flujo.writeUTF(((Cliente)cliente).getPassword());
                    flujo.writeBoolean(((Cliente)cliente).isActivo());
                    return true;
                } catch (IOException ex) {
                    Logger.getLogger(AccesoAleatorioCliente.class.getName()).log(Level.SEVERE, null, ex);
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
            } catch (IOException ex) {
                Logger.getLogger(AccesoAleatorioCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(!get(i).isActivo()) 
                return i;
        }
        return -1;        
    }
    @Override
    public boolean eliminar(String aEliminar){
        int pos = buscarRegistro(aEliminar);
        if(pos == -1) return false;
        Cliente clienteEliminado = get(pos);
        clienteEliminado.setActivo(false);
        set(pos, clienteEliminado);
        return true;
    }
    @Override
    public void compactarArchivo(File archivo) {
        //Añade datos al archivo
        crearFile(archivo); // Abrimos el flujo.
        Cliente[] listado = new Cliente[numeroRegistros];
        for(int i=0; i<numeroRegistros; ++i)
            listado[i] = get(i);
        cerrar(); // Cerramos el flujo.
        archivo.delete(); // Borramos el archivo.
        File tempo = new File("temporal.dat");
        crearFile(tempo); // Como no existe se crea.
        for(Cliente c : listado)
            if(c.isActivo())
                añadir(c);
        cerrar();
        tempo.renameTo(archivo); // Renombramos.

    }
    @Override
    public  void añadir(Object cliente){
        int inactivo = buscarRegistroInactivo();
        if(set(inactivo==-1?numeroRegistros:inactivo, cliente)) 
            numeroRegistros++;        
    }
    @Override
    public  int getNumeroRegistros() {
        return numeroRegistros;
    }
    @Override
    public Cliente get(int i) {
        if(i >= 0 && i <= getNumeroRegistros()) {
            try {
                flujo.seek(i * tamañoRegistro);
                            return new Cliente(flujo.readUTF(),flujo.readUTF(),flujo.readUTF(), flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(),flujo.readUTF(), flujo.readUTF(),flujo.readBoolean());
            } catch (IOException ex) {
                Logger.getLogger(AccesoAleatorioCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("\nNúmero de registro fuera de límites.");
            return null;
        }
        return null;
    }
    @Override
    public int buscarRegistro(String buscado) {
        Cliente c;
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
            if(c.getDNI().equals(buscado) && c.isActivo()) {
                return i;
            }
        }
        return -1;
    }
}