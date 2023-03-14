package __TALLER_POO2;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.*;

public class VerificacionCorreo {

    int opcion;

    public void informacion_paso1(String correo) {
        Font font = new Font("Courier New", Font.PLAIN, 16);
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.WHITE);
        UIManager.put("OptionPane.messageForeground", Color.BLACK);
        UIManager.put("OptionPane.messageFont", font);
        
        String paso1 = "¡Bienvenido de nuevo!\nUnirse a Netflix es fácil."
        + "\n\n"
        + "Ingresa tu contraseña y estarás viendo en poco tiempo. \n"
        + "\n"
        + "Correo electronico \n"
        + "- " + correo
        + "";

        ImageIcon icono1 = new ImageIcon("__TALLER_POO2/iconos/one.png");
        JOptionPane.showInputDialog(null, paso1, "[PASO 1 DE 3]", JOptionPane.PLAIN_MESSAGE, icono1, null, "");
    }

    public void informacion_paso2() {
        Font font = new Font("Gill Sans MT", Font.PLAIN, 18);
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.WHITE);
        UIManager.put("OptionPane.messageForeground", Color.BLACK);
        UIManager.put("OptionPane.messageFont", font);
        
        String paso2 = "Elije tu plan. \n"
        + "\n"
        + "- Sin compromisos, cancela cuando quieras. \n"
        + "- Todo en Netflix por un precio bajo. \n"
        + "- Visualización ilimitada en todos sus dispositivos. \n";

        ImageIcon icono2 = new ImageIcon("__TALLER_POO2/iconos/two.png");
        JOptionPane.showMessageDialog(null, paso2, "[PASO 2 DE 3]", JOptionPane.INFORMATION_MESSAGE, icono2);
    }

    public String informacion_paso2_1() {
        Font font = new Font("Courier New", Font.PLAIN, 18);
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.WHITE);
        UIManager.put("OptionPane.messageForeground", Color.BLACK);
        UIManager.put("OptionPane.messageFont", font);
        
        String paso2_1 = "Elija el plan adecuado para usted \n"
        + "\n"
        + "- Mira todo lo que quieras. Libre de anuncios. \n"
        + "- Recomendaciones solo para ti. \n"
        + "- Cambia o cancela tu plan en cualquier momento. \n"
        + "\n"
        + " | ----------------- | Básico     | Estandar   | De primera calidad | \n"
        + " | Precio mensual    | COP 16.900 | COP 26.900 | COP 38.900         | \n"
        + " | Calidad de video  | Bien       | Mejor      | Mejor              | \n"
        + " | Resolución        | 720p       | 1080p      | 4K+HDR             | \n"
        + "\n"
        + " 1. Básico \n"
        + " 2. Estandar \n"
        + " 3. De primera calidad ";
        
        ImageIcon icono2_1 = new ImageIcon("__TALLER_POO2/iconos/two.png");
        String input = (String) JOptionPane.showInputDialog(null, paso2_1, "[PASO 2 DE 3]", JOptionPane.PLAIN_MESSAGE, icono2_1, null, "");
        return input;
    }   
    
    public void informacion_paso3(String tipo) {
        Font font = new Font("Courier New", Font.PLAIN, 18);
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.WHITE);
        UIManager.put("OptionPane.messageForeground", Color.BLACK);
        UIManager.put("OptionPane.messageFont", font);
        
        String paso3 = "Elige cómo pagar el plan: " + tipo 
        + "\n\n"
        + "Su pago está encriptado y puede cambiar la forma de pago en cualquier momento. \n"
        + "\nSeguro para su tranquilidad.\nCancele fácilmente en línea. \n"
        + "\n";

        ImageIcon icono3 = new ImageIcon("__TALLER_POO2/iconos/three.png");
        JOptionPane.showInputDialog(null, paso3, "[PASO 3 DE 3]", JOptionPane.PLAIN_MESSAGE, icono3, null, "");
    }
}
