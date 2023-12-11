package com.example.aula.demo.controller;

import com.example.aula.demo.model.Conteudos;
import com.example.aula.demo.repository.ConteudoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/conteudos")
public class ControleConteudos {

    @Autowired
    private ConteudoRepository conteudoRepository;

    @GetMapping
    public String conteudo() {
        return "conteudos";
    }

    
    @GetMapping("/listaConteudos")
    public ModelAndView listarConteudos() {
        ModelAndView mv = new ModelAndView("listaConteudos");
        Iterable<Conteudos> listaConteudos = conteudoRepository.findAll();
        mv.addObject("listaConteudos", listaConteudos);
        return mv;
    }

    @PostMapping("/conteudos")
    public String criarConteudo(
            @RequestParam String nomeConteudo,
            @RequestParam String profissaoConteudo,
            @RequestParam float estrelasConteudo,
            @RequestParam String tituloConteudo,
            @RequestParam String descricaoConteudo,
            @RequestParam double precoConteudo,
            @RequestParam int tempoConteudo,
            @RequestParam String imagemConteudo,
            @RequestParam int idProfissional) {

        Conteudos conteudo = new Conteudos();
        conteudo.setNomeConteudo(nomeConteudo);
        conteudo.setProfissaoConteudo(profissaoConteudo);
        conteudo.setEstrelasConteudo(estrelasConteudo);
        conteudo.setTituloConteudo(tituloConteudo);
        conteudo.setDescricaoConteudo(descricaoConteudo);
        conteudo.setPrecoConteudo(precoConteudo);
        conteudo.setTempoConteudo(tempoConteudo);
        conteudo.setImagemConteudo(imagemConteudo);
        conteudo.setIdProfissional(idProfissional);

        conteudoRepository.save(conteudo);

        return "redirect:/listaConteudos";
    }
}
