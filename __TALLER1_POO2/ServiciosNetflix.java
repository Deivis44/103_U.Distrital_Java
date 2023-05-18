package __TALLER1_POO2;

import java.util.*;
import javax.swing.JOptionPane;

public class ServiciosNetflix {
    
    public void abrirAplicacion() {

        Interfaz interfaz = new Interfaz();
        interfaz.interfaz_bienvenida();
        
        Map<String, Servicio> inventario = new HashMap<String, Servicio>(); //Mapa para el inventario de servicios
        List<Cliente> clientes = new ArrayList<Cliente>(); //Lista para los clientes
        
        int opcion = 0;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Seleccione una opción:\n" +
                    "1. Crear servicio\n" +
                    "2. Vender servicio\n" +
                    "3. Buscar servicio por cliente\n" +
                    "4. Ver inventario de servicios\n" +
                    "5. Ver lista de clientes\n" +
                    "6. Mostrar cantidad de servicios en inventario\n" +
                    "7. Mostrar cantidad de clientes suscritos\n" +
                    "8. Vaciar colecciones\n" +
                    "9. Cambiar plan de un cliente\n" +
                    "10. Eliminar cliente\n" +
                    "0. Salir"
                ));
                
                switch(opcion) {
                    case 1: //Crear servicio
                        String nombreServicio = JOptionPane.showInputDialog("Ingrese nombre del servicio:");
                        int costoMensual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese costo mensual del servicio:"));
                        String descripcionServicio = JOptionPane.showInputDialog("Ingrese una breve descripción del servicio:");
                        inventario.put(nombreServicio, new Servicio(nombreServicio, costoMensual, descripcionServicio));
                        JOptionPane.showMessageDialog(null, "Servicio creado exitosamente!");
                        break;
                    case 2: //Vender servicio
                        String nombreCliente = JOptionPane.showInputDialog("Ingrese nombre del cliente:");
                        String correoCliente = JOptionPane.showInputDialog("Ingrese correo electrónico del cliente:");
                        Cliente clienteNuevo = new Cliente(nombreCliente, correoCliente);
                        int serviciosVenta = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos servicios desea comprar?"));
                        for (int i = 0; i < serviciosVenta; i++) {
                            String servicioDeseado = JOptionPane.showInputDialog("Ingrese nombre del servicio a vender:");
                            if(inventario.containsKey(servicioDeseado)) {
                                clienteNuevo.agregarServicio(inventario.get(servicioDeseado));
                            } else {
                                JOptionPane.showMessageDialog(null, "Servicio no disponible en el inventario");
                            }
                        }
                        clientes.add(clienteNuevo);
                        JOptionPane.showMessageDialog(null, "Venta exitosa! Cliente y servicio(s) añadidos a la base de datos.");
                        break;
                    case 3: //Buscar servicio por cliente
                        String nombreClienteBusqueda = JOptionPane.showInputDialog("Ingrese nombre del cliente:");
                        for (Cliente cliente: clientes) {
                            if(cliente.getNombre().equalsIgnoreCase(nombreClienteBusqueda)) {
                                JOptionPane.showMessageDialog(null, "Servicio(s) de " + cliente.getNombre() + ": " + cliente.getServicios());
                                break;
                            }
                        }
                        break;
                    case 4: //Ver inventario de servicios
                        String inventarioServicios = "";
                        for(Servicio servicio: inventario.values()) {
                            inventarioServicios += servicio + "\n";
                        }
                        JOptionPane.showMessageDialog(null, inventarioServicios);
                        break;
                    case 5: //Ver lista de clientes
                        String listaClientes = "";
                        for(Cliente cliente: clientes) {
                            listaClientes += cliente + "\n";
                        }
                        JOptionPane.showMessageDialog(null, listaClientes);
                        break;
                    case 6: //Mostrar cantidad de servicios en inventario
                        JOptionPane.showMessageDialog(null, "La cantidad de servicios en inventario es: " + inventario.size());
                        break;
                    case 7: //Mostrar cantidad de clientes suscritos
                        JOptionPane.showMessageDialog(null, "La cantidad de clientes suscritos es: " + clientes.size());
                        break;
                    case 8: //Vaciar colecciones
                        inventario.clear();
                        clientes.clear();
                        JOptionPane.showMessageDialog(null, "Las colecciones han sido vaciadas.");
                        break;
                    case 9: //Cambiar plan de un cliente
                        String nombreClientePlan = JOptionPane.showInputDialog("Ingrese nombre del cliente:");
                        boolean encontrado = false;
                        for (Cliente cliente: clientes) {
                            if(cliente.getNombre().equalsIgnoreCase(nombreClientePlan)) {
                                String servicioAntiguo = JOptionPane.showInputDialog("Ingrese nombre del servicio que desea cambiar:");
                                if(cliente.quitarServicio(servicioAntiguo)) {
                                    String servicioNuevo = JOptionPane.showInputDialog("Ingrese nombre del servicio nuevo:");
                                    if(inventario.containsKey(servicioNuevo)) {
                                        cliente.agregarServicio(inventario.get(servicioNuevo));
                                        JOptionPane.showMessageDialog(null, "Plan cambiado exitosamente.");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Servicio no disponible en el inventario.");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "El cliente no tiene el servicio que desea cambiar.");
                                }
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                        }
                        break;
                    case 10: //Eliminar cliente
                        String nombreClienteEliminar = JOptionPane.showInputDialog("Ingrese nombre del cliente:");
                        Cliente clienteEliminar = null;
                        for (Cliente cliente: clientes) {
                            if(cliente.getNombre().equalsIgnoreCase(nombreClienteEliminar)) {
                                clienteEliminar = cliente;
                                break;
                            }
                        }
                        if(clienteEliminar != null) {
                            clientes.remove(clienteEliminar);
                            JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                        }
                        break;
                    case 0: //Salir
                        JOptionPane.showMessageDialog(null, "Hasta luego!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida.");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: por favor ingrese una opción válida.");
            }
        } while(opcion != 0);
    }
}