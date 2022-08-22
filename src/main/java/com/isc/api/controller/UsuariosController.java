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
    @PutMapping("/edit")
    public  Usuarios editUsuarios(@RequestBody Usuarios usuarios){
        return usuariosService.editarUsuario(usuarios);}
    @GetMapping("/list/{estado}")
    public List<Usuarios> listUsuariosEstado(@PathVariable String estado){
        return usuariosService.listUsuariosEstado(estado);
    }
    @DeleteMapping("/remove")
    public Usuarios eliminarUsuarios(@RequestBody Usuarios usuarios){
        return usuariosService.eliminarUsuarios(usuarios);
    }
    @GetMapping("/encriptar/{clave}")
    public String encriptarMD5(@PathVariable String clave){
        return usuariosService.encriptarLogin(clave);
    }
}
