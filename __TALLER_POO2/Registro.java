package __TALLER_POO2;

public class Registro {

    public void registro_persona() {

        Interfaz interfaz_usuario = new Interfaz();
        int opcion = interfaz_usuario.interfaz_bienvenida();
    
        switch (opcion) {
            case 1:
                interfaz_usuario.interfaz_inicar_sesion();
                break;
            case 2:
                interfaz_usuario.interfaz_crear_cuenta();
                break;
        }
    }
}