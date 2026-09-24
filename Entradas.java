import java.util.Scanner;

/** @author Pablo Cores */

public class Entradas {
    public static void main(String[] args) {
        // Creamos el Scanner para preguntar el usuario el número de entradas.
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el número de entras de niñós: ");
        double EntNiños = sc.nextDouble();
        System.out.print("Escribe el número de entras de adultos: ");
        double EntAdultos = sc.nextDouble();
        sc.close();

        // Creo en las constantes.
        final double niños = 15.50;
        final double adultos = 20;

        // Aplico la variable (entradas) a las constantes (precios) y creo el precio total de las entradas.
        double inpNiños = EntNiños * niños; 
        double inpAdultos = EntAdultos * adultos;
        double precioTotal = inpNiños + inpAdultos;
        System.out.println("Precio total de las entras es: " + precioTotal );

        // Creo la operacion del caso que supere los 100€ para luego crear el ternario.
        double sup100 = 0.95 * precioTotal;

        // Creo el ternario que de las dos opciones de solución y soy salida al programa.
        String resultado = (precioTotal > 0 && precioTotal < 100 )
        ? "El precio total es: " + precioTotal : "El precio total con el descuento del 5% es: " + sup100;

        System.out.println(resultado);
    }

}
