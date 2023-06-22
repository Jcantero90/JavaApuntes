package HolaMundo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDatos {

    static Scanner entrada = new Scanner(System.in);
    static int numeroEntero;
    static String pocoyo;
    static char unSoloCaracter;
    static float numeroDecimal; // se le pasa por consola con , en vez de con .
    public static void main (String[] args){
        numeroEntero = entrada.nextInt(); // para pedir enteros
        System.out.println(numeroEntero);
        numeroDecimal = entrada.nextFloat(); // para pedir decimales
        System.out.println(numeroDecimal);
        pocoyo = entrada.next(); // para pedir string hasta que encuentra un espacio en blanco.
        System.out.println(pocoyo);
        pocoyo = entrada.nextLine(); // GUARDA LA CADENA COMPLETAMENTE.
        System.out.println(pocoyo);
        unSoloCaracter = entrada.next().charAt(0); // para pedir solo un caracter.
        System.out.println(unSoloCaracter);
    }

}
