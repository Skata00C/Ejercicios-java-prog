import java.util.Random;

public class NúmeroMayorTeacher {
      public static void main(String[] args) {
        // Marco las constantes:
        final int num1 = -64;
        final int num2 = 64;

        int numRandom = (int) (num1 + Math.random() * (num2 - num1 + 1));
        
        Random rnd = new Random();
        int numRandom2 = rnd.nextInt(num1, num2 + 1);
        int numRandom3 = rnd.nextInt(num1, num2 + 1);
        int numRandom4 = rnd.nextInt(num1, num2 + 1);

        System.out.println("Numero1: " + numRandom);
        System.out.println("Numero2: " + numRandom2);
        System.out.println("Numero3: " + numRandom3);
        System.out.println("Numero4: " + numRandom3);

        // Mayor de 2 números
        //int mayor = numRandom > numRandom2 ? numRandom : numRandom2;
        //int mayor = Math.max(numRandom, numRandom2);

        // Mayor de 3 números
        //int mayor = numRandom > numRandom2 ? numRandom : numRandom2;
        //mayor = mayor > numRandom3 ? mayor : numRandom3;

        //int mayor = Math.max(Math.max(numRandom, numRandom2), numRandom3);

        // Mayor de 4 números
        int mayor = numRandom > numRandom2 ? numRandom : numRandom2;
        mayor = mayor > numRandom3 ? mayor : numRandom3;
        mayor = mayor > numRandom4 ? mayor : numRandom4;

        System.out.println("Mayor: " + mayor);
    }


}
