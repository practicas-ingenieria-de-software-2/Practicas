package com.practicah2.demo.controller;

import com.practicah2.demo.Model.Transportador;
import com.practicah2.demo.repository.TransportadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Transportadorcontroller{
    @Autowired
    private TransportadorRepository transportadorRepository;

    // Get All Users
    @GetMapping("/users")
    public List<Transportador> getAllUsers() {
        return transportadorRepository.findAll();
    }
    // Get a Single User
    @GetMapping("/users/{id}")
    public Transportador getUserById(@PathVariable(value = "id") Long userId) {
        return  transportadorRepository.findByNolicencia(userId);
    }

    // Create a new User
    @PostMapping("/users")
    public Transportador createUser(@Valid @RequestBody Transportador user) {
            return transportadorRepository.save(user);
        }

    }

