package bbdd;

import modelos.Producto;
import modelos.TipoEmpleado;
import modelos.TipoProducto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductosBBDD extends ConexionCerrar{


    public static void crearProducto(Producto producto){
        Connection con = conectarConBD();

        try {
            PreparedStatement insert = con.prepareStatement("insert into producto (id, descripcion,precio,tipo_producto)" +
                    "values(?,?,?,?)");

            insert.setInt(1, producto.getId());
            insert.setString(2,producto.getDescripcion());
            insert.setDouble(3,producto.getPrecio());
            insert.setInt(4, producto.getTipoProducto().ordinal());

            //Ejecución del insert
            insert.executeUpdate();


        } catch (SQLException sqle) {
            System.out.println("Error en la ejecución:"
                    + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {
            cerrarConexion(con);
        }
    }




    public static Producto obtenerPorId(Integer id) {

        Connection con = conectarConBD();
        Producto producto = null;

        try {
            PreparedStatement query = con.prepareStatement("SELECT * FROM producto where id = ?  ");
            query.setInt(1, id);
            ResultSet rs = query.executeQuery();

            //Recorremos los datos
            while (rs.next()) {
                producto = new Producto(rs.getInt("id"), rs.getString("descripcion"), rs.getDouble("precio"), TipoProducto.values()[rs.getInt("tipo_producto")]);
            }

        } catch (SQLException sqle) {
            System.out.println("Error en la ejecución:"
                    + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {
            cerrarConexion(con);
        }

        return producto;
    }


}
