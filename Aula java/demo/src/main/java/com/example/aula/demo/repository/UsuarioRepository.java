package com.example.aula.demo.repository;

import com.example.aula.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Você pode adicionar consultas personalizadas aqui, se necessário
}
