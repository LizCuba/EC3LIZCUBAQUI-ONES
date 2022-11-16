package com.liz.cuba.pe.ec3lizcuba.service;

import com.liz.cuba.pe.ec3lizcuba.model.Cliente;

import java.util.List;

public interface ClienteService {
    void guardar(Cliente cliente);
    void actualizar(Cliente cliente);
    void eliminar(Integer id);
    List<Cliente> listar();
    Cliente obtener(Integer id);
}
