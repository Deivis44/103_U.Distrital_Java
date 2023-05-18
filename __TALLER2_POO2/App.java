package __TALLER2_POO2;

import java.util.ArrayList;
import javax.swing.*;

public class App extends JFrame {

    public void iniciar() {

        IsHero spiderman = new CH_Spiderman();
        IsHero wolverine = new CH_Wolverine();
        isVillain thanos = new CV_Thanos();
        isVillain venom = new CV_Venom();

        ArrayList<Personaje> personajes = new ArrayList<Personaje>();
        personajes.add(spiderman);
        personajes.add(wolverine);
        personajes.add(thanos);
        personajes.add(venom);

        for (Personaje personaje : personajes) {
            
            if (personaje.esHeroe) {
                if (personaje == spiderman) {
                    personaje.Vista_Personaje("hero", "Superheroe", "Spiderman", 150, 50, "\nSentido aracnido");
                    personaje.setVisible(true);
                } else if (personaje == wolverine) {
                    personaje.Vista_Personaje("hero", "Superheroe", "Wolverine", 950, 50, "\nGarras de adamantium");
                    personaje.setVisible(true);

                }
            }
            
            if (!personaje.esHeroe) {
                if (personaje == thanos) {
                    personaje.Vista_Personaje("villain", "Villano", "Thanos", 150, 520, "\nGuante del infinito");
                    personaje.setVisible(true);
                } else if (personaje == venom) {
                    personaje.Vista_Personaje("villain", "Villano", "Venom", 950, 520, "\nSuperfuerza");
                    personaje.setVisible(true);
                }
            }
            
            System.out.println(personaje.nombre + " dice: ");
            personaje.usarTodosPoderes();
            System.out.println("\n");
        }
        
    }
}