package com.isc.api.service;
import com.isc.api.model.Pagos;
import com.isc.api.repository.PagosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagosService {
    @Autowired
    private PagosRepository pagosRepository;
    public Pagos crearPagos(Pagos pagos){
        return pagosRepository.save(pagos);
    }
    public List<Pagos> listPagos(){
        return pagosRepository.findAll();
    }
    public List<Pagos> listPagosEstado(String estado){
        return pagosRepository.listPagosEstado(estado);
    }
}
