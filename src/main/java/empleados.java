import bbdd.EmpleadosBBDD;
import modelos.Empleados;
import modelos.TipoEmpleado;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

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

        super("Administración empleados");

        JPanel principal = crearPanelImagenFondo();
        principal.setSize(new Dimension(800,800));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500, 300);
        //setLayout(new BorderLayout());


        JPanel p1 = new JPanel();
        p1.setOpaque(false);
        p1.setLayout(new GridLayout(2, 2));

        JLabel et1 = new JLabel("ID: ");
        et1.setOpaque(false);
        p1.add(et1);
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
        botoncrear.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                Empleados empleado = new Empleados();

                    empleado.setId(Integer.parseInt(campoId.getText()));
                    empleado.setCodigoEmpleado(campoCodigo.getText());
                    empleado.setNombre(String.valueOf(campoNombre.getText()));
                    empleado.setApellidos(String.valueOf(campoApellidos.getText()));

                    EmpleadosBBDD.crearEmpleado(empleado);
            }
        });





        botonbuscar = new JButton("Buscar");
        p2.add(botonbuscar);
        botonbuscar.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                int idEmpleado = Integer.parseInt(campoId.getText());
                Empleados empleado = EmpleadosBBDD.obtenerPorId(idEmpleado);
                if(empleado != null){
                    campoId.setText(String.valueOf(empleado.getId()));
                    campoCodigo.setText(String.valueOf(empleado.getCodigoEmpleado()));
                    campoNombre.setText(String.valueOf(empleado.getNombre()));
                    campoApellidos.setText(String.valueOf(empleado.getApellidos()));

                }
            }
        });

        botonmodificar = new JButton("Modificar");
        p2.add(botonmodificar);
        botonmodificar.addActionListener(new ActionListener( ) {
                                             public void actionPerformed(ActionEvent e) {
                                                 Empleados empleado = new Empleados();

                                                 empleado.setId(Integer.parseInt(campoId.getText()));
                                                 empleado.setCodigoEmpleado(campoCodigo.getText());
                                                 empleado.setNombre(String.valueOf(campoNombre));
                                                 empleado.setApellidos(String.valueOf(campoApellidos));

                                                 EmpleadosBBDD.actualizarEmpleado(empleado);
                                             }
                                         });





        botoneliminar = new JButton("Eliminar");
        p2.add(botoneliminar);
        botoneliminar.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent e) {
                Empleados empleado = new Empleados();
                    empleado.setId(Integer.parseInt(campoId.getText()));
                    EmpleadosBBDD.eliminarEmpleado(empleado);

                                       }
                                   });



        JSplitPane sl = new JSplitPane(SwingConstants.HORIZONTAL, p1, p2);
        sl.setOpaque(false);


        principal.add(sl, BorderLayout.CENTER);


       setVisible(true);
       setContentPane(principal);
        setResizable(false);

    }


    private JPanel crearPanelImagenFondo(){
        ImageIcon imagen = new ImageIcon("C:\\Users\\daw20\\IdeaProjects\\Restaurante1\\imagenes\\wood.jpg");
        Image imagenLimitadaTamanyo = imagen.getImage().getScaledInstance(500, 300,  java.awt.Image.SCALE_SMOOTH);
        imagen.setImage(imagenLimitadaTamanyo);
        JPanel panel = new JPanel(){
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagen.getImage(), 0, 0, null);
            }
        };

        return panel;


    }



    //public static String obtenerTextoComponente(JTextField campoId){
        //String CI = ;
        //String CC = campoCodigo.getText();
        //return CC;
    //}

    public static void ponerValorComponente(JTextField campoId,JTextField campoCodigo, JTextField campoNombre,JTextField campoApellidos, String valor) {


        if (valor != null) {
            campoId.setText(valor);
            campoCodigo.setText(bbdd.EmpleadosBBDD.obtenerPorId(Integer.parseInt(valor)).getCodigoEmpleado());
            campoNombre.setText(bbdd.EmpleadosBBDD.obtenerPorId(Integer.parseInt(valor)).getNombre());
            campoApellidos.setText(bbdd.EmpleadosBBDD.obtenerPorId(Integer.parseInt(valor)).getApellidos());
        }

    }



}
