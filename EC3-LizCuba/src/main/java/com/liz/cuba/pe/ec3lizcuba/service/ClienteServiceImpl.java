package com.liz.cuba.pe.ec3lizcuba.service;

import com.liz.cuba.pe.ec3lizcuba.model.Cliente;
import com.liz.cuba.pe.ec3lizcuba.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
 class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository repository;

    @Override
    public void guardar(Cliente cliente) {
        repository.save(cliente);
    }

    @Override
    public void actualizar(Cliente cliente) {
        repository.saveAndFlush(cliente);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Cliente> listar() {
        return repository.findAll();
    }

    @Override
    public Cliente obtener(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
