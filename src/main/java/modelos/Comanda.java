package modelos;

import java.util.Objects;

public class Comanda {

    private int id;
    private Double codigocomanda;
    private int idempleado;
    private Double idmesa;

    public Comanda() {
    }

    public Comanda(int id, Double codigocomanda, int idempleado, Double idmesa) {
        this.id = id;
        this.codigocomanda = codigocomanda;
        this.idempleado = idempleado;
        this.idmesa = idmesa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getCodigocomanda() {
        return codigocomanda;
    }

    public void setCodigocomanda(Double codigocomanda) {
        this.codigocomanda = codigocomanda;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public Double getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(Double idmesa) {
        this.idmesa = idmesa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comanda comanda = (Comanda) o;
        return id == comanda.id && idempleado == comanda.idempleado && Objects.equals(codigocomanda, comanda.codigocomanda) && Objects.equals(idmesa, comanda.idmesa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigocomanda, idempleado, idmesa);
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "id=" + id +
                ", codigocomanda=" + codigocomanda +
                ", idempleado=" + idempleado +
                ", idmesa=" + idmesa +
                '}';
    }
}
