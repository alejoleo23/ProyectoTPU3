/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import java.awt.event.KeyEvent;

/**
 *
 * @author Luis
 */
public class Validaciones {
    public static void ValidarNumeroEntero(java.awt.event.KeyEvent evt){
         char car=evt.getKeyChar(); 
         if(!Character.isDigit(car) && car!=(char)KeyEvent.VK_BACK_SPACE){ 
              //getToolkit().beep(); 
               
              evt.consume(); 
              //JOptionPane.showMessageDialog(null,"Solo se admiten números","Validar N",JOptionPane.INFORMATION_MESSAGE);
         } 
    }
    public static void ValidarNumeroDecimal(java.awt.event.KeyEvent evt, javax.swing.JTextField x){
         char car=evt.getKeyChar(); 
         if(!Character.isDigit(car) && car!=(char)KeyEvent.VK_BACK_SPACE && x.getText().contains(".")){ 
              //getToolkit().beep(); 
               
              evt.consume(); 
              //JOptionPane.showMessageDialog(null,"Solo se admiten números","Validar N",JOptionPane.INFORMATION_MESSAGE);
         } 
    }
    public static void ValidarNPalabras(java.awt.event.KeyEvent evt,int n){
        
    }
    public static void ValidarTexto(java.awt.event.KeyEvent evt){
        char car=evt.getKeyChar(); 
         if((car<'a'||car>'z')&&(car<'A'||car>'Z')&&car!=(char)KeyEvent.VK_SPACE){ 
              //getToolkit().beep(); 
              evt.consume(); 
              //JOptionPane.showMessageDialog(null,"Solo se admiten números","Validar N",JOptionPane.INFORMATION_MESSAGE);
         }
    }
//    public static boolean isEmail(String correo){
//        Pattern pat=null;
//        Matcher mat=null;
//        pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); 
//        mat=pat.matcher(correo);
//        return mat.find();
//    }
//    public static void ValidarEmail(java.awt.event.KeyEvent evt,javax.swing.JTextField evt2){
//        if(!isEmail(evt2.getText())){JOptionPane.showMessageDialog(null,"Email Invalido","Validaciones",JOptionPane.INFORMATION_MESSAGE);}       
//    }
}
