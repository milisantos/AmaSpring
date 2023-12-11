package com.example.aula.demo.controller;

import com.example.aula.demo.model.Agendamento;
import com.example.aula.demo.model.Usuario;
import com.example.aula.demo.repository.AgendamentoRepository;
import com.example.aula.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/agendamentos")
public class ControleAgendamento {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public String exibirFormulario(Model model) {
        List<Usuario> usuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", usuarios);
        return "agendamentos";
    }

    @GetMapping("/listaAgendamentos")
    public String listarAgendamentos(Model model) {
        List<Agendamento> listaAgendamentos = agendamentoRepository.findAll();
        model.addAttribute("listaAgendamentos", listaAgendamentos);
        return "listaAgendamentos";
    }

    @PostMapping("/agendar")
    public String agendar(
            @RequestParam String dataAgendamento,
            @RequestParam String horaAgendamento,
            @RequestParam String descricao,
            @RequestParam Long idUsuario) {

        Agendamento agendamento = new Agendamento();
        // Definir data, hora, descrição, etc.

        // Obter o usuário pelo ID
        Usuario usuario = usuarioRepository.findById(idUsuario).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        agendamento.setUsuario(usuario);

        agendamentoRepository.save(agendamento);

        return "redirect:/agendamentos/listaAgendamentos";
    }
}
