package __TALLER2_POO2;

import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;

class Personaje extends JFrame{
    protected String nombre;
    protected boolean esHeroe;
    protected ArrayList<Poder> poderes;

    public Personaje(String nombre, boolean esHeroe) {
        this.nombre = nombre;
        this.esHeroe = esHeroe;
        this.poderes = new ArrayList<Poder>();
    }

    public void addPoder(Poder poder) {
        poderes.add(poder);
    }

    public void usarTodosPoderes() {
        for (Poder poder : poderes) {
            poder.usar();
        }
    }

    private JLabel lblFoto;
    private JLabel lblNombre;
    private JLabel lblPoder;

    public void Vista_Personaje(String tipo, String tipo2, String nombre, int X, int Y, String poder) {


        ImageIcon icon = new ImageIcon("__TALLER2_POO2/Imagenes/" + tipo + ".png");
        setIconImage(icon.getImage());

        Font font = new Font("Bahnschrift SemiLight Condensed", Font.BOLD, 16);

        // Configuración de la ventana
        setTitle("Personaje | " + tipo2);
        setSize(800, 460);
        setLocation(X,Y);
        setLayout(null);
        
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblNombre = new JLabel("Nombre: " + nombre);
        
        lblPoder = new JLabel("Especial: " + poder);
        
        ImageIcon fondo = new ImageIcon("__TALLER2_POO2/Imagenes/wallpaper.png");
        JLabel fondoFrame = new JLabel(fondo);
        fondoFrame.setBounds(0, 0, 800, 460);
        add(fondoFrame);

        ImageIcon imagen = new ImageIcon("__TALLER2_POO2/Imagenes/" + nombre + ".gif");
        lblFoto = new JLabel(imagen);

        JPanel panel1 = new JPanel();
        panel1.setBounds(10, 10, 400, 400);
        panel1.add(lblFoto);
        add(panel1);
        
        JPanel panel2_nombre = new JPanel();
        panel2_nombre.setBackground(Color.BLACK);
        panel2_nombre.setBounds(425 , 300, 350, 40);
        panel2_nombre.add(lblNombre);
        lblNombre.setFont(font);
        fondoFrame.add(panel2_nombre);
        
        JPanel panel3_poderes = new JPanel();
        panel3_poderes.setBackground(Color.BLACK);
        panel3_poderes.setBounds(425, 350, 350, 40);
        lblPoder.setFont(font);
        panel3_poderes.add(lblPoder);
        fondoFrame.add(panel3_poderes);

    }
}