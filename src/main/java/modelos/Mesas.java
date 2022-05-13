package modelos;

import java.util.Objects;

public class Mesas {
    private int id;
    private int num_mesa;
    private int num_comen;

    public Mesas(int id, int num_mesa, int num_comen) {
        this.id = id;
        this.num_mesa = num_mesa;
        this.num_comen = num_comen;
    }

    public Mesas() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_mesa() {
        return num_mesa;
    }

    public void setNum_mesa(int num_mesa) {
        this.num_mesa = num_mesa;
    }

    public int getNum_comen() {
        return num_comen;
    }

    public void setNum_comen(int num_comen) {
        this.num_comen = num_comen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mesas mesas = (Mesas) o;
        return id == mesas.id && num_comen == mesas.num_comen && Objects.equals(num_mesa, mesas.num_mesa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, num_mesa, num_comen);
    }

    @Override
    public String toString() {
        return "Mesas{" +
                "id=" + id +
                ", num_mesa=" + num_mesa +
                ", num_comen=" + num_comen +
                '}';
    }
}
