import java.util.Scanner;

/** @autor Pablo Cores   */

public class DistanciaEntreDosPuntos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Realizo el Scanner para poder darle valores a las varibles de la equiación

        System.out.print("Escribe la variable x1:");
        double x1 = sc.nextDouble();
        System.out.println("=============="); // Espacio por cuestiones estéticas

        System.out.print("Escribe la variable y1:");
        double y1 = sc.nextDouble();
        System.out.println("=============="); // Espacio por cuestiones estéticas

        System.out.print("Escribe la variable x2:");
        double x2 = sc.nextDouble();
        System.out.println("=============="); // Espacio por cuestiones estéticas

        System.out.print("Escribe la variable y2:");
        double y2 = sc.nextDouble();
        System.out.println("=============="); // Espacio por cuestiones estéticas

        sc.close(); // Cerramos el Scanner por cuestiones de rendimiento

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // Cálculo de la distancía entre ellas
        System.out.println("La distancia entre los dos puntos es: " + distancia);

        }

       

}
