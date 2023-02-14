// compara enteros usando estructuras de control ‘if’, con operadores relaciones y de igualdad

package CAP_2.Ejercicios_libro;
import java.util.Scanner;    
public class _6_Comparacion {

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Escriba el primer entero: ");
        numero1 = entrada.nextInt();
        System.out.print("Escriba el segundo entero: ");
        numero2 = entrada.nextInt();

        if (numero1 == numero2) {
            System.out.printf("%d == %d\n", numero1, numero2);
        }
        if (numero1 != numero2) {
            System.out.printf("%d != %d \n", numero1, numero2);
        }
        if (numero1 < numero2) {
            System.out.printf("%d < %d\n", numero1, numero2);
        }
        if (numero1 > numero2) {
            System.out.printf("%d > %d\n", numero1, numero2);
        }
        if (numero1 <= numero2) {
            System.out.printf("%d <= %d\n", numero1, numero2);
        }
        if (numero1 >= numero2) {
            System.out.printf("%d >= %d\n", numero1, numero2);
        }

        entrada.close(); // termino proceso de escaneo
    }
}
