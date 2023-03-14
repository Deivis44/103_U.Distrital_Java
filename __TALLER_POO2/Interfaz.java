package __TALLER_POO2;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.*;

public class Interfaz {
    int opcion;
    
    public int interfaz_bienvenida() {
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
            + " \n\n"
            + " 1. Iniciar sesión \n"
            + " 2. Crear Cuenta";

        String input = JOptionPane.showInputDialog(null, mensaje, "[PASO 1 DE 3]", JOptionPane.PLAIN_MESSAGE);
        opcion = Integer.parseInt(input);
        return opcion;
    }

    public void interfaz_crear_cuenta() {
        Font font = new Font("Gill Sans MT", Font.PLAIN, 18);
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("OptionPane.messageFont", font);

        ImageIcon icono = new ImageIcon("__TALLER_POO2/iconos/email.png");
        String correo = (String) JOptionPane.showInputDialog(null, "¿Listo para mirar? Ingrese su correo electrónico para crear o reiniciar su membresía.", "Dirección de correo electronico", JOptionPane.PLAIN_MESSAGE, icono, null, "");

        VerificacionCorreo correo_electronio = new VerificacionCorreo();
        correo_electronio.informacion_paso1(correo);
        correo_electronio.informacion_paso2();
        String tipo = correo_electronio.informacion_paso2_1();

        switch (tipo) {
            case "1":
                correo_electronio.informacion_paso3("Básico");
                break;
            case "2":
                correo_electronio.informacion_paso3("Estandar");
                break;
            case "3":
                correo_electronio.informacion_paso3("De primera calidad");
                break;
        }
    }

    public void interfaz_inicar_sesion() {
        
    }
}