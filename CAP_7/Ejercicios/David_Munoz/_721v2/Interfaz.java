package CAP_7.Ejercicios.David_Munoz._721v2;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.*;

public class Interfaz {

    public void interfaz_bienvenida() {
        Font font = new Font("Courier New", Font.PLAIN, 16);UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("OptionPane.messageFont", font);

        String mensaje = "\t --------------------------------- \n\n"
            + "   _____     ____ \n"   
            + "  /      \\  |  o |  \n"
            + " |        |/ ___\\|  \n"
            + " |_________/      \n"
            + " |_|_| |_|_| \n"
            + " --------------------------------- \n"
            + "\n"
            + "      {LA TORTUGA MECANICA}     "
            + "";

        JOptionPane.showMessageDialog(null, mensaje, "[BIENVENIDO]", JOptionPane.PLAIN_MESSAGE);
    }
    public void mostrarComandos() {
        String lista = "\n1 = Bolígrafo arriba \n"
            + "2 = Bolígrafo abajo \n"
            + "3 = Voltear a la derecha \n"
            + "4 = Voltear a la izquierda \n"
            + "5 = Avanzar hacia delante 'x' espacios \n"
            + "6 = Salir \n";

        System.out.println(lista);
    }
    public void interfaz_final() {
        String agradecimientos = "\n-- Gracias por usar este software, espero haya sido de ayuda --" // derechos de autor programa
            + "\n                @ 2023 - David Muñoz - UD\n";
        JOptionPane.showMessageDialog(null, agradecimientos);

    }
}