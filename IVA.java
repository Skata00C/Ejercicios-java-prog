

/** @autor Pablo Cores   */

import java.util.Scanner;

public class IVA {
        public static void main(String[] args) {
        final double IVA = 1.21;

        Scanner sc = new Scanner(System.in);                // Abro el Scanner para preguntarle al usuario el precio del producto al cual queramos aplicarle el IVA.

        System.out.print("Escribe el valor del producto:");
        double valorNetoDelProducto = sc.nextDouble();      // Gracias al sc.nextDouble el programa preguntará al Usuario cual es el valor neto del producto.
        System.out.println("============");              // Separador por fines estéticos

        sc.close();                                         // Cerramos el sc. para permitir que el programa deje de consumir recursos, ya que no necesitaremos ninguna respuesta más por el Usuario.

        System.out.println("El precio del producto aplicado con el IVA es:" + valorNetoDelProducto * IVA);  // Realizamos la operación para obtener el resultado querido.

    }


}
