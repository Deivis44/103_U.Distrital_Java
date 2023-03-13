package CAP_3.Ejercicios_libro._1_Cuenta.v3;

/* La clase Cuenta con una variable de instancia double llamada saldo y un constructor,
 ademas de un metodo llamada deposito que realiza la validacion */

public class Cuenta3 {
    
    private String nombre; // variable de instancia
    private double saldo; // variable de instancia

    // constructor de cuenta que recibe dos parametros
    public Cuenta3(String nombre, double saldo){
        this.nombre = nombre; // asigna nombre a la variable de instancia nombre

        // valida que el saldo sea mayor que 0.0; de lo contrario,
        // la variable de instancia saldo mantiene su valor inicial predeterminado de 0.0
        if (saldo > 0.0) {
            this.saldo = saldo;
        }
    }

    // metodo que deposita (suma) solo una cantidad valida al saldo
    public void depositar(double montoDeposito) {
        if (montoDeposito > 0.0) { // si el montoDeposito es valido
            saldo = saldo + montoDeposito; // lo suma al saldo
        }
    }

    // metodo que devuelve el saldo de la cuenta
    public double obtenerSaldo() {
        return saldo;
    }

    // metodo que establece el nombre
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    // metodo que devuelve el nombre
    public String obtenerNombre() {
        return nombre;    
    }
}
