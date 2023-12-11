package com.example.aula.demo.controller;

import com.example.aula.demo.model.BancoAlimento;
import com.example.aula.demo.repository.BancoAlimentoRepository;
import org.springframework.stereotype.Service;

@Service
public class ControleBanco {

    private final BancoAlimentoRepository bancoAlimentoRepository;

    public ControleBanco (BancoAlimentoRepository bancoAlimentoRepository) {
        this.bancoAlimentoRepository = bancoAlimentoRepository;
    }

    public void realizarDoacao(BancoAlimento bancoAlimento) {
      
        bancoAlimentoRepository.save(bancoAlimento);
    }
}

