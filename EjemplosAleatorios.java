import java.util.Random;

/** @author Pablo Cores */

public class EjemplosAleatorios {
    public static void main(String[] args) {
        // Constante ( alumnos en clase ).
        final int alumnos = 30;

        // Generando números random
        System.out.println(Math.random());

        // Genera un número entero aleatorios entre 1 y alumnos.
        System.out.println(Math.random() * alumnos);
        System.out.println(Math.round(Math.random() * alumnos)); // Redondea por lo que no tiene el mismo % de salir cada número.
        System.out.println((int) (Math.random() * alumnos));    // Poniedo int delante le digo al programa que quiero que solo salga un resultado de tipo entero ( int ).
        System.out.println((int) Math.random() * alumnos + 1);  // Poniedo el +1 va a dejar de estar entre 0 y 29,99999 permitiendo asi que salga el 30.

        Random rnd = new Random(); 
        System.out.println(rnd.nextInt());
        System.out.println(rnd.nextInt(alumnos) + 1 );
        System.err.println(rnd.nextInt(1, alumnos + 1));
        




    }
}
