package HolaMundo;

public class TiposDeVariables {
        /*
        Modificadores de acceso:
        * Public (pública): Una variable declarada como pública puede ser accedida desde cualquier parte del programa. No hay restricciones en cuanto a su acceso.
        * Private (privada): Una variable declarada como privada solo puede ser accedida dentro de la clase donde se ha declarado. No puede ser accedida desde fuera de la clase, incluso si se encuentra en el mismo paquete.
        * Protected (protegida): Una variable declarada como protegida es accesible desde la clase donde se ha declarado, desde las subclases de esa clase y desde otras clases en el mismo paquete.
        * Static (estática): Una variable estática pertenece a la clase en lugar de a una instancia específica de la clase. Esto significa que solo hay una copia de la variable para todas las instancias de la clase. Se puede acceder a la variable estática utilizando el nombre de la clase seguido del nombre de la variable.
        * Final (final): Una variable declarada como final no puede ser modificada una vez que se le ha asignado un valor. Es decir, se convierte en una constante. Se debe inicializar la variable final cuando se declara o en el constructor de la clase.
        * Transient (transitoria): Una variable declarada como transitoria se excluye de la serialización, lo que significa que no se guarda cuando se guarda un objeto en un archivo o se transmite a través de una red.
        * Volatile (volátil): Una variable declarada como volátil indica que su valor puede ser modificado por múltiples hilos de ejecución. Garantiza que cualquier cambio en el valor de la variable sea visible para todos los hilos.
         */

        //Las variables cambian a lo largo del programa.
        //EStos son datos primitivos.
        //numericas
        static int numeroEntero = 0;
        static long numeroEnteroLargo = 0;
        static short numeroCorto = 0;
        static byte noSe = 0;
        static float decimal = (float) 1.45; //hay que hacerle un casting, el float ocupa menos en memoria que un double, pero hacen lo mismo.
        static double decimalMasMemoria = 1.45;
        //string
        static char unSoloCaracter = 'a';
        //booleano
        static boolean desiciónTrue = true;
        static boolean desiciónFalse = true;
        // Datos no primitivos, puedes meterle un null
        static String frase = "esto es una frase";
        static Integer numeritoToooo = 22; //permiten el uso de métodos asignados a ellos.

        // constantes
        // las constantes no cambian.
        final int constante = 10; //al llevar final, nunca cambiará su valor.
    public static void main (String[] args){
        boolean comparación = numeritoToooo.equals(22);
        System.out.println(comparación);
    }
}
