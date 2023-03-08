package CAP_6.Ejercicios.David_Munoz._623;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.*;
public class Interfaz {
    
    public void interfaz_bienvenida() {
        Font font = new Font("Courier New", Font.PLAIN, 16);
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("OptionPane.messageFont", font);
         
        String mensaje_bienvenida = "\n"
            + " d888         .d8888b.        .d8888b.   \n"
            + "d8888        d88P  Y88b      d88P  Y88b  \n"
            + "  888               888           .d88P  \n"
            + "  888             .d88P          8888'   \n"
            + "  888         .od888P'            'Y8b.  \n"
            + "  888        d88P'           888    888  \n"
            + "  888        888'            Y88b  d88P  \n"
            + "8888888      888888888        'Y8888P'   \n"
            + "      (Valor minimo de 3 numeros)          ";

        JOptionPane.showMessageDialog(null, mensaje_bienvenida, "Bienvenida", JOptionPane.INFORMATION_MESSAGE);
    }

    public void interfaz_final() {
        String agradecimientos = "\n-- Gracias por usar este software, espero haya sido de ayuda --" // derechos de autor programa
            + "\n                @ 2023 - David Muñoz - UD\n";
        JOptionPane.showMessageDialog(null, agradecimientos);

    }
}