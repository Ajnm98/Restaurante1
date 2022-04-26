package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionCerrar {

    private static final String url = "jdbc:mariadb://localhost:3306/restaurante";
    private static final String usuario = "root";
    private static final String password = "-Antonionm98";


    static Connection conectarConBD() {

        Connection conexion;
        try {
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (Exception e) {
            System.out.println("Error en la conexión:" + e.toString());
            return null;
        }
        return conexion;
    }


    static void cerrarConexion(Connection con) {
        try {
            // Cerramos conexiones
            if (con !=null) {
                con.close();
            }
        } catch (Exception e) {
            System.out.println("Error cerrando conexiones: "
                    + e.toString());
        }
    }

}


