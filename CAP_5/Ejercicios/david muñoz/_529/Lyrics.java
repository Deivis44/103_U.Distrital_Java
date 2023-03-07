package CAP_5.Ejercicios._529;

public class Lyrics {
    private String dia;
    private String[] regalos;

    public Lyrics(int numDia) {
        String[] dias = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
        dia = dias[numDia-1];
        regalos = new String[numDia];
        switch (numDia) {
            case 12:
                regalos[11] = "twelve drummers drumming,";
            case 11:
                regalos[10] = "eleven pipers piping,";
            case 10:
                regalos[9] = "ten lords a-leaping,";
            case 9:
                regalos[8] = "nine ladies dancing,";
            case 8:
                regalos[7] = "eight maids a-milking,";
            case 7:
                regalos[6] = "seven swans a-swimming,";
            case 6:
                regalos[5] = "six geese a-laying,";
            case 5:
                regalos[4] = "five golden rings,";
            case 4:
                regalos[3] = "four calling birds,";
            case 3:
                regalos[2] = "three French hens,";
            case 2:
                regalos[1] = "two turtle doves,";
            case 1:
                regalos[0] = "a partridge in a pear tree.";
        }
    }

    public String toString() {
        StringBuilder cancion = new StringBuilder();
        cancion.append("On the ").append(dia).append(" day of Christmas,\n");
        cancion.append("My true love gave to me:\n");
        for (int i = regalos.length-1; i >= 0; i--) {
            cancion.append(regalos[i]).append("\n");
        }
        return cancion.toString();
    }
}
