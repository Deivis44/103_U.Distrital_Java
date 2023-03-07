package cap_4;
public class menu {
     public void opciones(int key){
          salida mostrar =new salida();
      switch (key) {
            case 1:
            denegacion denegacion = new denegacion();
            calculo a = new calculo();

            String binario = denegacion.leerdatos();
            a.setBinario(binario);
    
            int decimal = a.convertir();
            
            System.out.println("El número decimal equivalente es: " + decimal);
            mostrar.espacio();
    
            case 2:
            salida ver =new salida();
            ver.mostrarDespedida();
            break;
                
           default: 
           mostrar.noexiste();
        }



     }
}
