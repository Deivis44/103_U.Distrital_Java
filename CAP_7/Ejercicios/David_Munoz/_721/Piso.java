package CAP_7.Ejercicios.David_Munoz._721;

class Piso {
    int[][] piso;
    Tortuga tortuga;
    public Piso() {
        piso = new int[20][20];
        tortuga = new Tortuga();
    }
    public void dibujar() {
        for(int i =0; i < 20; i++) {
            for(int j =0; j < 20; j++) {
                if(piso[i][j] == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}