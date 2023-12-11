package com.example.aula.demo.repository;

import com.example.aula.demo.model.Conteudos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConteudoRepository extends JpaRepository<Conteudos, Integer> {
    // Você pode adicionar consultas personalizadas aqui, se necessário
}
