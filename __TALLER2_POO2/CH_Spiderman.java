package __TALLER2_POO2;

class CH_Spiderman extends IsHero implements Poder {
    public CH_Spiderman() {
        super("Spiderman");
        addPoder(new P_Fuerza());
    }

    public void usar() {
        System.out.println("Usando mi sentido arácnido!");
    }
}