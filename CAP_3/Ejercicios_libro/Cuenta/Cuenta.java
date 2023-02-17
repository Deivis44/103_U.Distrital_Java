package CAP_3.Ejercicios_libro.Cuenta;

/* Clase Cuenta que contiene una variable de instancia llamada nombre
y métodos para establecer y obtener su valor. */

public class Cuenta {
    
    private String nombre; // variable de instancia

    // metodo para establecer el nombre en el objeto
    public void establecerNombre(String nombre) {
        this.nombre = nombre; // almacenar el nombre
    }

    // metodo para obetener el nombre del objeto
    public String obtenerNombre() {
        return nombre; // devuelve el valor de nombre a quien lo invocó
    }
}