package CAP_5.Ejercicios.David_Munoz._529;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.*;

public class Ventanas {

    public void interfaz_bienvenida() {
        Font font = new Font("Courier New", Font.PLAIN, 16);
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("OptionPane.messageFont", font);
         
        String mensaje_bienvenida = "\n"
            + "     ;                     \n"
            + "     ;;  || 12             \n"
            + "     ;';.                  \n"
            + "     ;  ;;  || Days of     \n"
            + "     ;   ;;                \n"
            + "     ;    ;; ||  Christmas \n"
            + "     ;    ;;               \n"
            + "     ;   ;'                \n"
            + "     ;  '                  \n"
            + ",;;;,;                     \n"
            + ";;;;;;                     \n"
            + "`;;;;'  - David Muñoz -    \n";

        JOptionPane.showMessageDialog(null, mensaje_bienvenida, "Bienvenida", JOptionPane.INFORMATION_MESSAGE);
    }

    public void interfaz_final() {
        String agradecimientos = "\n-- Gracias por usar este software, espero haya sido de ayuda --" // derechos de autor programa
            + "\n                @ 2023 - David Muñoz - UD\n";
        JOptionPane.showMessageDialog(null, agradecimientos);

    }
}
