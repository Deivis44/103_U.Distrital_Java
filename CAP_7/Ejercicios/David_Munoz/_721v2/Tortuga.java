package CAP_7.Ejercicios.David_Munoz._721v2;

class Tortuga {
    int posX;
    int posY;
    boolean boligrafo;
    int direccion;
    public Tortuga() {
        posX = 0;
        posY = 0;
        boligrafo = false;
        direccion = 0;
    }
    public void setBoligrafo(boolean b) {
        boligrafo = b;
    }
    public void voltearDerecha() {
        direccion = (direccion+1) % 4;
    }
    public void voltearIzquierda() {
        direccion = (direccion+3) % 4;
    }
    public void avanzar(int x, Piso piso) {
        switch(direccion) {
            case 0:
                for(int i=1; i <= x; i++) {
                    if(posX + i > 19) {
                        System.out.println("La tortuga se ha salido del piso");
                        return;
                    }
                    if(boligrafo)
                        piso.piso[posY][posX+i] = 1;
                }
                posX += x;
                break;
            case 1:
                for(int i=1; i <= x; i++) {
                    if(posY - i < 0) {
                        System.out.println("La tortuga se ha salido del piso");
                        return;
                    }
                    if(boligrafo)
                        piso.piso[posY-i][posX] = 1;
                }
                posY -= x;
                break;
            case 2:
                for(int i=1; i <= x; i++) {
                    if(posX - i < 0) {
                        System.out.println("La tortuga se ha salido del piso");
                        return;
                    }
                    if(boligrafo)
                        piso.piso[posY][posX-i] = 1;
                }
                posX -= x;
                break;
            case 3:
                for(int i=1; i <= x; i++) {
                    if(posY + i > 19) {
                        System.out.println("La tortuga se ha salido del piso");
                        return;
                    }
                    if(boligrafo)
                        piso.piso[posY+i][posX] = 1;
                }
                posY += x;
                break;
        }
    }
}