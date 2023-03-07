package CAP_4.Ejercicios.David_Munoz._430;

public class Palindromo {
    private int num;

    public Palindromo(int num) {
        this.num = num;
    }

    public boolean esPalindromo() {
        String numStr = Integer.toString(num);
        String numStr_reves = new StringBuilder(numStr).reverse().toString();
        return numStr .equals(numStr_reves);
    }
    
}