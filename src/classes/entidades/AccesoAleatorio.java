package classes.entidades;

import java.io.File;
/**
 *
 * @author Luis
 */
public abstract class AccesoAleatorio {
    //ES UNA FACTORY DE OBJETOS PARA ACCESO ALEATORIO   :v
    public abstract void crearFile(File archivo);
    public abstract void cerrar();
    public abstract boolean set(int i, Object cliente);
    public abstract int buscarRegistroInactivo();
    public abstract boolean eliminar(String aEliminar);
    public abstract void compactarArchivo(File archivo);
    public abstract void añadir(Object cliente);
    public abstract int getNumeroRegistros();
    public abstract Object get(int i);
    public abstract int buscarRegistro(String buscado);
    //public abstract String[] buscarRegistro2(int buscado); 
}
