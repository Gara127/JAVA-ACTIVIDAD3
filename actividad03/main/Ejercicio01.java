import java.util.Scanner;
import introduceDatos.Pregunta;
import operaciones.*;
    
public class Ejercicio01 {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("1- convertirLinkiaCoins.");
            System.out.println("2- muestraPI. ");
            System.out.println("3- muestraValorAbsoluto."); 
            System.out.println("4- muestraValorAleatorio."); 
            System.out.println("5- muestraLogaritmo."); 
            System.out.println("6- calculaPotencia.");
            System.out.println("7- muestraSeno.");
            System.out.println("8- muestraCoseno.");
            System.out.println("0- No deseo realizar ninguna operación");
            
            opcion = Pregunta.pideEntero("Introduzca la operación a realizar de las anteriores: ", entrada);
            
        
            switch(opcion){                  
                case 1:
                    OperacionesLinkia.convertirLinkiaCoins(entrada);
                    break;
                case 2:
                    Valores.muestraPI();
                    break;
                case 3:
                    Valores.muestraValorAbsoluto("Introduzca un valor numérico para calcular el valor absoluto: ",entrada);
                    break;
                case 4:
                    Valores.muestraValorAleatorio("Introduzca un valor numérico para calcular un valor aleatorio: ", entrada);
                    break;
                case 5:
                    double log = Pregunta.pideDouble("Introduzca un valor numérico para calcular el logaritmo: ", entrada);
                    operaciones.aritmeticas.Operaciones.muestraLogaritmo(log);
                    break;
                case 6:
                    double base = Pregunta.pideDouble("Introduzca un valor de la base: ", entrada);
                    double exp = Pregunta.pideDouble("Introduzca un valor para el exponente ", entrada);
                    operaciones.aritmeticas.Operaciones.calculaPotencia(base, exp);
                    break;
                case 7:
                    operaciones.geometricas.Operaciones.muestraSeno("Introduzca un valor para calcular el seno: ", entrada);
                    break;
                case 8:
                    operaciones.geometricas.Operaciones.muestraCoseno("Introduzca un valor para calcular el coseno: ", entrada);
                    break;
                case 0:   
                    System.out.println("adiós");
                    break;
                default:
                    System.out.println ("Ha introducido un valor incorrecto, por favor inserte de nuevo");         
            }

        }while(opcion != 0);
        entrada.close();
    }
}