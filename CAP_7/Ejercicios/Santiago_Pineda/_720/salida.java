package CAP_7.Ejercicios.Santiago_Pineda._720;

public class salida {
    public void texto2() {
        System.out.println("Ventas por producto y vendedor:");
     }
     public void textos4(){
        System.out.println("Producto\tVendedor 1\tVendedor 2\tVendedor 3\tVendedor 4\tTotal");
     }
     public void textos5(){
        System.out.println("Ventas totales por vendedor:");
     }
     public void textos6(){
        System.out.println("Vendedor\tVentas totales");
     }
   public void mostrar() {
   System.out.println("\t\t\t\t\t\t\t\t7.20 (Ventas totales)\n");
   System.out.print("Use un arreglo bidimensional para resolver el siguiente problema: una compañía tiene cuatro vendedores (1 a 4) que venden cinco productos distintos (1 a 5).Una vez al día,cada vendedor pasa una nota por cada tipo de producto vendido.");
   System.out.print("Cada nota contiene lo siguiente: a) El número del vendedor,b) El número del producto ,c) El valor total en dólares de ese producto vendido en ese día Así,cada vendedor pasa entre 0 y 5 notas de venta por día.Suponga que está disponible");
   System.out.print("la información sobre todas las notas del mes pasado.Escriba una aplicación que lea toda esta información para las ventas del último mes y que resuma las ventas totales por vendedor,y por producto. Todos los totales deben guardarse en el");
   System.out.print("arreglo bidimensional ventas.Después,muestre los resultados en formato tabular,en donde cada columna represente a un vendedor específico y cada fila simbolice un producto.Saque el total de cada fila para obtener las ventas totales de cada");
   System.out.println("producto durante el último mes.Calcule el total de cada columna para sacar las ventas totales de cada vendedor durante el último mes.Su impresión tabular debe incluir estos totales cruzados a la derecha de las filas totalizadas,y en la parte inferior de las columnas totalizadas\n");

}
public void mostrarMenu() {
   System.out.println("");
   System.out.println("\t1. generar el calculo de la venta de productos por vendedor");
    System.out.println("\t2. Salir\n");
  }

  public void letrero() {
   System.out.println("gracias por el uso del software");
   
  }

  public void letrero2() {
   System.out.println("dato mal escrito\n");
   
  }
  public void vendedor() {
   System.out.println("ingrese el numero de vendedor\n");
   
  }
public void dato() {
   System.out.println("los datos ingresados tiene que ser mayores a 0 y menores o iguales a 4\n");
}
public void n() {
   System.out.println("no puede ingresar letras o texto,vuelva a escribirlos por favor\n");
}
public void producto() {
   System.out.println("ingrese el valor del producto\n");
}
public void no() {
   System.out.println("el valor ingresado tiene que ser mayor a 0 o tiene que ser menor a 5,intentelo de nuevo\n");
}
public void venta() {
   System.out.println("ingrese el valor de la venta\n");
}
public void negativo() {
   System.out.println("el dato no puede ser negativo,intentelo de nuevo por favor\n");
}

}


