import java.util.Scanner;

/** @autor Pablo Cores   */


public class Triangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Realizo el Scanner para poder darle valores a las varibles de la equiación
        
        System.out.print("Escribe la variable b (cm):");
        double b = sc.nextDouble();
        System.out.println("=============="); // Espacio por cuestiones estéticas

        System.out.print("Escribe la variable h (cm):");
        double h = sc.nextDouble();
        System.out.println("=============="); // Espacio por cuestiones estéticas
        
        sc.close(); // Cerramos el Scanner por cuestiones de rendimiento

        System.out.print("El área del triangulo es:)" + (b  * h) / 2. + " cm. ");

    }

}
