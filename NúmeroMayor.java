import java.util.Random;


/** @author Pablo Cores */

public class NúmeroMayor {
    public static void main(String[] args) {
        // Marco las constantes:
        final int num1 = -64;
        final int num2 = 64;
        
        // Generamos los dos números aleatorios.
        Random rng = new Random();
        Random rng2 = new Random();

        int result1 = (rng.nextInt(num1, num2) + 1 );
        int result2 = (rng2.nextInt(num2) + 1 );

        System.out.println("Numero random 1: " + result1);
        System.out.println("Numero random 2: " + result2);

        String resultado = (result1 > result2 && result2 > result1 )
        ? "Es mayor el: " + result1 : "Es mayor el: " + result2;

        System.err.println(resultado);
    }

}
