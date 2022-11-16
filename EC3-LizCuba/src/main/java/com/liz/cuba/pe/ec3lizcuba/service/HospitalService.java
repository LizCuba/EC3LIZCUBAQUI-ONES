package com.liz.cuba.pe.ec3lizcuba.service;


import com.liz.cuba.pe.ec3lizcuba.model.Hospital;

import java.util.List;

public interface HospitalService {

    void guardar(Hospital hospital);
    void actualizar(Hospital hospital);
    void eliminar(Integer id);
    List<Hospital> listar();
    Hospital obtener(Integer id);
}
