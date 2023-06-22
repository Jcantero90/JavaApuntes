package HolaMundo;

import javax.swing.JOptionPane;

public class JavaOptionPane {

    public static void main (String[] args){
        String mensaje;
        mensaje = JOptionPane.showInputDialog("escribe tu puta cadena ");
        System.out.println(mensaje); //He tenido que crear una clase que se llame demo ya que daba error el modele-info.java.
    }

}
