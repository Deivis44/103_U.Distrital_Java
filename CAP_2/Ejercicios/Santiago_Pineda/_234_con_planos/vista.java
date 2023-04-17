package CAP_2.Ejercicios.Santiago_Pineda._234_con_planos;
import java.text.NumberFormat;
import java.util.Scanner;
public class vista{
     Scanner entrada = new Scanner(System.in);
     
     public void mostrar2() {
      System.out.println("\t\t\tProblema 2.34 (Calculadora del crecimiento de la población mundial)\n");
       System.out.println("\tEscriba una aplicación que reciba valores de la tasa de crecmiento y la poblacion actual como entrada");
       System.out.println("\tpara luego muestrar la población mundial estimada después de uno, dos, tres, cuatro y cinco años\n");
     }

     public String mostrarProblema1(){
    
      String mensajeMostrarProblema;
      
      mensajeMostrarProblema="\t\t\tProblema 2.34 (Calculadora del crecimiento de la población mundial)"+"\nEscriba una aplicación que reciba valores de la tasa de crecmiento y la poblacion actual como entrada"+"\npara luego muestrar la población mundial estimada después de uno, dos, tres, cuatro y cinco años";
      
      return mensajeMostrarProblema;
  } 
     public void mostrarMenu() {
      System.out.println("");
      System.out.println("\t1. generar el calculo de una poblacion");
       System.out.println("\t2. Salir\n\n");
     }
     public void datos() {
     System.out.print("Ingrese la población mundial actual: \n");
     }
     public void datos2() {
     System.out.print("Ingrese la tasa de crecimiento actual: \n");
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
      public void Exception() throws java.lang.Exception {
      throw new Exception("\tLa población debe ser un número positivo\n");
      }
      
     public void error() {
       System.out.println("el valor ingresado no es un numero:\n ");
       }

      public void mostrarresultado(double poblacionActual,double tasaCrecmiento){
      NumberFormat nf1=NumberFormat.getInstance();
      nf1.setGroupingUsed(true);
      nf1.setMaximumFractionDigits(0);

      PoblacionMundia1 poblacion = new PoblacionMundia1(poblacionActual,tasaCrecmiento, 0);
      System.out.println("Población mundial actual: " + nf1.format(poblacion.getpoblacionActual()));
      System.out.println("Población mundial estimada en 1 año: " + nf1.format(poblacion.calcularPoblacion(1)));
      System.out.println("Población mundial estimada en 2 años: " + nf1.format(poblacion.calcularPoblacion(2)));
      System.out.println("Población mundial estimada en 3 años: " + nf1.format(poblacion.calcularPoblacion(3)));
      System.out.println("Población mundial estimada en 4 años: " + nf1.format(poblacion.calcularPoblacion(4)));
      System.out.println("Población mundial estimada en 5 años: " + nf1.format(poblacion.calcularPoblacion(5)));
   }  
    public String mostrarResultado1(double poblacionActual,double tasaCrecmiento){
    NumberFormat nf1=NumberFormat.getInstance();
    nf1.setGroupingUsed(true);
    nf1.setMaximumFractionDigits(0);
    
    String salida;
    PoblacionMundia1 poblacion = new PoblacionMundia1(poblacionActual,tasaCrecmiento, 0);
    
    salida="\n\tPoblación mundial estimada en 1 año: " + (nf1.format(poblacion.calcularPoblacion(1)))+"\n\tPoblación mundial estimada en 2 años: " + nf1.format(poblacion.calcularPoblacion(2))+"\n\tPoblación mundial estimada en 3 años: " + nf1.format(poblacion.calcularPoblacion(3))+"\n\tPoblación mundial estimada en 4 años: " + nf1.format(poblacion.calcularPoblacion(4))+"\n\tPoblación mundial estimada en 5 años: " + nf1.format(poblacion.calcularPoblacion(5));
 
    return salida;
  }  
   }



