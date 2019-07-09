package com.practicah2.demo.repository;

import com.practicah2.demo.Model.Transportador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository

public interface TransportadorRepository extends JpaRepository<Transportador, Serializable> {
    public Transportador findByNolicencia(long cc);


}
