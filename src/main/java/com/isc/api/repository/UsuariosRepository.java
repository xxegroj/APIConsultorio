package com.isc.api.repository;

import com.isc.api.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuariosRepository extends JpaRepository<Usuarios,Integer> {
    @Query(value = "select u from Usuarios  u where u.estado= ?1")
    List<Usuarios> listUsuariosEstado(String estado);
    @Query(value = "select md5(sha1(?1))",nativeQuery = true)
    public String encriptarLogin(String clave);
}
