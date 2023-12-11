package com.example.aula.demo.controller;

import com.example.aula.demo.model.Profissional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/profissionais")
public class ControleProfissional {


    private List<Profissional> profissionais = new ArrayList<>();

    @GetMapping
    public List<Profissional> Profissionais() {
        return profissionais;
    }

    @PostMapping
    public void addProfissional(@RequestBody Profissional profissional) {

        profissionais.add(profissional);
    }

    @PutMapping("/{id}")
    public void updateProfissional(@PathVariable int id, @RequestBody Profissional updatedProfissional) {
        // Implement logic to update a Profissional by ID
        // You might want to use a service to handle business logic and data access
        for (int i = 0; i < profissionais.size(); i++) {
            Profissional profissional = profissionais.get(i);
            if (profissional.getIdProfissional() == id) {
                profissionais.set(i, updatedProfissional);
                return;
            }
        }
    }

    @DeleteMapping("/{id}")
    public void deletarProfissional(@PathVariable int id) {

        profissionais.removeIf(profissional -> profissional.getIdProfissional() == id);
    }
}