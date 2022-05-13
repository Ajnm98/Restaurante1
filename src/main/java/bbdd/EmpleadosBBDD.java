package bbdd;

import modelos.Empleados;
import modelos.TipoEmpleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpleadosBBDD extends ConexionCerrar{

    public static Empleados obtenerPorId(Integer id) {

        Connection con = conectarConBD();
        Empleados empleado = null;

        try {
            PreparedStatement query = con.prepareStatement("SELECT * FROM empleado where id = ?");
            query.setInt(1, id);
            ResultSet rs = query.executeQuery();

            //Recorremos los datos
            while (rs.next()) {
                empleado = new Empleados(rs.getInt("id"), rs.getString("codigo_empleado"),
                        rs.getString("nombre"), rs.getString("apellidos"), TipoEmpleado.values()[rs.getInt("tipo_empleado")]);
            }

        } catch (SQLException sqle) {
            System.out.println("Error en la ejecución:"
                    + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {
            cerrarConexion(con);
        }

        return empleado;
    }

    public static void crearActualizarEmpleado(Empleados empleado){

        Empleados empBaseDatos = obtenerPorId(empleado.getId());

        if(empBaseDatos != null){
            actualizarEmpleado(empleado);
        }else{
            crearEmpleado(empleado);
        }
    }

    public static void crearEmpleado(Empleados empleado){
        Connection con = conectarConBD();

        try {
            PreparedStatement insert = con.prepareStatement("insert into empleado (id, codigo_empleado, nombre, apellidos)" +
                    "values(?,?,?,?)");

            insert.setInt(1, empleado.getId());
            insert.setString(2,empleado.getCodigoEmpleado());
            insert.setString(3,empleado.getNombre());
            insert.setString(4, empleado.getApellidos());


            //Ejecución del insert
            insert.executeUpdate();


        } catch (SQLException sqle) {
            System.out.println("Error en la ejecución:"
                    + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {
            cerrarConexion(con);
        }
    }

    public static void actualizarEmpleado(Empleados empleado){
        Connection con = conectarConBD();

        try {
            PreparedStatement update = con.prepareStatement("update empleado " +
                    "set codigo_empleado = ? , nombre = ? , apellidos = ?" +
                    "where id = ? ");

            update.setString(1,empleado.getCodigoEmpleado());
            update.setString(2,empleado.getNombre());
            update.setString(3, empleado.getApellidos());
            update.setInt(4, empleado.getId());


            //Ejecución del update
            update.executeUpdate();


        } catch (SQLException sqle) {
            System.out.println("Error en la ejecución:"
                    + sqle.getErrorCode() + " " + sqle.getMessage());

        } finally {
            cerrarConexion(con);
        }
    }

    public static void eliminarEmpleado(Empleados empleado){
        Connection con = conectarConBD();

        try {
            PreparedStatement delete = con.prepareStatement("delete from empleado where id = ? ");

            delete.setInt(1, empleado.getId());

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
