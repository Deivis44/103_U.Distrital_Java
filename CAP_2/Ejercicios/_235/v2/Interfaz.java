package CAP_2.Ejercicios._235.v2;

public class Interfaz {

    public double promKM_litro;
    public float total;

    public void interfaz() {
        System.out.println("----- BIENVENIDO A LA CALCULADORA DE AHORRO -----\n"); // interfaz de usuario simple
        System.out.println("                 .--------.");
        System.out.println("            ____/_____|___ \\___");
        System.out.println("           O    _   - |   _   ,*");
        System.out.println("            '--(_)-------(_)--'   David\n");
        System.out.println("    (Actualmente para ir a tu trabajo en auto)");
    }
    public void informacion(double promKM_litro) {
        this.promKM_litro = promKM_litro;

        System.out.println("\n-------------------------------------------------------"); // datos de consulta en la web
        System.out.println("* COSTO DIARIO (prom. Bogotá): $89.000 y $120.000 *");
        System.out.println("* PROM (Km/L) al día: 26Km *" + "\n\tEl tuyo es de: " + promKM_litro + "Km");
        System.out.println("-------------------------------------------------------");
    }

    public float calcularTotal(int kilometros, float litroGasolina, int cuotasPARQ, int peaje) {
        return total = ((kilometros*litroGasolina) + cuotasPARQ + peaje);
    }

    public void recomendaciones() {
        if (total > 0 && total <= 120000) { // rango dentro de los datos comunes en un día
            if (total >= 89000 && total <= 120000) { // existe el caso de que sea menor o igual al rango definido anteriormente
                System.out.println("// Gastas lo que usualmente se hace en un día en la ciudad = " + total + "$");
                
                // datos relevantes consultados en la web sobre los beneficios de compartir el carro
                System.out.println("  ! Podrias considerar la opción de compartir tu carro:");
                System.out.println("  - Disminuirias en un 75% el costo total de un trayecto normal al día");
                System.out.println("  - Las emisiones de de carbono bajarian en un 42% aprox.");
                System.out.println("  - La congestion del trafico se veria enormemente reducida");
            } else {
                System.out.println("// Gastas menos de lo que usualmente se hace en un día en la ciudad = " + total + "$");
            }

        } if (total > 120000) { // si excede el rango subestimado
            System.out.println("// Te recomendamos hacer uso de la estrategia 'Carpooling', en en día gastas = " + total + "$ eso es más de lo estimado");
            System.out.println("  ! Considera la opción de compartir tu carro:");
            System.out.println("  - Disminuirias en un 75% el costo total de un trayecto normal al día");
            System.out.println("  - Las emisiones de de carbono bajarian en un 42% aprox.");
            System.out.println("  - La congestion del trafico se veria enormemente reducida");
        } else if (total < 0) { // si los valores no tienen sentido "-"
            System.out.println("Al parecer introdujiste valores que no concuerdan con los solicitados");
        }
    }
}