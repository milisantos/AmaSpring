package com.example.aula.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BancoLeite{
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBanco;
    private String nome;
    private String cnpj;
    /* private horario
     * private data
     * dias
     * iframe
     */
    private String endereço;
    private int telefone;
    private String linkBanco;
    public BancoLeite(int idBanco, String nome, String cnpj, String endereço, int telefone, String linkBanco) {
        this.idBanco = idBanco;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereço = endereço;
        this.telefone = telefone;
        this.linkBanco = linkBanco;
    }

    public BancoLeite(){

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

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getLinkBanco() {
        return linkBanco;
    }

    public void setLinkBanco(String linkBanco) {
        this.linkBanco = linkBanco;
    }

}