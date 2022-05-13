package bbdd;

import modelos.Empleados;
import modelos.Mesas;
import modelos.Producto;
import modelos.TipoProducto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MesasBBDD extends ConexionCerrar{

    public static void crearMesa(Mesas mesa){
        Connection con = conectarConBD();

        try {
            PreparedStatement insert = con.prepareStatement("insert into mesa (id, num_mesa, num_comen)" +
                    "values(?,?,?)");

            insert.setInt(1, mesa.getId());
            insert.setInt(2, mesa.getNum_mesa());
            insert.setInt(3, mesa.getNum_comen());


            //Ejecución del insert
            insert.executeUpdate();


        } catch (SQLException sqle) {
            System.out.println("Error en la ejecución:"
                    + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {
            cerrarConexion(con);
        }
    }

    public static Mesas obtenerPorId(Integer id) {

        Connection con = conectarConBD();
        Mesas mesa = null;

        try {
            PreparedStatement query = con.prepareStatement("SELECT * FROM mesa where id = ?  ");
            query.setInt(1, id);
            ResultSet rs = query.executeQuery();

            //Recorremos los datos
            while (rs.next()) {
                mesa = new Mesas(rs.getInt("id"), rs.getInt("num_mesa"),rs.getInt("num_comen"));
            }

        } catch (SQLException sqle) {
            System.out.println("Error en la ejecución:"
                    + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {
            cerrarConexion(con);
        }

        return mesa;
    }


    public static void actualizarMesa(Mesas mesa){
        Connection con = conectarConBD();

        try {
            PreparedStatement update = con.prepareStatement("update mesa " +
                    "set num_mesa = ? , num_comen = ?" +
                    "where id = ? ");

            update.setInt(1, mesa.getNum_mesa());
            update.setInt(2, mesa.getNum_comen());
            update.setInt(3, mesa.getId());



            //Ejecución del update
            update.executeUpdate();


        } catch (SQLException sqle) {
            System.out.println("Error en la ejecución:"
                    + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {
            cerrarConexion(con);
        }
    }

    public static void eliminarMesa(Mesas mesa){

        Connection con = conectarConBD();


        try {
            PreparedStatement delete = con.prepareStatement("delete from mesa where id = ? ");

            delete.setInt(1, mesa.getId());

            //Ejecución del delete
            delete.executeUpdate();


        } catch (SQLException sqle) {
            System.out.println("Error en la ejecución:"
                    + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {
            cerrarConexion(con);
        }
    }




}
