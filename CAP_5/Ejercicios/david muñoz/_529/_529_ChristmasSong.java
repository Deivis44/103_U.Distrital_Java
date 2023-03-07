package CAP_5.Ejercicios._529;

import javax.swing.JOptionPane;

public class _529_ChristmasSong {

    public static void main(String[] args) {

        Ventanas interfaz = new Ventanas();
        interfaz.interfaz_bienvenida();
    
        for (int i = 1; i <= 12; i++) {
            Lyrics letra = new Lyrics(i);
            String letras = letra.toString();
            JOptionPane.showMessageDialog(null, letras, "Día " + i, JOptionPane.INFORMATION_MESSAGE);
            System.out.println();
        }

        interfaz.interfaz_final();
    }
}