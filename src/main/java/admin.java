import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame {

    private JButton botonemple;
    private JButton botonprodu;
    private JButton botonmesas;


    public admin() {
        setTitle("Pantalla administrador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 3));


        botonemple = new JButton(new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\employee.png"));
        botonemple.addActionListener(new abrirVentanaempleados());
        jPanel.add(botonemple);


        botonprodu = new JButton(new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\product.png"));
        jPanel.add(botonprodu);


        botonmesas = new JButton(new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\table.png"));
        jPanel.add(botonmesas);


        setContentPane(jPanel);
        setResizable(false);
        jPanel.setBackground(Color.green);
        setSize(400, 200);
        setVisible(true);
    }


    class abrirVentanaempleados implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            new empleados();

        }
    }
}
