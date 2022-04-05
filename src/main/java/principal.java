import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class principal extends JFrame {
    private JButton botonadmin;
    private JButton botoncliente;
    private JButton botoncamarero;
    private JButton botoncocinero;

    public principal() {


        //super("Restaurante");
        setTitle("Restaurante");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 2));

        botonadmin = new JButton(new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\admin.png"));
        botonadmin.addActionListener(new abrirVentanaAdministrador());
        jPanel.add(botonadmin);


        botoncliente = new JButton((new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\client.png")));
        botoncliente.addActionListener(new abrirVentanaCliente());
        jPanel.add(botoncliente);

        botoncamarero = new JButton((new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\waiter.png")));
        botoncamarero.addActionListener(new abrirVentanaCamarero());
        jPanel.add(botoncamarero);

        botoncocinero = new JButton((new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\chef.png")));
        botoncocinero.addActionListener(new abrirVentanaCocinero());
        jPanel.add(botoncocinero);


        setContentPane(jPanel);
        setResizable(false);
        //jPanel.setBackground(Color.green);
        setSize(400, 250);
        setVisible(true);

    }

    class abrirVentanaAdministrador implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            new admin();;
        }


    }

    class abrirVentanaCliente implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            new cliente();;
        }


    }

    class abrirVentanaCamarero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            new camarero();;
        }


    }

    class abrirVentanaCocinero implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            new cocinero();;
        }


    }
}



