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
        jPanel.add(botoncliente);

        botoncamarero = new JButton((new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\waiter.png")));
        jPanel.add(botoncamarero);

        botoncocinero = new JButton((new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\chef.png")));
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
}



