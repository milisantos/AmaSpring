package com.example.aula.demo.repository;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.aula.demo.model.Usuario;

//Importar @Repository do Spring
@Repository
//alterem de class para interface
//Extendam a classe CrudRepository do Spring
//Importem a classe Pessoa
public interface Repositorio extends CrudRepository<Usuario,Integer> {
 
   
   
}
