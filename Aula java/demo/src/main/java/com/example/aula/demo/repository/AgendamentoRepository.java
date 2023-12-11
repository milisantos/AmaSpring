package com.example.aula.demo.repository;

import com.example.aula.demo.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    // Você pode adicionar consultas personalizadas aqui, se necessário
}
