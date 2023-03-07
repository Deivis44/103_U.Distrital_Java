package CAP_2.Ejercicios.Santiago_Pineda._234;

import java.util.Scanner;
public class denegacion{
Scanner sc = new Scanner(System.in);
salida mostrar =new salida();
public double leerdatos() 
{
    try{
        double poblacionActual = 0;
        while (true) {
            try {
                mostrar.datos();
                poblacionActual = Double.parseDouble(sc.nextLine());
                if (poblacionActual <= 0) {
                   mostrar.Exception();
                }
                break;
            } catch (Exception e) {
                mostrar.error();
            }
        }
        return poblacionActual;
    }
    finally{}
}
public double leerdatos2() 
{
    try{
        double tasaCrecimiento = 0;
        while (true) {
            try {
                mostrar.datos2();
                tasaCrecimiento = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                mostrar.error();
            }
        }
        return tasaCrecimiento;
    }
    finally{}
}
public int leerdatos3() 
{
    try{
        int key= 0;
        while (true) {
            try {
               mostrar.datos3();
                key = Integer.parseInt(sc.nextLine());
                if (key <= 0) {
                    mostrar.noexiste();
                }
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return key;
        
    }
    finally{} 
}

public static void mostrar() 
{
    PoblacionMundia1 mundo = new PoblacionMundia1(0, 0, 0);
    denegacion denegacion = new denegacion();
    salida nuevo =new salida();
    menu options =new menu();

    int key;
    do{
    nuevo.mostrarMenu();
    key = denegacion.leerdatos3(); 
    mundo.setkey(key);
    options.opciones(mundo.getkey());

}while(key==1);
}
public static void mostrar2() 
{
    PoblacionMundia1 mundo = new PoblacionMundia1(0, 0, 0);
    denegacion denegacion = new denegacion();
    salida nuevo =new salida();
    menu options =new menu();

    int key;
    do{
    nuevo.mostrarMenu();
    key = denegacion.leerdatos3(); 
    mundo.setkey(key);
    options.opciones(mundo.getkey());

}while(key>2);
}
}