import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.security.PublicKey;

public class productos extends JFrame {

    JTextField campoId;
    JTextField campoCodigo;
    JTextField campoDescripcion;
    JTextField precio;

    public productos(){

        super("Ventana Productos");


        JPanel productos = crearPanelImagenFondo();
        productos.setSize(new Dimension(1000,1000));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 350);
        setVisible(true);
        setContentPane(productos);

        JPanel panelExterior = new JPanel(new BorderLayout());
        panelExterior.setBorder(new EmptyBorder(100,100,100,100));
        panelExterior.setOpaque(false);
        panelExterior.setSize(1000, 1000);


        JPanel labels1 = new JPanel(new GridLayout(1,2));
        labels1.setSize(new Dimension(300, 300));
        labels1.setOpaque(false);

        JLabel et1 = new JLabel("ID: ");
        et1.setOpaque(false);
        labels1.add(et1);

        JLabel et2 = new JLabel("Codigo: ");
        et2.setOpaque(false);
        labels1.add(et2);

        JPanel form1 = new JPanel(new GridLayout(1,2));
        form1.setSize(new Dimension(300, 300));
        form1.setOpaque(false);

        campoId = new JTextField(1);
        form1.add(campoId);

        campoCodigo = new JTextField(2);
        form1.add(campoCodigo);



        JPanel estructura = new JPanel(new GridLayout(2,1));
        estructura.setSize(new Dimension(500, 500));
        estructura.setOpaque(false);

        estructura.add(labels1);
        estructura.add(form1);
        panelExterior.add(estructura);
        productos.add(panelExterior);





    }


    private JPanel crearPanelImagenFondo(){
        ImageIcon imagen = new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\wood.jpg");
        Image imagenLimitadaTamanyo = imagen.getImage().getScaledInstance(1000, 1000,  java.awt.Image.SCALE_SMOOTH);
        imagen.setImage(imagenLimitadaTamanyo);
        JPanel panel = new JPanel(){
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagen.getImage(), 0, 0, null);
            }
        };

        return panel;


    }

}
