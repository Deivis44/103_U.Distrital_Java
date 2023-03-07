package CAP_6.Ejercicios.Santiago_Pineda._615;


public class catetos {
    
    private double cateto1;
    private double cateto2;

    public void cateto(double cateto1,double cateto2) {
    this.cateto1 = cateto1;
    this.cateto2=cateto2;
    }
    
    public double getcateto1() {
        return cateto1;
    }
        
    public void setcateto1(double cateto1) {
    this.cateto1 = cateto1; 
    }

    public void setcateto2(double cateto2) {
        this.cateto2 = cateto2; 
        }

    public double getcateto2() {
            return cateto2;
    }

        public double hipotenusa() {
            double hipotenusa=0 ;
            
            double suma = (Math.pow(cateto1,2)) + (Math.pow(cateto2,2));

            hipotenusa= Math.sqrt(suma);

            return hipotenusa;
            }
          
}