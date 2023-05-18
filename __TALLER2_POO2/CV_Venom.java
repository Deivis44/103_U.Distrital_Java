package __TALLER2_POO2;

class CV_Venom extends isVillain implements Poder {
    public CV_Venom() {
        super("Venom");
        addPoder(new P_Fuerza());
    }

    public void usar() {
        System.out.println("Usando mi fuerza para devorarte");
    }
}