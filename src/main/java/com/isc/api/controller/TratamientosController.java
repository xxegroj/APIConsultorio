package com.isc.api.controller;

import com.isc.api.model.Tratamientos;
import com.isc.api.model.Usuarios;
import com.isc.api.service.TratamientosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tratamientos",produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class TratamientosController {
    @Autowired
    private TratamientosService tratamientosService;
    @PostMapping("/add")
    public Tratamientos addTratamientos(@RequestBody Tratamientos tratamientos){

        return tratamientosService.crearTratamientos(tratamientos);
    }
    @GetMapping("/all")
    public List<Tratamientos> listTratamientos(){

        return tratamientosService.listTratamientos();}
    @PutMapping("/edit")
        public Tratamientos editTratamientos(@RequestBody Tratamientos tratamientos){
        return tratamientosService.editarTratamientos(tratamientos);
    }
    @GetMapping("/list/{estado}")
    public List<Tratamientos> listTratamientosEstado(@PathVariable String estado){
        return tratamientosService.listTratamientosEstado(estado);
    }
}
