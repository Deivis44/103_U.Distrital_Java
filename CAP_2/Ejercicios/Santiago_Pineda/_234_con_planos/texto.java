package CAP_2.Ejercicios.Santiago_Pineda._234_con_planos;

import java.io.*; 

public class texto {

    public void archivo() {
        vista mostrar =new vista();
        PoblacionMundia1 mundo = new PoblacionMundia1(0, 0,0);
        modelo denegacion = new modelo();

        double poblacionActual = denegacion.leerdatos();
        mundo.setpoblacionActual(poblacionActual);

        double tasaCrecimiento = denegacion.leerdatos2();
        mundo.settasaCrecimiento(tasaCrecimiento);

        mostrar.mostrarresultado(mundo.getpoblacionActual(),mundo.gettasaCrecimiento());


        String file = "texto.txt"; 
        Writer escribe = null; {
        try { 
            escribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF8")); 
             
            escribe.write("\n\t\t\t\t\tarchivo de texto del problema\n\n"); 
            escribe.write(mostrar.mostrarProblema1()); 
            escribe.write("\n\t\t==========================="); 
            escribe.write("\n\t\t\tcalculo de una población mundial dado 5 años"); 
            escribe.write("\n\t\t===========================\n"); 
            escribe.write("\n\tpoblación: "+ mundo.getpoblacionActual()); 
            escribe.write("\n\tporcentaje de crecimiento: " + mundo.gettasaCrecimiento()); 
            escribe.write("\n\tla población a lo largo de 5 años \n"); 
            escribe.write( mostrar.mostrarResultado1(poblacionActual, tasaCrecimiento)); 
            escribe.close(); }
             
             catch (Exception e) { 
                System.out.println("Error al escribir"); } 
             }
        }
   
    }
        //Fin de App
