package com.liz.cuba.pe.ec3lizcuba.repository;

import com.liz.cuba.pe.ec3lizcuba.model.UsuarioCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioCliente, Integer> {
    UsuarioCliente findByUsuario(String usuario);
}
