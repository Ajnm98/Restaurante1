import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cliente extends JFrame {

    private JButton verCarta;

    public cliente() {


        setTitle("Pantalla Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 3));


        verCarta = new JButton(new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\carta.png"));
        verCarta.addActionListener(new cliente.abrirVentanaCarta());
        jPanel.add(verCarta);

        setContentPane(jPanel);
        setResizable(false);
        jPanel.setBackground(Color.green);
        setSize(200, 200);
        setVisible(true);
    }

    class abrirVentanaCarta implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           // new carta();

        }
    }



}
