package CAP_2.Ejercicios.David_Munoz._235.v3;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.*;

public class Ventanas {
    
    public void interfaz_ventana(String nombre) {
        Font font = new Font("Courier New", Font.PLAIN, 16);

        String mensajeString_carro = ""
            + " ---- BIENVENIDO A LA CALCULADORA DEL AHORRO ----- \n"
            + "\n              .--------.                         \n"
            + "         ____/_____|___ \\___                      \n"
            + "        O    _   - |   _   ,*                      \n"
            + "         '--(_)-------(_)--'  _.* " + nombre + "   \n"
            + "\n   (Por favor responda las siguientes preguntas) \n"
            + " ------------------------------------------------- \n"
            + "   > Actualmente para ir a tu trabajo, en auto <   \n"
            + "                      ....                           ";

            UIManager.put("OptionPane.background", Color.BLACK);
            UIManager.put("Panel.background", Color.BLACK);
            UIManager.put("OptionPane.messageForeground", Color.WHITE);
            UIManager.put("OptionPane.messageFont", font);
        JOptionPane.showMessageDialog(null, mensajeString_carro, "Bienvenida", JOptionPane.INFORMATION_MESSAGE);
    }

    public void informacion_ventana(double promKM_litro) {
        Font font2 = new Font("Courier New", Font.PLAIN, 16); // Trebuchet MS
        
        String mensajeString = "-------------------------------------------------------\n"
            + "* COSTO DIARIO (prom. Bogotá): $89.000 y $120.000 *\n"
            + "* PROM (Km/L) al día: 26Km *" + "\n\n\tEl tuyo es de: " + promKM_litro + "Km\n"
            + "-------------------------------------------------------";
        
            UIManager.put("OptionPane.background", Color.BLACK);
            UIManager.put("Panel.background", Color.BLACK);
            UIManager.put("OptionPane.messageForeground", Color.WHITE);
            UIManager.put("OptionPane.messageFont", font2);
        JOptionPane.showMessageDialog(null, mensajeString, "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }
}
