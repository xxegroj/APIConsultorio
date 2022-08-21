package com.isc.api.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tpacientes", schema = "mydb", catalog = "")
public class Pacientes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPacientes")
    private int idtPacientes;
    @Basic
    @Column(name = "nombres")
    private String nombres;
    @Basic
    @Column(name = "apelllidos")
    private String apelllidos;
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
    @Column(name = "edad")
    private String edad;
    @Basic
    @Column(name = "estado")
    private String estado;
    @Basic
    @Column(name = "tDoctores_idtDoctores")
    private int tDoctoresIdtDoctores;

    public int getIdtPacientes() {
        return idtPacientes;
    }

    public void setIdtPacientes(int idtPacientes) {
        this.idtPacientes = idtPacientes;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApelllidos() {
        return apelllidos;
    }

    public void setApelllidos(String apelllidos) {
        this.apelllidos = apelllidos;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int gettDoctoresIdtDoctores() {
        return tDoctoresIdtDoctores;
    }

    public void settDoctoresIdtDoctores(int tDoctoresIdtDoctores) {
        this.tDoctoresIdtDoctores = tDoctoresIdtDoctores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pacientes pacientes = (Pacientes) o;
        return idtPacientes == pacientes.idtPacientes && tDoctoresIdtDoctores == pacientes.tDoctoresIdtDoctores && Objects.equals(nombres, pacientes.nombres) && Objects.equals(apelllidos, pacientes.apelllidos) && Objects.equals(dni, pacientes.dni) && Objects.equals(email, pacientes.email) && Objects.equals(celular, pacientes.celular) && Objects.equals(edad, pacientes.edad) && Objects.equals(estado, pacientes.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idtPacientes, nombres, apelllidos, dni, email, celular, edad, estado, tDoctoresIdtDoctores);
    }
}
