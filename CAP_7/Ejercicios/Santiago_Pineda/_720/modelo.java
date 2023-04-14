package CAP_7.Ejercicios.Santiago_Pineda._720;
import java.util.Scanner;

public class procesos {
    Vendedor[] vendedores = new Vendedor[4];
    Scanner scanner = new Scanner(System.in); 
 validaciones a=new validaciones();
    public void hacer()
    {
    for (int i = 0; i < 5; i++) {
        System.out.print((i+1) + "\t\t");
        double totalPorProducto = 0;
        for (int j = 0; j < 4; j++) {
            double ventas = vendedores[j].getVentasPorProducto()[i];
            System.out.print("$" + ventas + "\t\t");
            totalPorProducto += ventas;
        }
        System.out.print("$" + totalPorProducto + "\n");
    }
    }
public void hacer3(){
    for (int i = 0; i < 4; i++) {
        System.out.println((i+1) + "\t\t$" + vendedores[i].getTotalVentas());
}
}
public void hacer4(){
    for (int j = 0; j < 20; j++) {

        int numeroVendedor = a.leerdatos();
        int numeroProducto = a.leerdatos4();
        double valorVenta = a.leerdatos2();
        
        System.out.println("los datos inscritos van asi el vendedor "+ numeroVendedor +" vendio el producto "+ numeroProducto +" con el precio "+ valorVenta);

        vendedores[numeroVendedor-1].agregarVenta(numeroProducto, valorVenta);
    }  
                }
                    
public void hacer2(){
    for (int i = 0; i < 4; i++) {
        vendedores[i] = new Vendedor(i+1);
    }
}
}
