package com.isc.api.controller;

import com.isc.api.model.Pacientes;
import com.isc.api.model.Pagos;
import com.isc.api.service.PacientesService;
import com.isc.api.service.PagosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pagos",produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class PagosController {
    @Autowired
    private PagosService pagosService;
    @PostMapping("/add")
    public Pagos addPagos(@RequestBody Pagos pagos){

        return pagosService.crearPagos(pagos);
    }
    @GetMapping("/all")
    public List<Pagos> listPagos(){

        return pagosService.listPagos();
    }

}
