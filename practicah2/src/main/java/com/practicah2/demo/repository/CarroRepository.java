package com.practicah2.demo.repository;

import com.practicah2.demo.Model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository

public interface CarroRepository extends JpaRepository<Carro, Serializable> {
    public abstract Carro findByPlaca(long placa);


}
