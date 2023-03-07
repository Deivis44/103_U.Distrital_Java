package CAP_2;
public class menu {
     public void opciones(int key){
          salida mostrar =new salida();
      switch (key) {
            case 1:
            PoblacionMundia1 mundo = new PoblacionMundia1(0, 0, key);
            denegacion denegacion = new denegacion();

            double poblacionActual = denegacion.leerdatos();
            mundo.setpoblacionActual(poblacionActual);

            double tasaCrecimiento = denegacion.leerdatos2();
            mundo.settasaCrecimiento(tasaCrecimiento);

            mostrar.mostrarresultado(mundo.getpoblacionActual(),mundo.gettasaCrecimiento());
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
