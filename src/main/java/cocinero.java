import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cocinero extends JFrame {

    private JButton comandas;

    public cocinero() {


        setTitle("Pantalla Cocinero");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 3));


        comandas = new JButton(new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\comanda.png"));
        comandas.addActionListener(new cocinero.abrirVentanaComandas());
        jPanel.add(comandas);

        setContentPane(jPanel);
        setResizable(false);
        jPanel.setBackground(Color.green);
        setSize(200, 200);
        setVisible(true);
    }

    class abrirVentanaComandas implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // new comandas();

        }
    }


}
