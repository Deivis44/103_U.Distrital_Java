package CAP_4.Ejercicios.Santiago_Pineda._431;

import java.util.Scanner;
public class salida{
     Scanner entrada = new Scanner(System.in);
     static calculo a = new calculo();

     public void mostrar() {
      System.out.println("\t\t\tProblema 4.31 (Imprimir el equivalente decimal de un número binario)\n");
       System.out.println("\tEscriba una aplicación que reciba como entrada un entero que contenga sólo dígitos 0 y 1 ");
       System.out.println("\t(es decir, un entero binario), y que imprima su equivalente decimal.\n");
     }
     public void mostrarMenu() {
     System.out.println("1.seguir al programa");
     System.out.println("2.Salir del programa\n");
     }
     public void datos() {
     System.out.print("\tIngrese un numero binario a convertir: \n");
     }
     public void mostrarDespedida(){
     System.out.println("se agradece el uso de Software");
     System.out.println("Regresa pronto\n");
    }
    public void noexiste(){
    System.out.println("el valor ingrasado no existe en el menu ingrese 1 o 2\n");
    }

    public void error() {
    System.out.println("el valor no es un numero binario,intentelo otra vez por favor\n");
    }
    public void error2() {
    int decimal = a.convertir();
    System.out.println("El número decimal equivalente es: "+ decimal);
    }

    public void datos3() {
    System.out.print("ingrese una opcion ");
    
    }

    public void espacio() {
      System.out.print(" ");
      }
    }    
   



