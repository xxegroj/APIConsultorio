package com.isc.api.service;

import com.isc.api.model.Doctores;
import com.isc.api.repository.DoctoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctoresService {
@Autowired
private DoctoresRepository doctoresRepository;
public Doctores crearDoctores(Doctores doctores){
    return doctoresRepository.save(doctores);
}
public Doctores editarDoctores(Doctores doctores){return doctoresRepository.save(doctores);}
public List<Doctores> listDoctores(){
    return doctoresRepository.findAll();
}
public List<Doctores> listDoctoresEstado(String estado){
    return doctoresRepository.listDoctoresEstado(estado);
}
}
