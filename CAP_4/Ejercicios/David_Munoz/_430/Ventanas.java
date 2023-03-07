package CAP_4.Ejercicios.David_Munoz._430;

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
         
        String mensaje_bienvenida = "             < DETECTOR DE PALINDROMOS >              \n"
            + " ---------------------------------------------------- \n"
            + "   :::    ::::::::   ::::::::      :::     :::::::::: \n"
            + " :+:+:   :+:    :+: :+:    :+:    :+:      :+:    :+: \n"
            + "   +:+         +:+         +:+   +:+ +:+   +:+        \n"
            + "   +#+       +#+        +#++:   +#+  +:+   +#++:++#+  \n"
            + "   +#+     +#+             +#+ +#+#+#+#+#+        +#+ \n"
            + "   #+#    #+#       #+#    #+#       #+#   #+#    #+# \n"
            + " ####### ##########  ########        ###    ########  \n"
            + " ---------------------------------------------------- \n"
            + "   ! Palabra o expresión que es igual si se lee de    \n"
            + "     izquierda a derecha que de derecha a izquierda.    ";

        JOptionPane.showMessageDialog(null, mensaje_bienvenida, "Bienvenida", JOptionPane.INFORMATION_MESSAGE);
    }

    public void interfaz_final() {
        String agradecimientos = "\n-- Gracias por usar este software, espero haya sido de ayuda --" // derechos de autor programa
            + "\n                @ 2023 - David Muñoz - UD\n";
        JOptionPane.showMessageDialog(null, agradecimientos);

    }
}