package CAP_7.Ejercicios.Santiago_Pineda._720;
public class menu {
    public void opciones(int key){
         control a=new control();
         salida c=new salida();
     switch (key) {
           case 1:   
           a.a();
           break;
           case 2:
           c.letrero();
           break; 
          default: 
          c.letrero2();
       }
    }
}