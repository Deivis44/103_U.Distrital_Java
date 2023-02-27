package CAP_4.Ejercicios._430;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class _430_Palindromo {
    public static void main(String[] args) {

        Ventanas ventana_interfaz = new Ventanas();
        ventana_interfaz.interfaz_bienvenida();
        
        Scanner scanner = new Scanner(System.in);

        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                String input = JOptionPane.showInputDialog("Introduce un número de cinco dígitos: ");
                int num = Integer.parseInt(input);
                Palindromo palindromo = new Palindromo(num);
                
                if (num < 10000 || num > 99999) {
                    JOptionPane.showMessageDialog(null,"Error: El número debe ser un entero positivo de cinco dígitos.");
                } else {
                    entradaValida = true;

                    if (palindromo.esPalindromo()) { // si cumple la condicion de tener 5 numeros se verifica si es palindromo
                        JOptionPane.showMessageDialog(null, num + " es un palíndromo.");
                        ventana_interfaz.interfaz_final();
                    } else {
                        JOptionPane.showMessageDialog(null, num + " no es un palíndromo.");
                        ventana_interfaz.interfaz_final();
                    }
                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Debes ingresar un número entero. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }
}
