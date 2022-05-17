import bbdd.MesasBBDD;
import modelos.Mesas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class aforo extends JFrame {
    private JButton boton;

    public aforo() {

        super("Ventana aforo");

        JPanel principal = crearPanelImagenFondo();


        List<Mesas> mesas = MesasBBDD.obtenerMesas();

        //Creaciónd de formulario
        JPanel panelExterior = new JPanel(new BorderLayout());
        JPanel panelMesas = new JPanel(new GridLayout(mesas.size() / 2, 3));
        panelMesas.setOpaque(false);
        panelMesas.setSize(new Dimension(1000, 1000));


        for (Mesas m : mesas) {
            JButton botonMesa = crearBotonMesa(m);
            panelMesas.add(botonMesa);
        }

        //Estilos y Posicionamiento de paneles de formulario
        panelExterior.setBorder(new EmptyBorder(100, 100, 100, 100));
        panelExterior.setOpaque(false);
        panelExterior.add(panelMesas, BorderLayout.CENTER);
        principal.add(panelExterior, BorderLayout.CENTER);


        //ASPECTO
        setContentPane(principal);//Panel de Fondo
        setBackground(Color.DARK_GRAY); //COLOR
        setLocationRelativeTo(null); //POSICION CENTRADA
        pack();
        setSize(1000, 600); //TAMAÑO DE VENTANA
        setResizable(false);
        setLocationRelativeTo(null); //POSICION CENTRADA
        setVisible(true);

    }

    private JPanel crearPanelImagenFondo() {
        ImageIcon imagen = new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\wood.jpg");
        Image imagenLimitadaTamanyo = imagen.getImage().getScaledInstance(1000, 500, java.awt.Image.SCALE_SMOOTH);
        imagen.setImage(imagenLimitadaTamanyo);
        JPanel panel = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagen.getImage(), 0, 0, null);
            }
        };

        return panel;

    }

    public static  JButton crearBotonMesa(Mesas mesa){
        JButton boton = new JButton(mesa.toString());
        boton.setName(String.valueOf(mesa.getId()));
        String ruta = new File("").getAbsolutePath() + "\\imagenes\\mesa_incono.png" ;
        ImageIcon icono = new ImageIcon(ruta);
        Image imagenLimitadaTamanyo = icono.getImage().getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH);
        icono.setImage(imagenLimitadaTamanyo);
        boton.setIcon(icono);
        boton.setFocusPainted(false);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MesasBBDD.ocuparDesocuparMesa(mesa);
                mesa.setEsta_ocupada(!mesa.isEsta_ocupada());
                boton.setBackground(mesa.isEsta_ocupada()? Color.RED : Color.GREEN);
                boton.repaint();
            }
        });
        return boton;

    }
}
