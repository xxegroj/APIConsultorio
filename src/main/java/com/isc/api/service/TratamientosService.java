package com.isc.api.service;


import com.isc.api.model.Tratamientos;
import com.isc.api.repository.TratamientosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TratamientosService {
    @Autowired
    private TratamientosRepository tratamientosRepository;
   public Tratamientos crearTratamientos(Tratamientos tratamientos){
       return (Tratamientos) tratamientosRepository.save(tratamientos);
   }
    public List<Tratamientos> listTratamientos(){

       return tratamientosRepository.findAll();
    }
    public List<Tratamientos> listTratamientosEstado(String estado){
        return tratamientosRepository.listTratamientosEstado(estado);
    }
}
