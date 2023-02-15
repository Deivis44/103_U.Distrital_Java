package CAP_3.Ejercicios_libro.Cuenta;

// crear y manipular un objeto cuenta

import java.util.Scanner;
public class PruebaCuenta {
    public static void main(String[] args) {
        // crea un objeto Scanner para obtener la entra desde la terminal
        Scanner entrada = new Scanner(System.in);

        // crea un objeto Cuenta y lo asigna la variable 'miCuenta'
        _1_Cuenta miCuenta = new _1_Cuenta(); 
        /* instancia objeto para metodo main, variable para el objeto = new , llama al constructor de la clase */

        System.out.printf("El nombre inicial es: %s%n%n", miCuenta.obtenerNombre()); // = null porque no hay nada aún

        // pide y lee el nombre
        System.out.println("Introduzca el nombre: ");
        String elNombre = entrada.nextLine(); // lee una linea de texto
        miCuenta.establecerNombre(elNombre); // coloca 'elNombre' en miCuenta
        /* se le birnda el argumento 'elNombre' a el parametro del metodo, y coinciden */
        System.out.println(); // ! linea en blanco

        // muestra el nombre almacenado en el objeto 'miCuenta'
        System.out.printf("El nombre en el objeto miCuenta es:%n%s%n", miCuenta.obtenerNombre());

        entrada.close();
    }
}