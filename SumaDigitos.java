import java.util.Scanner;

/** @author Pablo Cores */

public class SumaDigitos {
    public static void main(String[] args) {
        // Realizamos Scanner para darle valor a la variable ( num 3 dígitos).
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número de 3 dígitos: ");
        int n = sc.nextInt();

        // Realizamos las siguientes operaciones para sacar el número de cada dígitos.
        int centenas = n / 100;
        int decenas = n / 10 % 10;
        int unidades = n % 10;

        // Damos un valor a la suma de cada uno de los dígitos optenidos anteriormente.
        int suma = centenas + decenas + unidades;
        
        // Creamos un String para realizar un ternario
        String resultado = (n > 99 && n < 1000)
        ? "La suma de sus dígitos: " + suma : "Tu número no tiene 3 dígitos";

        System.out.println(decenas);


        System.out.println("Tu número es: " + n );
        System.out.printf(resultado);

    }
}
