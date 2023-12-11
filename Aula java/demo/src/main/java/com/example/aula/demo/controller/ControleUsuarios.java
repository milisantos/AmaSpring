package com.example.aula.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.aula.demo.model.Usuario;
import com.example.aula.demo.repository.Repositorio;

@RestController
@RequestMapping(value = "/usuarios")

public class ControleUsuarios {

    @Autowired
    private Repositorio acaoUser;

    @GetMapping
    public String usuario(){
        return "usuarios";
    }

    @GetMapping("/listaUsuarios")
    public ModelAndView listarUsuario(){

        ModelAndView mv = new ModelAndView("listaUsuarios");
        Iterable<Usuario> listaUsuario = acaoUser.findAll();

        mv.addObject("listaUsuario", listaUsuario);
        return mv;
    }

    List<Usuario> listaUsuario = new ArrayList<>();
    
    @PostMapping("/usuarios")
    public String user(@RequestParam String nome, @RequestParam int telefone, @RequestParam int cpf, @RequestParam String rua, @RequestParam String bairro, @RequestParam String cidade, @RequestParam int numero, @RequestParam String nomeCompleto){

        Usuario usuaria = new Usuario();

        usuaria.setNome(nome);
        usuaria.setTelefone(telefone);
        usuaria.setCpf(cpf);
        usuaria.setRua(rua);
        usuaria.setBairro(bairro);
        usuaria.setCidade(cidade);
        usuaria.setNumero(numero);
        usuaria.setNomeCompleto(nomeCompleto);

        acaoUser.save(usuaria);

        return "redirect:/listaUsuarios";
    }
    
}