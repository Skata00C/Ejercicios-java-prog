import java.util.Scanner;

/** @autor Pablo Cores   */

public class EcuaciónGrado2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // Realizo el Scanner para poder darle valores a las varibles de la equiación

        System.out.print("Dale un valor a A:");
        double a = sc.nextDouble();
        System.out.println("===========");      // Espacio por cuestiones estéticas
        
        System.out.print("Dale un valor a B:");
        Double b = sc.nextDouble();
        System.out.println("===========");      // Espacio por cuestiones estéticas

        System.out.print("Dale un valor a c:");
        Double c = sc.nextDouble();
        System.out.println("===========");      // Espacio por cuestiones estéticas

        sc.close();     // Cierro Scanner por fines de rendimiento

        String resultado = ((Math.pow(b, 2) - 4 * a * c) > 0)         // Gracias a los valores que tiene esa variable  puedo elegir que va a imprimir la terminal. Gracias a \n puedo dar un salto de linea.
        ?   "Resultado de x1 es:" + (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a) +  "\nResultado de x2 es:" + (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a):    "No tiene resultado";

        System.out.println( resultado); 


    }

}
