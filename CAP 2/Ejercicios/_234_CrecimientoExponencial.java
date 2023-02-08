package Ejercicios;
import java.text.NumberFormat;
import java.util.Scanner; 
public class _234_CrecimientoExponencial {
    public static void main(String args[]) 
        {
            NumberFormat nf1=NumberFormat.getInstance();
            nf1.setGroupingUsed(true);// separacion de miles
            nf1.setMaximumFractionDigits(0);;// deja ver n decimales 

            Scanner entrada = new Scanner(System.in);// ingreso de la variable por teclado 

            long poblacion_mundial;
            double porcentaje_crecimiento;
            
            System.out.println("digite la poblacion mundial ");

            poblacion_mundial=entrada.nextLong();

            System.out.println("digite el porcentaje de crecimiento ");
            
            porcentaje_crecimiento=entrada.nextDouble();

            while(poblacion_mundial>0)
            {
            double poblacion_mundial_2024=poblacion_mundial*((porcentaje_crecimiento/100)+1);
            System.out.println("la poblacion para 2024 sera de: ");
            System.out.println(nf1.format(poblacion_mundial_2024));

            double poblacion_mundial_2025=poblacion_mundial_2024*((porcentaje_crecimiento/100)+1);
            System.out.println("la poblacion para 2025 sera de: ");
            System.out.println(nf1.format(poblacion_mundial_2025));

            double poblacion_mundial_2026=poblacion_mundial_2025*((porcentaje_crecimiento/100)+1);
            System.out.println("la poblacion para 2026 sera de: ");
            System.out.println(nf1.format(poblacion_mundial_2026));

            double poblacion_mundial_2027=poblacion_mundial_2026*((porcentaje_crecimiento/100)+1);
            System.out.println("la poblacion para 2027 sera de: ");
            System.out.println(nf1.format(poblacion_mundial_2027));
            break;
            }

            while(poblacion_mundial<0)
            {
            System.out.println("digite los datos de nuevo \n");

            System.out.println("digite la poblacion mundial ");

            poblacion_mundial=entrada.nextLong();

            System.out.println("digite el porcentaje de crecimiento ");
            
            porcentaje_crecimiento=entrada.nextDouble();
            }
            entrada.close();
        }
    }