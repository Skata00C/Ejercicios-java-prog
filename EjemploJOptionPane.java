import javax.swing.JOptionPane;

public class EjemploJOptionPane {
    public static void main(String[] args) {
        
        System.out.println(JOptionPane.showConfirmDialog(null, "Estas de acuerdo ?"));
        String nombre = "";
        String msg = "Hola" + nombre + "!"; 
        JOptionPane.showMessageDialog(null, msg);
        
        String entradaUsuario = JOptionPane.showInputDialog("Escribe un número");
        int numero = Integer.parseInt(entradaUsuario);
        double cuadrado = Math.pow(numero, 2);
        msg = "El cuadrado de " + numero + " es igual a " + cuadrado;
        JOptionPane.showMessageDialog(null, msg);
    }

}
