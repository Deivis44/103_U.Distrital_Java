package CAP_7.Ejercicios.Santiago_Pineda._720;
public class menu {
    public void opciones(int key){
         controlador a=new controlador();
         vista c=new vista();
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