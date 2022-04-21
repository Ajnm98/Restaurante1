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


}
