package modelos;

import java.util.Objects;

public class Linea_comanda {

    private int id_comanda;
    private int id_producto;
    private Double cantidad_pedida;
    private Double cantidad_servida;

    public Linea_comanda() {
    }

    public int getId_comanda() {
        return id_comanda;
    }

    public void setId_comanda(int id_comanda) {
        this.id_comanda = id_comanda;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public Double getCantidad_pedida() {
        return cantidad_pedida;
    }

    public void setCantidad_pedida(Double cantidad_pedida) {
        this.cantidad_pedida = cantidad_pedida;
    }

    public Double getCantidad_servida() {
        return cantidad_servida;
    }

    public void setCantidad_servida(Double cantidad_servida) {
        this.cantidad_servida = cantidad_servida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linea_comanda that = (Linea_comanda) o;
        return id_comanda == that.id_comanda && id_producto == that.id_producto && Objects.equals(cantidad_pedida, that.cantidad_pedida) && Objects.equals(cantidad_servida, that.cantidad_servida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_comanda, id_producto, cantidad_pedida, cantidad_servida);
    }

    @Override
    public String toString() {
        return "Linea_comanda{" +
                "id_comanda=" + id_comanda +
                ", id_producto=" + id_producto +
                ", cantidad_pedida=" + cantidad_pedida +
                ", cantidad_servida=" + cantidad_servida +
                '}';
    }
}
