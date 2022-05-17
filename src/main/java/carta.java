import bbdd.ProductosBBDD;
import modelos.Producto;
import modelos.TipoProducto;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class carta extends JFrame {


    public carta(){

        super("Carta");

        JPanel panelPrincipal = crearPanelImagenFondo();
        JTabbedPane principal = new JTabbedPane();
        principal.setOpaque(false);

        List<Producto> listaProductos = ProductosBBDD.obtenerProductos();
        Map<TipoProducto, List<Producto>> productosPorTipo = listaProductos.stream().collect(Collectors.groupingBy(Producto::getTipoProducto));

        //Creamos las pestanyas por tipoProducto
        for(TipoProducto tipoProducto : productosPorTipo.keySet()){
            JPanel carta = crearPanelImagenCarta();
            carta.setLayout(new BorderLayout());
            JPanel panelpro = new JPanel(new GridLayout(0,2));
            panelpro.setBorder(BorderFactory.createEmptyBorder(200,100,200,300));
            panelpro.setOpaque(false);

            for(Producto p : productosPorTipo.get(tipoProducto)){
                JLabel nombreProducto = new JLabel(p.getDescripcion());
                nombreProducto.setForeground(Color.WHITE);
                JLabel precio = new JLabel(p.getPrecio().toString() + "€");
                precio.setForeground(Color.WHITE);
                panelpro.add(nombreProducto);
                panelpro.add(precio);
            }
            carta.add(panelpro,BorderLayout.CENTER);
            principal.add(tipoProducto.toString(),carta);

        }


        panelPrincipal.add(principal);



        //ASPECTO
        setContentPane(panelPrincipal);//Panel de Fondo
        setBackground(Color.WHITE); //COLOR
        setLocationRelativeTo(null); //POSICION CENTRADA
        pack();
        setSize(1200,800); //TAMAÑO DE VENTANA
        setResizable(false);
        setLocationRelativeTo(null); //POSICION CENTRADA
        setVisible(true); //VISIBILIDAD

    }







    private JPanel crearPanelImagenFondo(){
        ImageIcon imagen = new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\wood.jpg");
        Image imagenLimitadaTamanyo = imagen.getImage().getScaledInstance(1200, 800,  java.awt.Image.SCALE_SMOOTH);
        imagen.setImage(imagenLimitadaTamanyo);
        JPanel panel = new JPanel(){
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagen.getImage(), 0, 0, null);
            }
        };

        return panel;


    }



    private JPanel crearPanelImagenCarta(){
        ImageIcon imagen = new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\pizarra.jpg");
        Image imagenLimitadaTamanyo = imagen.getImage().getScaledInstance(1200, 800,  java.awt.Image.SCALE_SMOOTH);
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
