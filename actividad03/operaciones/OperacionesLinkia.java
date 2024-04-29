package operaciones;
import java.util.Scanner;
import introduceDatos.Pregunta;

public class OperacionesLinkia {
    public static void convertirLinkiaCoins(Scanner entrada) {
        /**
         * @param le entra como parámetro desde el main la entrada del scanner
         * llama a pideDouble y recoge la variable introducida por el usuario.
         * Utiliza el valor recogido y lo multiplica por 1,5 y muestra por consola el resultado.
         */
        double valorNumerico = 0;
        valorNumerico = Pregunta.pideDouble("Introduzca un valor numérico: ",entrada);
        valorNumerico = valorNumerico * 1.5;
        System.out.println("El resultado es " + valorNumerico);
    }
}
