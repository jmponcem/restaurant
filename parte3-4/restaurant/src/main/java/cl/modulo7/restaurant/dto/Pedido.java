package cl.modulo7.restaurant.dto;

import jakarta.persistence.*;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int mesa_id;
    @ManyToOne
    @JoinColumn(name = "camarero_id")
    private Camarero camarero;

    private String fecha;

    private double total;

    public Pedido() {
    }

    public Pedido(int id, int mesa_id, Camarero camarero, String fecha, double total) {
        this.id = id;
        this.mesa_id = mesa_id;
        this.camarero = camarero;
        this.fecha = fecha;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMesa_id() {
        return mesa_id;
    }

    public void setMesa_id(int mesa_id) {
        this.mesa_id = mesa_id;
    }

    public Camarero getCamarero() {
        return camarero;
    }

    public void setCamarero(Camarero camarero) {
        this.camarero = camarero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", mesa_id=" + mesa_id +
                ", camarero=" + camarero +
                ", fecha='" + fecha + '\'' +
                ", total=" + total +
                '}';
    }
}
