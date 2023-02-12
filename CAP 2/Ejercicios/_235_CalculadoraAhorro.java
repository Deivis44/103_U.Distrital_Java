package Ejercicios;
// calculadora de viajes compartidos en automovil

import java.util.Scanner; // importar clase 'Scanner' para recibir datos del usuario
public class _235_CalculadoraAhorro {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //
        
        int kilometros; // Total de kilometros conducidos por día
        float litroGasolina; // Costo por litro de gasolina
        float promKM_litro; // Promedio de kilometros por litro
        int cuotasPARQ; // Cuotas de parqueadero por día
        int peaje; // Peaje por día
        float total; // ! donde se almacenaran las operaciones necesarias para saber que tanto gasta en un día
    
        System.out.println("----- BIENVENIDO A LA CALCULADORA DE AHORRO -----\n"); // interfaz de usuario simple
        System.out.println("                 .--------.");
        System.out.println("            ____/_____|___ \\___");
        System.out.println("           O    _   - |   _   ,*");
        System.out.println("            '--(_)-------(_)--'   David\n");
        System.out.println("    (Actualmente para ir a tu trabajo en auto)");

        System.out.print("    1. ¿Cuantos Km conduces al día? (num) ");
        kilometros = entrada.nextInt();
        System.out.print("    2. ¿Cuanto te cuesta el litro de gasolina en un día? ($) ");
        litroGasolina = entrada.nextFloat();
        System.out.print("    3. ¿En promedio cuantos Km/L haces en un día? (num) ");
        promKM_litro = entrada.nextInt();
        System.out.print("    4. ¿Cuanto te cuesta el parqueadero al día? ($) ");
        cuotasPARQ = entrada.nextInt();
        System.out.print("    5. ¿Cuanto gastas en peajes en un día? ($) ");
        peaje = entrada.nextInt();
        System.out.println("\n-------------------------------------------------------"); // datos de consulta en la web
        System.out.println("* COSTO DIARIO (prom. Bogotá): $89.000 y $120.000 *");
        System.out.println("* PROM (Km/L) al día: 26Km *" + "\n\tEl tuyo es de: " + promKM_litro + "Km");
        System.out.println("-------------------------------------------------------");
        total = (kilometros*litroGasolina) + cuotasPARQ + peaje; // formula para definir el costo diario segun los datos administrados
        
        if (total > 0 && total <= 120000) { // rango dentro de los datos comunes en un día
            if (total >= 89000 && total <= 120000) { // existe el caso de que sea menor o igual al rango definido anteriormente
                System.out.println("// Gastas lo que usualmente se hace en un día en la ciudad: " + total + "$");
            } else {
                System.out.println("// Gastas menos de lo que usualmente se hace en un día en la ciudad: " + total + "$");
            }

            // datos relevantes consultados en la web sobre los beneficios de compartir el carro
            System.out.println("  ! Podrias considerar la opción de compartir tu carro:");
            System.out.println("  - Disminuirias en un 75% el costo total de un trayecto normal al día");
            System.out.println("  - Las emisiones de de carbono bajarian en un 42% aprox.");
            System.out.println("  - La congestion del trafico se veria enormemente reducida");
        } if (total > 120000) { // si excede el rango subestimado
            System.out.println("// Te recomendamos hacer uso de la estrategia 'Carpooling', en en día gastas: " + total + "$ eso es más de lo estimado");
            System.out.println("  ! Considera la opción de compartir tu carro:");
            System.out.println("  - Disminuirias en un 75% el costo total de un trayecto normal al día");
            System.out.println("  - Las emisiones de de carbono bajarian en un 42% aprox.");
            System.out.println("  - La congestion del trafico se veria enormemente reducida");
        } else if (total < 0) { // si los valores no tienen sentido "-"
            System.out.println("Al parecer introdujiste valores que no concuerdan con los solicitados");
        }

        entrada.close(); // cierro la ejecucion de lectura de la terminal
    }
}

// https://www.larepublica.co/finanzas/conozca-los-costos-que-debe-tener-en-cuenta-a-la-hora-de-mantener-un-vehiculo-3113656
// https://www.autofact.com.co/blog/mi-carro/actividades/carpooling-colombia
// https://www.allianz.es/blog/motor/compartir-coche.html#:~:text=Ahorro%20en%20gastos%3A%20al%20compartir,llevar%20a%20tres%20pasajeros%20m%C3%A1s.