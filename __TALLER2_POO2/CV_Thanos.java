package __TALLER2_POO2;

class CV_Thanos extends isVillain implements Poder {
    public CV_Thanos() {
        super("Thanos");
        addPoder(new P_Fuerza());
        addPoder(new P_Invisibilidad());
        addPoder(new P_Volar());
    }

    public void usar() {
        System.out.println("Usando mi Guantelete del Infinito!");
    }
}