package operaciones.aritmeticas;

public class Operaciones {
    public static void muestraLogaritmo(double log) {

        /**
         * @param entrada, le entra una variable tipo double que llega desde el main que a su vez llamo a pideDouble (entiendo que el ejercicio al no especificar que llame al método pideDouble directamente y que le entre una variable double se refiera a esto)
         * muestra por consola el logaritmo utilizando la libreria math.
         */
        
       System.out.println("El logaritmo en base e es: " +  Math.log(log));
    }

    public static void calculaPotencia(double base, double exp) {
            
        /**
         * @param entrada, le entra dos variables tipo double que llega desde el main que a su vez llamo a pideDouble.
         *  muestra por consola el resultado de la potencia utilizando la libreria math.
         */
        
        System.out.println("La potencia de tu número es " + Math.pow(base, exp));
    }

 
}