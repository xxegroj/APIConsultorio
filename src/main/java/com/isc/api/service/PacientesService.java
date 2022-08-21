package com.isc.api.service;

import com.isc.api.model.Pacientes;
import com.isc.api.repository.PacientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacientesService {
    @Autowired
    private PacientesRepository pacientesRepository;
    public Pacientes crearPacientes(Pacientes pacientes){
        return pacientesRepository.save(pacientes);
    }
    public Pacientes editarPacientes(Pacientes pacientes){return pacientesRepository.save(pacientes);}
    public List<Pacientes> listPacientes(){
        return pacientesRepository.findAll();
    }
    public List<Pacientes> listPacientesEstado(String estado){
        return pacientesRepository.listPacientesEstado(estado);
    }
}
