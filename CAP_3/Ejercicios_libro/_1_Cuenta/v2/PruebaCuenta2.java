package CAP_3.Ejercicios_libro._1_Cuenta.v2;

// Uso del constructor de Cuenta para inicializar la variable de instancia
// nombre al momento de crear el objeto Cuenta.

public class PruebaCuenta2 {
    
    public static void main(String[] args) {
        
        // crea dos objetos cuenta
        Cuenta2 cuenta1 = new Cuenta2("David Muñoz");
        Cuenta2 cuenta2 = new Cuenta2("Cristian Camilo");

        // muestra el valor inicial de nombre para cada cuenta
        System.out.printf("El nombre de la cuenta1 es: %s%n", cuenta1.obtenerNombre());
        System.out.printf("El nombre de la cuenta2 es: %s%n", cuenta2.obtenerNombre());
        
    }
}