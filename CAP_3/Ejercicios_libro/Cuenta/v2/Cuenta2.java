package CAP_3.Ejercicios_libro.Cuenta.v2;

// Clase Cuenta v2. con un constructor que inicalizar el nombre

public class Cuenta2 {
    
    private String nombre;

    // el constructor inicializa nombre con el parámetro nombre
    public Cuenta2(String nombre) { // el nombre del constructor es el nombre de la clase
        this.nombre = nombre;
    }

    // método para establecer el nombre
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    // métodos para recuperar el nombre
    public String obtenerNombre() {
        return nombre;
    }
}