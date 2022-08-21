package com.isc.api.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tpagos", schema = "mydb", catalog = "")
public class Pagos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPagos")
    private int idtPagos;
    @Basic
    @Column(name = "total")
    private double total;
    @Basic
    @Column(name = "cantidadPagada")
    private Double cantidadPagada;
    @Basic
    @Column(name = "cantidadPagando")
    private double cantidadPagando;
    @Basic
    @Column(name = "cantidadFaltante")
    private Double cantidadFaltante;
    @Basic
    @Column(name = "estado")
    private String estado;
    @Basic
    @Column(name = "tTratamientos_idtTratamientos")
    private int tTratamientosIdtTratamientos;

    public int getIdtPagos() {
        return idtPagos;
    }

    public void setIdtPagos(int idtPagos) {
        this.idtPagos = idtPagos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Double getCantidadPagada() {
        return cantidadPagada;
    }

    public void setCantidadPagada(Double cantidadPagada) {
        this.cantidadPagada = cantidadPagada;
    }

    public double getCantidadPagando() {
        return cantidadPagando;
    }

    public void setCantidadPagando(double cantidadPagando) {
        this.cantidadPagando = cantidadPagando;
    }

    public Double getCantidadFaltante() {
        return cantidadFaltante;
    }

    public void setCantidadFaltante(Double cantidadFaltante) {
        this.cantidadFaltante = cantidadFaltante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int gettTratamientosIdtTratamientos() {
        return tTratamientosIdtTratamientos;
    }

    public void settTratamientosIdtTratamientos(int tTratamientosIdtTratamientos) {
        this.tTratamientosIdtTratamientos = tTratamientosIdtTratamientos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagos pagos = (Pagos) o;
        return idtPagos == pagos.idtPagos && Double.compare(pagos.total, total) == 0 && Double.compare(pagos.cantidadPagando, cantidadPagando) == 0 && tTratamientosIdtTratamientos == pagos.tTratamientosIdtTratamientos && Objects.equals(cantidadPagada, pagos.cantidadPagada) && Objects.equals(cantidadFaltante, pagos.cantidadFaltante) && Objects.equals(estado, pagos.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtPagos, total, cantidadPagada, cantidadPagando, cantidadFaltante, estado, tTratamientosIdtTratamientos);
    }
}
