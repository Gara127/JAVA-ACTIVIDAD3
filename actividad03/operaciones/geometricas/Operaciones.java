package operaciones.geometricas;
import introduceDatos.Pregunta;
import java.util.Scanner;

public class Operaciones {
    public static void muestraCoseno(String pregunta, Scanner entrada) {
        /**
         * @param entrada String pregunta, una candena de texto que le entra como parámetro desde el main y la entrada del scanner
         * llama a pideDouble y recoge la variable introducida por el usuario.
         * Muestra por consola el coseno utilizando la librería math.
         */
        double valorNumerico = 0;
        valorNumerico=Pregunta.pideDouble(pregunta, entrada);
        System.out.println("El coseno es: " +  Math.cos(valorNumerico));
    }

    public static void muestraSeno(String pregunta, Scanner entrada) {

        /**
         * @param entrada String pregunta, una candena de texto que le entra como parámetro desde el main y la entrada del scanner
         * llama a pideDouble y recoge la variable introducida por el usuario.
         * Muestra por consola el seno utilizando la librería math.
         */
        double valorNumerico = 0;
        valorNumerico=Pregunta.pideDouble(pregunta, entrada);
        System.out.println("El seno es: " +  Math.sin(valorNumerico));
    }

 
}