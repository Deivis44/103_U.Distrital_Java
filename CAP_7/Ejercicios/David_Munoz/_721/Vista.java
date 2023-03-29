package CAP_7.Ejercicios.David_Munoz._721;

import java.util.*;

class Vista {
    public void iniciarVista() {
        Interfaz interfazU = new Interfaz();
        interfazU.mostrarComandos();
        interfazU.interfaz_bienvenida();
        try (Scanner sc = new Scanner(System.in)) {
            Controlador controlador = new Controlador();
            int comando = 0;
            int distancia = 0;
            while(true) {
                System.out.print("Introduce un comando: ");
                comando = sc.nextInt();
                if(comando == 5) {
                    System.out.print("Introduce una distancia: ");
                    distancia = sc.nextInt();
                }
                controlador.ejecutarComando(comando, distancia);
            }
        }
    }
}