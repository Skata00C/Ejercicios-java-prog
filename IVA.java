import java.util.Scanner;

/** @author Pablo Cores  */

public class IVA {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    // Abro el Scanner para preguntarle al usuario el porcentaje de IVA al cual queramos aplicarle al producto.

        System.out.print("Escribe el porcentaje del IVA:");
        double iva = sc.nextDouble();
        System.out.println("El porcentaje de iva es:" + iva + "%");
        System.out.println("============");

        System.out.print("Escribe el valor del producto:");
        double valorNetoDelProducto = sc.nextDouble();      // Gracias al sc.nextDouble el programa preguntará al Usuario cual es el valor neto del producto.
        System.out.println("============");              // Separador por fines estéticos

        sc.close();                                         // Cerramos el sc. para permitir que el programa deje de consumir recursos, ya que no necesitaremos ninguna respuesta más por el Usuario.

        double valorIvaProducto = (valorNetoDelProducto * (iva / 100));  // Realizamos la operación para obtener el resultado querido.
        System.out.println("Valor del IVA requerido del producto:" + valorIvaProducto);
        System.out.println("============");
        System.out.println("Valor final del producto con el IVA requerido aplicado:" + (valorNetoDelProducto + valorIvaProducto)); // Operación final para optener el valor del producto con el IVA requerido aplicado.


    }


}
