package com.example.aula.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Servicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServico;
    private String nomeServico;
    private String profissaoServico;
    /* imagem */
    private float estrelasServico;
    private String titulo;
    private String descricao;
    private double preco;
    /* data */
    private String premiumServico;
    /* chave estrangeira */
    
    public Servicos(int idServico, String nomeServico, String profissaoServico, float estrelasServico, String titulo,
            String descricao, double preco, String premiumServico) {
        this.idServico = idServico;
        this.nomeServico = nomeServico;
        this.profissaoServico = profissaoServico;
        this.estrelasServico = estrelasServico;
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        this.premiumServico = premiumServico;
    }
    public int getIdServico() {
        return idServico;
    }
    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }
    public String getNomeServico() {
        return nomeServico;
    }
    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }
    public String getProfissaoServico() {
        return profissaoServico;
    }
    public void setProfissaoServico(String profissaoServico) {
        this.profissaoServico = profissaoServico;
    }
    public float getEstrelasServico() {
        return estrelasServico;
    }
    public void setEstrelasServico(float estrelasServico) {
        this.estrelasServico = estrelasServico;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getPremiumServico() {
        return premiumServico;
    }
    public void setPremiumServico(String premiumServico) {
        this.premiumServico = premiumServico;
    }

    
}