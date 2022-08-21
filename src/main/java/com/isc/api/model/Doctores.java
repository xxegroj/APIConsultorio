package com.isc.api.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tdoctores", schema = "mydb", catalog = "")
public class Doctores {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idDoctores")
    private int idDoctores;
    @Basic
    @Column(name = "nombres")
    private String nombres;
    @Basic
    @Column(name = "apellidos")
    private String apellidos;
    @Basic
    @Column(name = "dni")
    private String dni;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "celular")
    private String celular;
    @Basic
    @Column(name = "especialidad")
    private String especialidad;
    @Basic
    @Column(name = "estado")
    private String estado;
    @Basic
    @Column(name = "tUsuarios_idUsuarios")
    private int tUsuariosIdUsuarios;

    public int getIdDoctores() {
        return idDoctores;
    }

    public void setIdDoctores(int idDoctores) {
        this.idDoctores = idDoctores;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int gettUsuariosIdUsuarios() {
        return tUsuariosIdUsuarios;
    }

    public void settUsuariosIdUsuarios(int tUsuariosIdUsuarios) {
        this.tUsuariosIdUsuarios = tUsuariosIdUsuarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctores doctores = (Doctores) o;
        return idDoctores == doctores.idDoctores && tUsuariosIdUsuarios == doctores.tUsuariosIdUsuarios && Objects.equals(nombres, doctores.nombres) && Objects.equals(apellidos, doctores.apellidos) && Objects.equals(dni, doctores.dni) && Objects.equals(email, doctores.email) && Objects.equals(celular, doctores.celular) && Objects.equals(especialidad, doctores.especialidad) && Objects.equals(estado, doctores.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDoctores, nombres, apellidos, dni, email, celular, especialidad, estado, tUsuariosIdUsuarios);
    }
}
