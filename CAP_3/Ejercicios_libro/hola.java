package CAP_3.Ejercicios_libro;

import java.util.ArrayList;

public class hola {
    public static void main(String[] args) {
        // Creamos el ArrayList de caracteres y añadimos la frase
        ArrayList<Character> letras = new ArrayList<Character>();
        letras.add('H');
        letras.add('o');
        letras.add('l');
        letras.add('a');
        letras.add(' ');
        letras.add('m');
        letras.add('u');
        letras.add('n');
        letras.add('d');
        letras.add('o');
        letras.add('!');

        // Eliminamos las vocales utilizando removeIf()
        letras.removeIf(e -> e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u');

        // Imprimimos el resultado
        for (Character c : letras) {
            System.out.print(c);
        }
    }
}
