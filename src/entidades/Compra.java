/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Luis
 */
public class Compra extends Composite{
    public Compra(String nombreCliente,String DNI, GregorianCalendar Fecha, String Direccion,boolean Activo,int numproductos) {
        this.nombreCliente=nombreCliente;
        this.DNI = DNI;
        this.Fecha = Fecha;//SUponer 32 bits
        this.Direccion = Direccion;
        this.Activo = Activo;
        this.numproductos=numproductos;
        //180 por cada producto
    }
    public String getFechaCorta() {
        int dia, mes, año;
        dia = Fecha.get(Calendar.DAY_OF_MONTH);
        mes = Fecha.get(Calendar.MONTH)+1;
        año = Fecha.get(Calendar.YEAR);
        return (dia<=9?"0"+dia:dia)+"/"+(mes<=9?"0"+mes:mes)+"/"+año;
    }
    public int getDia(){
        return Fecha.get(Calendar.DAY_OF_MONTH);
    }
    public int getMes(){
        return Fecha.get(Calendar.MONTH)+1;
    }
    public int getAño(){
        return Fecha.get(Calendar.YEAR);
    }
    public int getTamaño(){//FALTA OBTENER TAMAÑO
        return getNombreCliente().length()*2 + 32 + getDNI().length()*2 + getDireccion().length()*2 +1+ 2+listaIProductos.toArray().length*180;
    }
}
