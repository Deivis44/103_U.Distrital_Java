package CAP_3.Ejercicios_libro._1_Cuenta.v3;

import java.util.Scanner;

public class PruebaCuenta3 {
    public static void main(String[] args) {
        
        Cuenta3 cuenta1 = new Cuenta3("David Muñoz", 50.00);
        Cuenta3 cuenta2 = new Cuenta3("Cristian Camilo", -7.53);

        // muestra el saldo inicial de cada objeto
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        // crea un objeto Scanner para leer datos
        Scanner scan = new Scanner(System.in);

        System.out.print("Escriba el monto a depositar para la cuenta 1: ");
        double montoDeposito = scan.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de cuenta 1%n%n", montoDeposito);
        cuenta1.depositar(montoDeposito);
        
        // muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
        
        /* --- */
        System.out.print("Escriba el monto a depositar para la cuenta 2: ");
        montoDeposito = scan.nextDouble();
        System.out.printf("%nsumando %.2f al saldo de cuenta 1%n%n", montoDeposito);
        cuenta2.depositar(montoDeposito);
        
        scan.close();

        // muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
    }
}