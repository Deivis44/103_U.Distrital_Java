package __TALLER2_POO2;

class CH_Wolverine extends IsHero implements Poder {
    public CH_Wolverine() {
        super("Wolverine");
        addPoder(new P_Fuerza());
    }

    public void usar() {
        System.out.println("Usando mis garras!");
    }
}