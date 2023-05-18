package __TALLER1_POO2;

import java.util.*;

class Cliente {
    
    private String nombre;
    private String correoElectronico;
    private List<Servicio> servicios;
    
    public Cliente(String nombre, String correoElectronico) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        servicios = new ArrayList<Servicio>();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    public List<Servicio> getServicios() {
        return servicios;
    }
    
    public boolean agregarServicio(Servicio servicio) {
        return servicios.add(servicio);
    }
    
    public boolean quitarServicio(String nombreServicio) {
        for (Servicio servicio: servicios) {
            if(servicio.getNombre().equalsIgnoreCase(nombreServicio)) {
                return servicios.remove(servicio);
            }
        }
        return false;
    }
    
    public String toString() {
        String strServicios = "";
        for (Servicio servicio: servicios) {
            strServicios += "- " + servicio.getNombre() + "\n";
        }
        return "Nombre del cliente: " + nombre + "\n" +
            "Correo electrónico: " + correoElectronico + "\n" +
            "Servicios contratados:\n" + strServicios
            + "\n";
    }
}