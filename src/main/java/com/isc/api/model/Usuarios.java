package com.isc.api.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tusuarios", schema = "mydb", catalog = "")
public class Usuarios {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idUsuarios")
    private int idUsuarios;
    @Basic
    @Column(name = "dni")
    private String dni;
    @Basic
    @Column(name = "nombre")
    private String nombres;
    @Basic
    @Column(name = "apellidos")
    private String apellidos;
    @Basic
    @Column(name = "clave")
    private String clave;
    @Basic
    @Column(name = "estado")
    private String estado;

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuarios usuarios = (Usuarios) o;
        return idUsuarios == usuarios.idUsuarios && Objects.equals(dni, usuarios.dni) && Objects.equals(nombres, usuarios.nombres) && Objects.equals(apellidos, usuarios.apellidos) && Objects.equals(clave, usuarios.clave) && Objects.equals(estado, usuarios.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuarios, dni, nombres, apellidos, clave, estado);
    }
}
