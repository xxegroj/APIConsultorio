package com.isc.api.repository;

import com.isc.api.model.Pagos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PagosRepository extends JpaRepository<Pagos,Integer> {
    @Query(value = "select pa from Pagos pa where pa.estado=?1")
    List<Pagos> listPagosEstado(String estado);
}
