package CAP_2.Ejercicios.David_Munoz._235.v3;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.*;

public class Informacion {
    
    public float total;
    
    public float calcularTotal(int kilometros, float litroGasolina, int cuotasPARQ, int peaje) {
        return total = ((kilometros*litroGasolina) + cuotasPARQ + peaje);
    }
    
    public void recomendaciones() {
        Font font = new Font("Courier New", Font.PLAIN, 16);
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("OptionPane.messageFont", font);
        
        String agradecimientos = "\n-- Gracias por usar este software, espero haya sido de ayuda --" // derechos de autor programa
            + "\n                @ 2023 - David Muñoz - UD\n";
        
        if (total > 0 && total <= 120000) { // rango dentro de los datos comunes en un día
            if (total >= 89000 && total <= 120000) { // existe el caso de que sea menor o igual al rango definido anteriormente
                String normal = "// Gastas lo que usualmente se hace en un día en la ciudad = " + total + "$";
                JOptionPane.showMessageDialog(null, normal, "Normal", JOptionPane.INFORMATION_MESSAGE);
                
                // datos relevantes consultados en la web sobre los beneficios de compartir el carro
                String normal_info = "! Podrias considerar la opción de compartir tu carro:"
                + "\n  - Disminuirías en un 75% el costo total de un trayecto normal al día"
                + "\n  - Las emisiones de carbono bajarían en un 42% aprox."
                + "\n  - La congestión del tráfico se vería enormemente reducida";
                JOptionPane.showMessageDialog(null, normal_info, "Recomendaciones", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, agradecimientos);
                
            } else {
                String sobrante = "// Gastas menos de lo que usualmente se hace en un día en la ciudad = " + total + "$";
                JOptionPane.showMessageDialog(null, sobrante, "Felicitaciones", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, agradecimientos);
            }
        } if (total > 120000) { // si excede el rango subestimado
            String exceso = "// Te recomendamos hacer uso de la estrategia 'Carpooling', ya que en el día gastas = " + total + "$ eso es más de lo estimado";
            JOptionPane.showMessageDialog(null, exceso, "Alerta", JOptionPane.INFORMATION_MESSAGE);
            
            String exceso_info = "! Considera la opción de compartir tu carro:"
            + "\n  - Disminuirías en un 75% el costo total de un trayecto normal al día"
            + "\n  - Las emisiones de carbono bajarían en un 42% aprox."
            + "\n  - La congestión del traáfico se vería enormemente reducida";
            JOptionPane.showMessageDialog(null, exceso_info, "Recomendaciones", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, agradecimientos);
            
        } else if (total < 0) { // si los valores no tienen sentido "-"
            String error = "Al parecer introdujiste valores que no concuerdan con los solicitados";
            JOptionPane.showMessageDialog(null, error, "ERROR", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, agradecimientos);
        }
    }
}