package __TALLER_POO2;

class Servicio {
    
    private String nombre;
    private double costoMensual;
    private String descripcion;
    
    public Servicio(String nombre, double costoMensual, String descripcion) {
        this.nombre = nombre;
        this.costoMensual = costoMensual;
        this.descripcion = descripcion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getCostoMensual() {
        return costoMensual;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public String toString() {
        return "Nombre del servicio: " + nombre + "\n" +
            "Costo mensual: " + costoMensual + "\n" +
            "Descripción: " + descripcion
            + "\n";
    }
}