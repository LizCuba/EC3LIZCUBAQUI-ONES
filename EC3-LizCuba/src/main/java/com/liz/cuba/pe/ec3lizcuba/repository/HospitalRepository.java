package com.liz.cuba.pe.ec3lizcuba.repository;

import com.liz.cuba.pe.ec3lizcuba.model.Hospital;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
}
