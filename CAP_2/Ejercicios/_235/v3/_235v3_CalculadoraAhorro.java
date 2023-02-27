package CAP_2.Ejercicios._235.v3;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class _235v3_CalculadoraAhorro {

    public static void main(String[] args) {

        Ventanas ventana = new Ventanas();
        Informacion datos = new Informacion();

        String nombre = JOptionPane.showInputDialog("¿Cual es tu nombre?");
        ventana.interfaz_ventana(nombre); // llamo al objeto ventana con su metodo de interfaz de bienvenida

        Scanner entrada = new Scanner(System.in); // abro metodo Scanner para leer datos

        int kilometros = 0;
        int litroGasolina = 0;
        double promKM_litro = 0f;
        int cuotasPARQ = 0;
        int peaje = 0;
        
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                String input = JOptionPane.showInputDialog("1. ¿Cuántos Km conduces al día? (num) ");
                kilometros = Integer.parseInt(input);
                
                if (kilometros < 0) {
                    JOptionPane.showMessageDialog(null,"El número debe ser positivo. Inténtalo de nuevo.");
                } else {
                    entradaValida = true;
                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Debes ingresar un número entero. Inténtalo de nuevo.");
            }
        }

        entradaValida = false;
        while (!entradaValida) {
            try {
                String input2 = JOptionPane.showInputDialog("2. ¿Cuánto te cuesta el litro de gasolina en un día? ($) ");
                litroGasolina = Integer.parseInt(input2);

                if (litroGasolina < 0) {
                    JOptionPane.showMessageDialog(null,"El número debe ser positivo. Inténtalo de nuevo.");
                } else {
                    entradaValida = true;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Debes ingresar un número entero. Inténtalo de nuevo.");
            }
        }
        
        entradaValida = false;
        while (!entradaValida) {
            try {
                String input3 = JOptionPane.showInputDialog("3. ¿En promedio cuántos Km/L haces en un día? (num) ");
                promKM_litro = Integer.parseInt(input3);
                
                if (promKM_litro < 0) {
                    JOptionPane.showMessageDialog(null,"El número debe ser positivo. Inténtalo de nuevo.");
                } else {
                    entradaValida = true;
                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Debes ingresar un número entero o decimal. Inténtalo de nuevo.");
            }
        }

        entradaValida = false;
        while (!entradaValida) {
            try {
                String input4 = JOptionPane.showInputDialog("4. ¿Cuánto te cuesta el parqueadero al día? ($) ");
                cuotasPARQ = Integer.parseInt(input4);
                
                if (cuotasPARQ < 0) {
                    JOptionPane.showMessageDialog(null,"El número debe ser positivo. Inténtalo de nuevo.");
                } else {
                    entradaValida = true;
                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Debes ingresar un número entero. Inténtalo de nuevo.");
            }
        }
        
        String pregunta = JOptionPane.showInputDialog("- ¿Gastas en peajes cuando sales? (si/no) ");
        if (pregunta != null && pregunta.equalsIgnoreCase("si")) {

            entradaValida = false;
            while (!entradaValida) {
                try {
                    String input5 = JOptionPane.showInputDialog("5. ¿Cuánto gastas en peajes en un día? ($) ");
                    peaje = Integer.parseInt(input5);
                    
                    if (cuotasPARQ < 0) {
                        JOptionPane.showMessageDialog(null,"El número debe ser positivo. Inténtalo de nuevo.");
                    } else {
                        entradaValida = true;
                    }
                    
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Debes ingresar un número entero. Inténtalo de nuevo.");
                }
            }
    
        } else if (pregunta != null && pregunta.equalsIgnoreCase("no")) {
            JOptionPane.showMessageDialog(null, "No gastas en peajes.");
            peaje = 0;
        } else {
            JOptionPane.showMessageDialog(null, "Debes ingresar una respuesta válida");
            peaje = 0;
        }
        
        entrada.close(); // cierro metodo Scanner para ahorrar memoria
        
        System.out.print("[---]\n"); // ! una simple linea que me informa que ha realizado el proceso de preguntas correctamente
        
        ventana.informacion_ventana(promKM_litro); // llamo al objeto vetana que deposita datos generales sobre el consumo diario en auto
        datos.calcularTotal(kilometros, litroGasolina, cuotasPARQ, peaje); // introduzco los valores suministrados por el usuario a la clase encargada de la suma con sus respectivos atributos
        datos.recomendaciones(); // segun los datos introducidos por el usuario, habran recomendaciones que podran variar dependiendo del caso
    }
}

// https://www.larepublica.co/finanzas/conozca-los-costos-que-debe-tener-en-cuenta-a-la-hora-de-mantener-un-vehiculo-3113656
// https://www.autofact.com.co/blog/mi-carro/actividades/carpooling-colombia
// https://www.allianz.es/blog/motor/compartir-coche.html#:~:text=Ahorro%20en%20gastos%3A%20al%20compartir,llevar%20a%20tres%20pasajeros%20m%C3%A1s.