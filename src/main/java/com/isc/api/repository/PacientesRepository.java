package com.isc.api.repository;

import com.isc.api.model.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PacientesRepository extends JpaRepository<Pacientes,Integer> {
    @Query(value = "select p from Pacientes p where p.estado=?1")
    List<Pacientes> listPacientesEstado(String estado);
}
