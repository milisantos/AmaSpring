package com.example.aula.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BancoAlimento{
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBanco;
    private String nome;
    private String cnpj;
    private String chavePix;
    private String linkBanco;

    public BancoAlimento(int idBanco, String nome, String cnpj, String chavePix, String linkBanco) {
        this.idBanco = idBanco;
        this.nome = nome;
        this.cnpj = cnpj;
        this.chavePix = chavePix;
        this.linkBanco = linkBanco;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getLinkBanco() {
        return linkBanco;
    }

    public void setLinkBanco(String linkBanco) {
        this.linkBanco = linkBanco;
    }

    
    
}