package com.practicah2.demo.controller;

import com.practicah2.demo.Model.Carro;
import com.practicah2.demo.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/Carro")
public class Carrocontroller {

    @Autowired
    private CarroRepository carroRepository;

    // Get All Users
    @GetMapping("/users")
    public List<Carro> getAllUsers() {
        return carroRepository.findAll();
    }
    // Get a Single User
    @GetMapping("/users/{id}")
    public Carro getUserById(@PathVariable(value = "id") Long userId) {
        return carroRepository.findByPlaca(userId);
    }

    // Create a new User
    @PostMapping("/users")
    public Carro createUser(@Valid @RequestBody Carro car) {
        return carroRepository.save(car);
    }
}
