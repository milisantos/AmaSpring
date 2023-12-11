package com.example.aula.demo.repository;

import com.example.aula.demo.model.Servicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicosRepository extends JpaRepository<Servicos, Integer> {
    // Você pode adicionar consultas personalizadas aqui, se necessário
}