package CAP_6.Ejercicios.Santiago_Pineda._615;

public class procesos {
    
    private double cateto;
    private int key;

    public void proceso(double cateto,int key) {
    this.cateto = cateto;
    this.key=key;
    }
    
    public double getcateto() {
        return cateto;
    }
        
    public void setcateto(double cateto) {
    this.cateto = cateto; 
    }

    public int getkey() {
    return key;
    }

    public void setkey(int key) {
    this.key = key;
    }
    
}