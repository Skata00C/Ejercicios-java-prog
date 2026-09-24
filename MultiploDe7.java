import java.util.Scanner;

/** @author Pablo Cores */

public class MultiploDe7 {
    public static void main(String[] args) {
        // Creo un Scanner para preguntarle al Usuario cual es el número a utilizar.
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int a = sc.nextInt();
        sc.close();
        int resto = a % 7;
        int suma = 7 - resto;
        int resultSuma = a + suma;
        
        String resultado = ( a % 7 == 0 && a != 7)
        
        ? "No hay que sumarle nada: " + a : "Para que sea multiplo de 7 habrá que sumarle " + suma + "\n" + "Quedando así: " + resultSuma;
        System.out.print(resultado);
    }

}
