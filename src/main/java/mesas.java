import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class mesas extends JFrame {

    JTextField campoId;
    JTextField campoNum_Mesa;
    JTextField campoNum_Comen;
    private JButton botoncrear;
    private JButton botonbuscar;
    private JButton botonmodificar;
    private JButton botoneliminar;

    public mesas() {

        super("Ventana Mesas");


        JPanel mesas = crearPanelImagenFondo();
        mesas.setSize(new Dimension(1000,1000));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 350);
        setVisible(true);
        setContentPane(mesas);



        JPanel panelExterior = new JPanel(new BorderLayout());
        JPanel formulario = new JPanel(new GridLayout(1,4));
        formulario.setBorder(new EmptyBorder(0, 0, 25, 0));
        formulario.setSize(new Dimension(100, 100));
        formulario.setOpaque(false);

        JLabel et1 = new JLabel("ID: ");
     // et1.setSize(1000, 1000);
        et1.setOpaque(false);
        formulario.add(et1);
        campoId = new JTextField(1);
        formulario.add(campoId);

        JLabel et2 = new JLabel("Num_Mesa: ");
        et2.setOpaque(false);
        formulario.add(et2);
        campoNum_Mesa = new JTextField(2);
        formulario.add(campoNum_Mesa);

        JLabel et3 = new JLabel("Num_Comen: ");
       et3.setOpaque(false);
        formulario.add(et3);
        campoNum_Comen = new JTextField(3);
        formulario.add(campoNum_Comen);


        //formulario.add(Box.createRigidArea(new Dimension(0,100)));

        JPanel p2 = new JPanel(new GridLayout(1,3));
        p2.setSize(new Dimension(100, 100));
        p2.setBorder(new EmptyBorder(25, 0, 0, 0));
        p2.setOpaque(false);



        botoncrear = new JButton("Crear");
        p2.add(botoncrear);

        botonbuscar = new JButton("Buscar");
        p2.add(botonbuscar);

        botonmodificar = new JButton("Modificar");
        p2.add(botonmodificar);

        botoneliminar = new JButton("Eliminar");
        p2.add(botoneliminar);


        JPanel estructura = new JPanel(new GridLayout(2,1));
        estructura.setSize(new Dimension(200, 200));
        estructura.setOpaque(false);

        estructura.add(formulario);
        estructura.add(p2);


       // JSplitPane sl = new JSplitPane(SwingConstants.HORIZONTAL, formulario, p2);

        //sl.setSize(1000, 1000);
       // sl.setOpaque(false);


        panelExterior.setBorder(new EmptyBorder(100,100,100,100));
        panelExterior.setOpaque(false);
        panelExterior.setSize(1000, 1000);
        panelExterior.add(estructura,BorderLayout.CENTER);

        mesas.add(panelExterior);
        setResizable(false);









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