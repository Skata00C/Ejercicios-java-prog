import java.util.Scanner;

import javax.swing.Spring;

/** @author Pablo Cores */

public class CelsiusAFarenheit {
    public static  void main(String[] args) {
        // Creo el Scanner para que usuario introduzca la variable (grados).
        Scanner sc = new Scanner(System.in);
        System.out.print("Es cribe los grandos:");
        double grados = sc.nextDouble();
        sc.close();
        System.out.println("==========="); // Separación por fines estéticos

        // Realizamos la operación aplicando la fórmula.
        System.out.println("En grados Farenheit es: " + (grados * 9 / 5 + 32));
    }
}
