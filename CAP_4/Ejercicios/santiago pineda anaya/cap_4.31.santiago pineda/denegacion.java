package cap_4;
import java.util.Scanner;
public class denegacion{
Scanner sc = new Scanner(System.in);
salida nuevo =new salida();
calculo a = new calculo();
public String leerdatos() 
{
       String binario;
       int i=0;
        while (true) {
            try {
                nuevo.datos();
                nuevo.espacio();
                 binario = sc.next();
                 for( i=0; i<binario.length(); i++){
                    if(binario.charAt(i) != '0' && binario.charAt(i) != '1'){
                        nuevo.error2();
                    }   
                }
                break;
            } catch (NullPointerException a) {
                nuevo.error();
            }
            finally{}
    }
    return binario;
}
public int leerdatos3() 
{
    try{
        int key= 0;
        while (true) {
            try {
               nuevo.datos3();
                key = Integer.parseInt(sc.nextLine());
                if (key <= 0) {
                    nuevo.noexiste();
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
    calculo a = new calculo();
    denegacion denegacion = new denegacion();
    salida nuevo =new salida();
    menu options =new menu();

    int key;
    do{
    nuevo.mostrarMenu();
    key = denegacion.leerdatos3(); 
    a.setkey(key);
    options.opciones(a.getkey());

}while(key==1);
}
public static void mostrar2() 
{
    calculo a = new calculo();
    denegacion denegacion = new denegacion();
    salida nuevo =new salida();
    menu options =new menu();

    int key;
    do{
    nuevo.mostrarMenu();
    key = denegacion.leerdatos3(); 
    a.setkey(key);
    options.opciones(a.getkey());

}while(key>2);
}
}



