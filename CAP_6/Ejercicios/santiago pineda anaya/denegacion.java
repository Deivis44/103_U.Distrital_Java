package CAP_6;
import java.util.Scanner;
public class denegacion{
Scanner sc = new Scanner(System.in);
salida mostrar =new salida();
public double leerdatos() 
{
    try{
        double cateto = 0;
        while (true) {
            try {
                mostrar.datos();
                cateto = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                mostrar.error();
            }
        }
        return cateto;
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
    procesos mundo = new procesos();
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
    procesos mundo = new procesos();
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
