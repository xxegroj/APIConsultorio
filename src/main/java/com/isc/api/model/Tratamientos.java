package com.isc.api.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "ttratamientos", schema = "mydb", catalog = "")
public class Tratamientos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idTratamientos")
    private int idtTratamientos;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "descripcion")
    private String descripcion;
    @Basic
    @Column(name = "fecha")
    private Date fecha;
    @Basic
    @Column(name = "doctor")
    private String doctor;
    @Basic
    @Column(name = "Precio")
    private double precio;
    @Basic
    @Column(name = "estado")
    private String estado;
    @Basic
    @Column(name = "tPacientes_idtPacientes1")
    private int tPacientesIdtPacientes1;

    public int getIdtTratamientos() {
        return idtTratamientos;
    }

    public void setIdtTratamientos(int idtTratamientos) {
        this.idtTratamientos = idtTratamientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int gettPacientesIdtPacientes1() {
        return tPacientesIdtPacientes1;
    }

    public void settPacientesIdtPacientes1(int tPacientesIdtPacientes1) {
        this.tPacientesIdtPacientes1 = tPacientesIdtPacientes1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tratamientos that = (Tratamientos) o;
        return idtTratamientos == that.idtTratamientos && Double.compare(that.precio, precio) == 0 && tPacientesIdtPacientes1 == that.tPacientesIdtPacientes1 && Objects.equals(nombre, that.nombre) && Objects.equals(descripcion, that.descripcion) && Objects.equals(fecha, that.fecha) && Objects.equals(doctor, that.doctor) && Objects.equals(estado, that.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtTratamientos, nombre, descripcion, fecha, doctor, precio, estado, tPacientesIdtPacientes1);
    }
}
