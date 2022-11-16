package com.liz.cuba.pe.ec3lizcuba.repository;

import com.liz.cuba.pe.ec3lizcuba.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
