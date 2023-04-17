package CAP_2.Ejercicios.Santiago_Pineda._234_con_planos;

public class controlador{
     public void opciones(int key){
          texto a=new texto();
          vista mostrar =new vista();
           switch (key) {
            case 1:
            a.archivo();
            break;
        
            case 2:
            vista ver =new vista();
            ver.mostrarDespedida();
            break;
                
           default: 
           mostrar.noexiste();
        }



     }
}
