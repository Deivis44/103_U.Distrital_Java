package CAP_6.Ejercicios.David_Munoz._623;

public class Numero {
    private double num1;
    private double num2;
    private double num3;
    
    public Numero(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    public double minimo3() {
        return Math.min(Math.min(num1, num2), num3);
    }
}