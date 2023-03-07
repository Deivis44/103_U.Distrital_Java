package CAP_2.Ejercicios.David_Munoz._235.v2;

import java.util.Scanner;

public class _235v2_CalculadoraAhorro {

    public static void main(String[] args) {

        Interfaz prueba = new Interfaz();
        
        prueba.interfaz();
        Scanner entrada = new Scanner(System.in);

        System.out.print("    1. ¿Cuantos Km conduces al día? (num) ");
        int kilometros = entrada.nextInt();
        while (kilometros < 0) {
            System.out.println("\t<<ERROR>>");
            System.out.print("    1. ¿Cuantos Km conduces al día? (num) ");
            kilometros = entrada.nextInt();
        }
        System.out.print("    2. ¿Cuanto te cuesta el litro de gasolina en un día? ($) ");
        int litroGasolina = entrada.nextInt();
        while (litroGasolina <0) {
            System.out.println("\t<<ERROR>>");
            System.out.print("    2. ¿Cuanto te cuesta el litro de gasolina en un día? ($) ");
            litroGasolina = entrada.nextInt();
        }
        System.out.print("    3. ¿En promedio cuantos Km/L haces en un día? (num) ");
        double promKM_litro = entrada.nextDouble();
        while (promKM_litro < 0) {
            System.out.println("\t<<ERROR>>");
            System.out.print("    3. ¿En promedio cuantos Km/L haces en un día? (num) ");
            promKM_litro = entrada.nextDouble();
        }
        System.out.print("    4. ¿Cuanto te cuesta el parqueadero al día? ($) ");
        int cuotasPARQ = entrada.nextInt();
        while (cuotasPARQ < 0) {
            System.out.println("\t<<ERROR>>");
            System.out.print("    4. ¿Cuanto te cuesta el parqueadero al día? ($) ");
            cuotasPARQ = entrada.nextInt();
        }
        System.out.print("    5. ¿Cuanto gastas en peajes en un día? ($) ");
        int peaje = entrada.nextInt();
        while (peaje < 0) {
            System.out.println("\t<<ERROR>>");
            System.out.print("    5. ¿Cuanto gastas en peajes en un día? ($) ");
            peaje = entrada.nextInt();
        }
        
        entrada.close();
        
        prueba.informacion(promKM_litro);
        prueba.calcularTotal(kilometros, litroGasolina, cuotasPARQ, peaje);
        prueba.recomendaciones();
    }
}