package modelos;

import java.util.Objects;

public class Mesas {
    private int id;
    private Double num_mesa;

    public Mesas() {
    }

    public Mesas(int id, Double num_mesa) {
        this.id = id;
        this.num_mesa = num_mesa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getNum_mesa() {
        return num_mesa;
    }

    public void setNum_mesa(Double num_mesa) {
        this.num_mesa = num_mesa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mesas mesas = (Mesas) o;
        return id == mesas.id && Objects.equals(num_mesa, mesas.num_mesa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, num_mesa);
    }

    @Override
    public String toString() {
        return "Mesas{" +
                "id=" + id +
                ", num_mesa=" + num_mesa +
                '}';
    }
}
