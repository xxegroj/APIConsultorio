package com.isc.api.repository;

import com.isc.api.model.Doctores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctoresRepository extends JpaRepository<Doctores,Integer> {
    @Query(value = "select d from Doctores d where d.estado= ?1")
    List<Doctores> listDoctoresEstado(String estado);
}
