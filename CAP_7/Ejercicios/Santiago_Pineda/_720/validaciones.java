package CAP_7.Ejercicios.Santiago_Pineda._720;
import java.util.Scanner;
public class validaciones {

static Scanner sc = new Scanner(System.in);
vista mostrar =new vista();
static vista c=new vista();
public int leerdatos() 
{
    try{
        int numeroVendedor = 0;
        while (true) {
            try {

                c.vendedor();
                numeroVendedor = Integer.parseInt(sc.nextLine());
        
                while (numeroVendedor < 0||numeroVendedor>4) {
                    c.dato();
                    numeroVendedor = Integer.parseInt(sc.nextLine());
                }
                break;
            } catch (Exception e) {
                c.n();
            }
        }
        return numeroVendedor;
    }
    finally{}
}


public int leerdatos4() 
{
    try{
        int numeroVendedor = 0;
        while (true) {
            try {
                c.producto();
                numeroVendedor = Integer.parseInt(sc.nextLine());
                
                while (numeroVendedor < 0||numeroVendedor>5) {
                   c.no();
                    numeroVendedor = Integer.parseInt(sc.nextLine());
                }
                break;
            } catch (Exception e) {
               c.n();
            }
        }
        return numeroVendedor;
    }
    finally{}
}
public double leerdatos2() 
{
    try{
        double valorVenta= 0;
        while (true) {
            try {
               c.venta();
                valorVenta = Double.parseDouble(sc.nextLine());
                while (valorVenta<0) {
                   c.negativo();
                    valorVenta = Double.parseDouble(sc.nextLine());
                }
                break;
            } catch (Exception e) {
                c.n();
            }
        }
        
        return valorVenta;
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
                c.n();
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
    vista nuevo =new vista();
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
    vista nuevo =new vista();
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

