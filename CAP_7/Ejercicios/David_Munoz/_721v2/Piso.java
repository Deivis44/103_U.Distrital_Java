package CAP_7.Ejercicios.David_Munoz._721v2;

import java.io.FileWriter;
import java.io.IOException;

class Piso {
    int[][] piso;
    Tortuga tortuga;
    public Piso() {
        piso = new int[20][20];
        tortuga = new Tortuga();
    }
    public void dibujar() {
        try {
            FileWriter writer = new FileWriter("Resultados.txt");
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if (piso[i][j] == 1) {
                        writer.write("*");
                    } else {
                        writer.write(" ");
                    }
                }
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}