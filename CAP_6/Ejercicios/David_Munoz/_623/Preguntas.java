package CAP_6.Ejercicios.David_Munoz._623;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import java.awt.*;

public class Preguntas {
    public void Preguntas_usuario() {
        Font font = new Font("Courier New", Font.PLAIN, 16);
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("OptionPane.messageFont", font);

        double num1 = 0, num2 = 0, num3 = 0;
        
        boolean validInput = false;
        do {
            try {
                Scanner scan = new Scanner(System.in);

                String input1 = JOptionPane.showInputDialog("Ingrese el primer número: ");
                num1 = Double.parseDouble(input1);

                String input2 = JOptionPane.showInputDialog("Ingrese el segundo número: ");
                num2 = Double.parseDouble(input2);

                String input3 = JOptionPane.showInputDialog("Ingrese el tercer número: ");
                num3 = Double.parseDouble(input3);

                scan.close();
                    
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: debe ingresar valores numéricos válidos.");
            }
        } while (!validInput);
        
        Numero minimo = new Numero(num1, num2, num3);
        Double resultado = minimo.minimo3();
        JOptionPane.showMessageDialog(null, "El menor número de los tres es: (" + resultado + ")" , "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }   
}