package __TALLER1_POO2;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.*;

public class Interfaz {
    
    public void interfaz_bienvenida() {
        Font font = new Font("Courier New", Font.PLAIN, 16);UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("OptionPane.messageFont", font);

        String mensaje = "\t -------------------------------------------------------------------- \n"
            + " $$\\   $$\\ $$$$$$$$\\ $$$$$$$$\\ $$$$$$$$\\ $$\\       $$$$$$\\ $$\\   $$\\ \n"
            + " $$$\\  $$ |$$  _____|\\__$$  __|$$  _____|$$ |      \\_$$  _|$$ |  $$ | \n"
            + " $$$$\\ $$ |$$ |         $$ |   $$ |      $$ |        $$ |  \\$$\\ $$  | \n"
            + " $$ $$\\$$ |$$$$$\\       $$ |   $$$$$\\    $$ |        $$ |   \\$$$$  / \n"
            + " $$ \\$$$$ |$$  __|      $$ |   $$  __|   $$ |        $$ |   $$  $$< \n"
            + " $$ |\\$$$ |$$ |         $$ |   $$ |      $$ |        $$ |  $$  /\\$$\\ \n"
            + " $$ | \\$$ |$$$$$$$$\\    $$ |   $$ |      $$$$$$$$\\ $$$$$$\\ $$ /  $$ | \n"
            + " \\__|  \\__|\\________|   \\__|   \\__|      \\________|\\______|\\__|  \\__| \n"
            + " -------------------------------------------------------------------- \n"
            + "\n"
            + " Películas ilimitadas, programas de TV y más. \t\n Mira en cualquier lugar. Cancele en cualquier momento."
            + "";

        JOptionPane.showMessageDialog(null, mensaje, "[BIENVENIDO]", JOptionPane.PLAIN_MESSAGE);
    }
}