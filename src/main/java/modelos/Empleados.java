package modelos;

import java.util.Objects;

public class Empleados {

    private int id;
    private String codigoEmpleado;
    private String nombre;
    private String apellidos;
    private TipoEmpleado tipoEmpleado;


    public Empleados(int id, String codigoEmpleado, String nombre, String apellidos, TipoEmpleado tipoEmpleado) {
        this.id = id;
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoEmpleado = tipoEmpleado;
    }

    public Empleados() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleados empleados = (Empleados) o;
        return id == empleados.id && Objects.equals(codigoEmpleado, empleados.codigoEmpleado) && Objects.equals(nombre, empleados.nombre) && Objects.equals(apellidos, empleados.apellidos) && tipoEmpleado == empleados.tipoEmpleado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigoEmpleado, nombre, apellidos, tipoEmpleado);
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "id=" + id +
                ", codigoEmpleado='" + codigoEmpleado + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", tipoEmpleado=" + tipoEmpleado +
                '}';
    }
}
