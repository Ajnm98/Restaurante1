import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class camarero extends JFrame {

    private JButton botonAforo;
    private JButton botonPedidos;
    private JButton botonCuenta;

    public camarero() {
        setTitle("Pantalla administrador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 3));


        botonAforo = new JButton(new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\aforo.png"));
        botonAforo.addActionListener(new camarero.abrirVentanaAforo());
        jPanel.add(botonAforo);


        botonPedidos = new JButton(new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\pedido.png"));
        botonPedidos.addActionListener(new camarero.abrirVentanaPedidos());
        jPanel.add(botonPedidos);

        botonCuenta = new JButton(new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\cuenta.png"));
        botonCuenta.addActionListener(new camarero.abrirVentanaCuentas());
        jPanel.add(botonCuenta);




        setContentPane(jPanel);
        setResizable(false);
        jPanel.setBackground(Color.green);
        setSize(400, 200);
        setVisible(true);
    }

    class abrirVentanaAforo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // new aforo();

        }
    }

    class abrirVentanaPedidos implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // new pedidos();

        }
    }

    class abrirVentanaCuentas implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // new cuenta();

        }
    }


}
