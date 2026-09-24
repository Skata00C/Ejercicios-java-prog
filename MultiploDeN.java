import java.util.Scanner;

/** @author Pablo Cores */

public class MultiploDeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número n: ");
        int n = sc.nextInt();
        System.out.print("Escribe un número m: ");
        int m = sc.nextInt();
        sc.close();
        
        int resto = n % m;
        int suma = m - resto;
        int resultSuma = n + suma;
        
        String resultado = (  n % m == 0 && n != m)
        ? "No hay que sumarle nada: " + n : "Para que sea multiplo de 7 habrá que sumarle " + suma + "\n" + "Quedando así: " + resultSuma;

        System.out.print(resultado);
    }
    

}
