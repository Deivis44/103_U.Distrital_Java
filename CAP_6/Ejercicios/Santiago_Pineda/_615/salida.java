package CAP_6.Ejercicios.Santiago_Pineda._615;

import java.util.Scanner;
public class salida{
     Scanner entrada = new Scanner(System.in);
     catetos mundo = new catetos();

     public void mostrar2() {
      System.out.println("\t\t\tProblema 6.15 (calculadora de pitagoras)\n");
       System.out.println("\tEscriba una aplicación que reciba valores de los catetos de un trinagulo como entrada");
       System.out.println("\tpara luego mostrar la hipotenusa \n");
     }
     public void mostrarMenu() {
      System.out.println("");
      System.out.println("\t1. generar el calculo de una hipotenusa ");
       System.out.println("\t2. Salir\n\n");
     }
     public void datos() {
     System.out.print("Ingrese el valor del cateto: \n");
     }
     
     public void datos3() {
      System.out.print("ingrese una opcion: ");
      }
     
     public void mostrarDespedida(){
     System.out.println("\tse agradece el uso de Software"); 
     System.out.println("\tRegresa pronto");
    }
    public void noexiste(){
      System.out.println("el valor ingrasado no existe en el menu ingrese 1 o 2\n");
     }
      
     public void error() {
       System.out.println("el valor ingresado no es un numero:\n ");
       }
     
    }
   
   



