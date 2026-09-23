import java.util.Scanner;

/** @author Pablo Cores */

public class FarenheitACelsius {
    public static void main(String[] args) {
        // Creo el Scanner para que usuario introduzca la variable (grados Farenheit).
        Scanner sc = new Scanner(System.in);
        System.out.print("Es cribe los grandos Farenheit:");
        double grados = sc.nextDouble();
        System.out.println("===========");

        // Realizamos la operación aplicando la fórmula.
        System.out.println("En grados Celsius es: " + 5. / 9 * (grados - 32));
    }

}
