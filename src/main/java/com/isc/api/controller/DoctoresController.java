package com.isc.api.controller;

import com.isc.api.model.Doctores;
import com.isc.api.model.Usuarios;
import com.isc.api.service.DoctoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/doctores",produces = "application/json")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class DoctoresController {
    @Autowired
    private DoctoresService doctoresService;
    @PostMapping("/add")
    public Doctores addDoctores(@RequestBody Doctores doctores){
        return doctoresService.crearDoctores(doctores);
    }
    @GetMapping("/all")
    public List<Doctores> listDoctores(){
        return doctoresService.listDoctores();
    }
    @PutMapping("/edit")
    public Doctores editDoctores(@RequestBody Doctores doctores){
        return doctoresService.editarDoctores(doctores);
    }
    @GetMapping("/{estado}")
    public List<Doctores> listDoctoresEstado(@PathVariable String estado){
        return doctoresService.listDoctoresEstado(estado);
    }
}
