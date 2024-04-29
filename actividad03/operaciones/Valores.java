package operaciones;
import java.lang.Math;
import java.util.Scanner;
import introduceDatos.Pregunta;

public class Valores {
    public static void muestraPI() {

        /**
         * Muestra por consola el valor de PI utilizando la librería math.
         */
        System.out.println("El valor de PI es: " + Math.PI);
    }

    public static void muestraValorAbsoluto(String pregunta, Scanner entrada) {
        /**
         * @param entrada String pregunta, una candena de texto que le entra como parámetro desde el main y la entrada del scanner
         * llama a pideDouble y recoge la variable introducida por el usuario.
         * Muestra por consola el valor absoluto utilizando la librería math.
         */
        double valorNumerico = 0;
        valorNumerico=Pregunta.pideDouble(pregunta, entrada);
        System.out.println("El valor absoluto es: " + Math.abs(valorNumerico));
    }

    public static void muestraValorAleatorio(String pregunta, Scanner entrada) {
        /**
         * @param entrada String pregunta, una candena de texto que le entra como parámetro desde el main y la entrada del scanner
         * llama a pideEntero y recoge la variable introducida por el usuario.
         * Muestra por consola el valor aleatorio, entre el valor introducido por el usuario y el 0, utilizando la librería math.
         */
        int valorNumerico = 0;
        valorNumerico=Pregunta.pideEntero(pregunta, entrada);
        int resultado = (int) (Math.random()* valorNumerico + 0); 
        System.out.println("El valor aleatorio es: " +  resultado);
    }





}