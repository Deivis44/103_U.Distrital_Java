package CAP_7.Ejercicios.David_Munoz._721;

class Controlador {
    Piso piso;
    public Controlador() {
        piso = new Piso();
    }
    public void ejecutarComando(int comando, int distancia) {
        switch(comando) {
            case 1:
                piso.tortuga.setBoligrafo(false);
                break;
            case 2:
                piso.tortuga.setBoligrafo(true);
                break;
            case 3:
                piso.tortuga.voltearDerecha();
                break;
            case 4:
                piso.tortuga.voltearIzquierda();
                break;
            case 5:
                piso.tortuga.avanzar(distancia, piso);
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Comando no valido");
                break;
        }
        piso.dibujar();
    }
}