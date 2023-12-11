package com.example.aula.demo.controller;

import com.example.aula.demo.model.Servicos;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/servicos")
public class ControleServico {

    // In a real application, you would use a service layer to interact with the data.
    private List<Servicos> servicosList = new ArrayList<>();

    @GetMapping
    public List<Servicos> getAllServicos() {
        return servicosList;
    }

    @GetMapping("/{id}")
    public Servicos getServicosById(@PathVariable int id) {
        // Implement logic to retrieve a Servicos by ID
        // You might want to use a service to handle business logic and data access
        return servicosList.stream()
                .filter(servicos -> servicos.getIdServico() == id)
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public void addServicos(@RequestBody Servicos servicos) {
        // Implement logic to add a new Servicos
        // You might want to use a service to handle business logic and data access
        servicosList.add(servicos);
    }

    @PutMapping("/{id}")
    public void updateServicos(@PathVariable int id, @RequestBody Servicos updatedServicos) {
        // Implement logic to update a Servicos by ID
        // You might want to use a service to handle business logic and data access
        for (int i = 0; i < servicosList.size(); i++) {
            Servicos servicos = servicosList.get(i);
            if (servicos.getIdServico() == id) {
                servicosList.set(i, updatedServicos);
                return;
            }
        }
    }

    @DeleteMapping("/{id}")
    public void deleteServicos(@PathVariable int id) {
        // Implement logic to delete a Servicos by ID
        // You might want to use a service to handle business logic and data access
        servicosList.removeIf(servicos -> servicos.getIdServico() == id);
    }
}