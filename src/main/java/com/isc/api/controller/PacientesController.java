package com.isc.api.controller;


import com.isc.api.model.Pacientes;
import com.isc.api.model.Usuarios;
import com.isc.api.service.PacientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pacientes",produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class PacientesController {
    @Autowired
    private PacientesService pacientesService;
    @PostMapping("/add")
    public Pacientes addPacientes(@RequestBody Pacientes pacientes){

        return pacientesService.crearPacientes(pacientes);
    }
    @GetMapping("/all")
    public List<Pacientes> listPacientes(){
        return pacientesService.listPacientes();
    }
    @PutMapping("/edit")
    public Pacientes editPacintes(@RequestBody Pacientes pacientes){
        return pacientesService.editarPacientes(pacientes);
    }
    @GetMapping("/list/{estado}")
    public List<Pacientes> listPacientesEstado(@PathVariable String estado){
        return pacientesService.listPacientesEstado(estado);
    }

}
