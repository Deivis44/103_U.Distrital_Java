package CAP_2.Ejercicios.Santiago_Pineda._234_con_planos;

public class PoblacionMundia1 {
    
    private double poblacionActual;
    private double tasaCrecimiento;
    private int key;

    public PoblacionMundia1(double poblacionActual, double tasaCrecmiento,int key) {
    this.poblacionActual = poblacionActual;
    this.tasaCrecimiento=tasaCrecmiento;
    this.key=key;
    }
    
    public double getpoblacionActual() {
        return poblacionActual;
    }
        
    public void setpoblacionActual(double poblacionActual) {
    this.poblacionActual = poblacionActual; 
    }

    public double gettasaCrecimiento() {
    return tasaCrecimiento;
    }

    public void settasaCrecimiento(double tasaCrecimiento) {
    this.tasaCrecimiento = tasaCrecimiento;
    }

    public int getkey() {
    return key;
    }

    public void setkey(int key) {
    this.key = key;
    }

    public double calcularPoblacion(int anios) {
    double poblacionEstimada = poblacionActual;
    for (int i = 1; i <= anios; i++) {
    poblacionEstimada *= (1 + (tasaCrecimiento/100));
    }
    return poblacionEstimada;
    }
    
}