package com.isc.api.controller;

import com.isc.api.model.Usuarios;
import com.isc.api.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios",produces = "application/json")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class UsuariosController {
    @Autowired
    private UsuariosService usuariosService;
    @PostMapping("/add")
    public Usuarios addUsuarios(@RequestBody Usuarios usuarios){
        return usuariosService.crearUsuarios(usuarios);
    }
    @GetMapping("all")
    public List<Usuarios> listUsuarios(){
        return  usuariosService.listUsuarios();
    }
}
