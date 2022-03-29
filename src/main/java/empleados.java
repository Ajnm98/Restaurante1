import javax.swing.*;
import java.awt.*;

public class empleados extends JFrame {
    JTextField campoId;
    JTextField campoCodigo;
    JTextField campoNombre;
    JTextField campoApellidos;
    private JButton botoncrear;
    private JButton botonbuscar;
    private JButton botonmodificar;
    private JButton botoneliminar;


    public empleados(){



        setTitle("Administración empleados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 2));

        p1.add(new JLabel("ID: "));
        campoId = new JTextField(1);
        p1.add(campoId);

        p1.add(new JLabel("Código: "));
        campoCodigo = new JTextField(1);
        p1.add(campoCodigo);

        p1.add(new JLabel("Nombre: "));
        campoNombre = new JTextField(1);
        p1.add(campoNombre);

        p1.add(new JLabel("Apellidos: "));
        campoApellidos = new JTextField(1);
        p1.add(campoApellidos);



        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 4));


        botoncrear = new JButton("Crear");
        p2.add(botoncrear);

        botonbuscar = new JButton("Buscar");
        p2.add(botonbuscar);

        botonmodificar = new JButton("Modificar");
        p2.add(botonmodificar);

        botoneliminar = new JButton("Eliminar");
        p2.add(botoneliminar);


        setContentPane(p1, p2);
        setResizable(false);
        //p1.setBackground(Color.green);
        setSize(600, 100);
        setVisible(true);
    }



}
