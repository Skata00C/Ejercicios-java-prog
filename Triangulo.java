import java.util.Scanner;




public class Triangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Realizo el Scanner para poder darle valores a las varibles de la equiación
        
        System.out.print("Escribe la variable b:");
        double b = sc.nextDouble();
        System.out.println("=============="); // Espacio por cuestiones estéticas

        System.out.print("Escribe la variable :");
        double h = sc.nextDouble();
        System.out.println("=============="); // Espacio por cuestiones estéticas
        
        sc.close(); // Cerramos el Scanner por cuestiones de rendimiento

        System.out.print("El área del triangulo es:)" + (b  * h) / 3.) ;

    }

}
