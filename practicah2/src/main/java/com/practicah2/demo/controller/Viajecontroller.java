package com.practicah2.demo.controller;

import com.practicah2.demo.Model.Viaje;
import com.practicah2.demo.repository.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Viaje")
public class Viajecontroller {
    @Autowired
    private ViajeRepository viajeRepository;

    // Get All Users
    @GetMapping("/users")
    public List<Viaje> getAllUsers() {
        return viajeRepository.findAll();
    }
    // Get a Single User
    @GetMapping("/users/{id}")
    public Optional<Viaje> getUserById(@PathVariable(value = "id") Long userId) {
        return  viajeRepository.findById(userId);
    }

    // Create a new User
    @PostMapping("/users")
    public Viaje createUser(@Valid @RequestBody Viaje user) {
        return viajeRepository.save(user);
    }
}
