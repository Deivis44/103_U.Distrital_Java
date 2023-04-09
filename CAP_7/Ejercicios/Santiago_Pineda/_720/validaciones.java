package CAP_7.Ejercicios.Santiago_Pineda._720;
import java.util.Scanner;
public class validaciones {

Scanner sc = new Scanner(System.in);
salida mostrar =new salida();
static salida c=new salida();
public int leerdatos() 
{
    try{
        int numeroVendedor = 0;
        while (true) {
            try {
                numeroVendedor = sc.nextInt();
                if (numeroVendedor < 0) {

                }
                break;
            } catch (Exception e) {
            }
        }
        return numeroVendedor;
    }
    finally{}
}
public Double leerdatos2() 
{
    try{
        Double  valorVenta = 0.0;
        while (true) {
            try {
            
                valorVenta = sc.nextDouble();
                break;
            } catch (Exception e) {
            
            }
        }
        return  valorVenta;
    }
    finally{}
}
public int leerdatos3() 
{
    try{
        int key= 0;
        while (true) {
            try {
               
                key = Integer.parseInt(sc.nextLine());
                if (key <= 0) {
                   
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
    Vendedor mundo = new Vendedor(0);
    validaciones denegacion = new validaciones();
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
    Vendedor mundo = new Vendedor(0);
    validaciones denegacion = new validaciones();
    salida nuevo =new salida();
    menu options =new menu();

    int key=0;
    if(key>2){
    nuevo.mostrarMenu();
    key = denegacion.leerdatos3(); 
    mundo.setkey(key);
    options.opciones(mundo.getkey());
}if (key==2){
    c.letrero();
}

}
}    

