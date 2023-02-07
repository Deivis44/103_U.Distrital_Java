// programa que recibe dos números y muestra la suma

import java.util.Scanner; // llama a la clase scanner

public class Suma {
    
    public static void main(String[] args) {

        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, suma; // variables para almacenar los numeros y registrar la suma de estos

        System.out.print("Escriba el primer numero entero: ");
        numero1 = entrada.nextInt(); // lee el primer numero del usuario
        
        System.out.print("Escriba el segundo numero entero: ");
        numero2 = entrada.nextInt(); // lee el segundo numero del usuario

        suma = numero1 + numero2; // suma de los 2 numeros

        System.out.printf("La suma es de %d\n", suma); // '%d' es para la el formato de la variable
    }
}
