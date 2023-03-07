package CAP_6.Ejercicios.Santiago_Pineda._615;

public class menu {
     public void opciones(int key){
          salida mostrar =new salida();
      switch (key) {
            case 1:
            catetos mundo = new catetos();
            denegacion denegacion = new denegacion();

            double cateto1 = denegacion.leerdatos();
            mundo.setcateto1(cateto1);

            double cateto2 = denegacion.leerdatos();
            mundo.setcateto2(cateto2);

            double hipotenusa = mundo.hipotenusa();
            System.out.println("El valor de la hipotenusa es: " + hipotenusa);

            break;
        
            case 2:
            salida ver =new salida();
            ver.mostrarDespedida();
            break;
                
           default: 
           mostrar.noexiste();
        }



     }
}
