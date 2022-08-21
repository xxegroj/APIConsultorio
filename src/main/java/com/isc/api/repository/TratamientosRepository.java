package com.isc.api.repository;

import com.isc.api.model.Tratamientos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TratamientosRepository extends JpaRepository<Tratamientos,Integer> {
    @Query(value = "select t from Tratamientos t where t.estado= ?1")
    List<Tratamientos> listTratamientosEstado(String estado);
}
