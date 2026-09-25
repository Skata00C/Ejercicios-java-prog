import java.util.Scanner;

import javax.swing.Spring;

/** @author Pablo Cores */

public class CalculoAreaTerreno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dale un valor a la variable A: ");
        Double a = sc.nextDouble();
        System.out.print("Dale un valor a la variable B: ");
        double b = sc.nextDouble();
        System.out.print("Dale un valor a la variable C: ");
        double c = sc.nextDouble();
        sc.close();

        // Divido la figura en dos operaciones de area para depues sumarlas
        double áreaRectángulo = b * c;
        double áreaTriángulo = ( (b * (a - c)) / 2);
        double áreaTotal = áreaRectángulo + áreaTriángulo;
        String error = ("Error");
        double perímetro = a + b + c + ();

        /** Tengo que crear un ternario que impida seguir con el proceso
         * en caso de que el valor de la variable "c" sea superior a la
         * variable "a". */
        String restVariables = (a > c && a <= c)
        ? "El área del es: " + áreaTotal +"\n Y el perímetro es:" : "No es posible no respeta la forma de los terrenos de la constuctora--> " + error;

        System.out.println(restVariables);
        System.out.println("El perímetro es: " + perímetro);


    }

}
