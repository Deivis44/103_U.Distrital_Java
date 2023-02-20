package CAP_2.Ejercicios._235.v2;

import java.util.Scanner;
public class _235v2_CalculadoraAhorro {

    public static void main(String[] args) {
        
        Interfaz prueba = new Interfaz();
        
        Scanner entrada = new Scanner(System.in);
        prueba.interfaz();
        System.out.print("    1. ¿Cuantos Km conduces al día? (num) ");
        int kilometros = entrada.nextInt();
        System.out.print("    2. ¿Cuanto te cuesta el litro de gasolina en un día? ($) ");
        int litroGasolina = entrada.nextInt();
        System.out.print("    3. ¿En promedio cuantos Km/L haces en un día? (num) ");
        double promKM_litro = entrada.nextDouble();
        System.out.print("    4. ¿Cuanto te cuesta el parqueadero al día? ($) ");
        int cuotasPARQ = entrada.nextInt();
        System.out.print("    5. ¿Cuanto gastas en peajes en un día? ($) ");
        int peaje = entrada.nextInt();
        
        entrada.close();
        
        prueba.informacion(promKM_litro);
        prueba.calcularTotal(kilometros, litroGasolina, cuotasPARQ, peaje);
        prueba.recomendaciones();

        entrada.close();
    }
}