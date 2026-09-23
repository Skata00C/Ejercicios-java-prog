import javax.swing.JOptionPane;

/** @author Pablo Cores  */

public class HorasASegundos {
    public static void main(String[] args) {
        String entradaUsuario = JOptionPane.showInputDialog("Escribe un número de horas que quieras pasar a min:");
        int horas = Integer.parseInt(entradaUsuario);
        double minutos = (horas * 60);
        String msg = minutos + " min";
        msg = "" + msg;
        JOptionPane.showMessageDialog(null, msg); 

        System.out.println(JOptionPane.showConfirmDialog(null, "Quieres pasarlo a segundos ahora ?"));
        double nsegundos = (minutos * 60);
        String msg2 = nsegundos + " segundos";
        JOptionPane.showMessageDialog(null, msg2);
        
    }

}
