package com.liz.cuba.pe.ec3lizcuba.controller;

import com.liz.cuba.pe.ec3lizcuba.model.UsuarioCliente;
import com.liz.cuba.pe.ec3lizcuba.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario/v1")
public class UsuarioControler {

    @Autowired
    private UsuarioService service;

    @RequestMapping(path = "/listar", method = RequestMethod.GET)
    public ResponseEntity<List<UsuarioCliente>> listar(){
        return new ResponseEntity<List<UsuarioCliente>>(service.listar(), HttpStatus.OK) ;
    }

    @RequestMapping(path="/guardar", method = RequestMethod.POST)
    public ResponseEntity<Void> guardar(@RequestBody UsuarioCliente usuarioCliente ){
        service.guardar(usuarioCliente);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
    public ResponseEntity<UsuarioCliente> obtenerPorId(@PathVariable Integer id){

        UsuarioCliente usuarioCliente = service.obtener(id);

        if( usuarioCliente != null) {
            return new ResponseEntity<UsuarioCliente>(usuarioCliente, HttpStatus.OK);
        }else {
            return new ResponseEntity<UsuarioCliente>(HttpStatus.NOT_FOUND);
        }

    }

    @RequestMapping(path = "/editar", method = RequestMethod.PUT)
    public ResponseEntity<Void> editar(@RequestBody UsuarioCliente usuarioCliente){

        UsuarioCliente u = service.obtener(usuarioCliente.getIdUsario());

        if( u != null) {
            service.actualizar(usuarioCliente);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }

    }

    @RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void>eliminar(@PathVariable Integer id){

        UsuarioCliente usuarioCliente = service.obtener(id);

        if(usuarioCliente != null) {
            service.eliminar(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }else {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }
}
