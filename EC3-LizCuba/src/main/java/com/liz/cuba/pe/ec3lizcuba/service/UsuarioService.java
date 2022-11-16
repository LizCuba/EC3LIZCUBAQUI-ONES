package com.liz.cuba.pe.ec3lizcuba.service;

import com.liz.cuba.pe.ec3lizcuba.model.UsuarioCliente;

import java.util.List;

public interface UsuarioService {
    void guardar(UsuarioCliente usuario);
    void actualizar(UsuarioCliente usuario);
    void eliminar(Integer id);
    List<UsuarioCliente> listar();
    UsuarioCliente obtener(Integer id);
}
