package com.isc.api.service;

import com.isc.api.model.Usuarios;
import com.isc.api.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {
    @Autowired
    private UsuariosRepository usuariosRepository;
    public Usuarios crearUsuarios(Usuarios usuarios){
        return usuariosRepository.save(usuarios);
    }
    public List<Usuarios> listUsuarios(){
        return usuariosRepository.findAll();
    }
    public List<Usuarios> listUsuariosEtado(String estado){
        return usuariosRepository.listUsuariosEstado(estado);
    }
}
