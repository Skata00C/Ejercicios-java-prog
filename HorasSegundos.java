import java.util.Scanner;

/** @author Pablo Cores */

public class HorasSegundos {
    public static void main(String[] args) {

        // Creamos un Scanner para darle valor a la variable (en este caso segundos), para depues cerrarlo y pasar con la siguiente operación del problema.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de segundos: ");
        int numSegundos = sc.nextInt();
        sc.close();
        System.out.println("=================");         // Por fines estéticos

        // Declaración de las operaciones, segun la variable creada anteriormente (numSegundos).
        int nHoras = numSegundos / 3600; 
        int nMinutos = numSegundos % 3600 / 60;
        int nsegundos = numSegundos % 60;

        // Salida de las operaciones resueltas 
        System.out.printf( "%02d:%02d:%02d", nHoras, nMinutos, nsegundos);

    


    }

}
