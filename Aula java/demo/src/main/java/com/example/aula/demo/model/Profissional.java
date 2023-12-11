package com.example.aula.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Profissional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfissional;
    private String nome;
    private String email;
    private int telefone;
    private int cpf;
    private String rua;
    private String bairro;
    private String cidade;
    private String premium;
    private int numero;
    private float estrelas;

    

    public Profissional(int idProfissional, String nome, String email, int telefone, int cpf, String rua, String bairro,
            String cidade, String premium, int numero, float estrelas) {
        this.idProfissional = idProfissional;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.premium = premium;
        this.numero = numero;
        this.estrelas = estrelas;
    }

    public Profissional (){

    }

    public int getIdProfissional() {
        return idProfissional;
    }
    public void setIdProfissional(int idProfissional) {
        this.idProfissional = idProfissional;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getPremium() {
        return premium;
    }
    public void setPremium(String premium) {
        this.premium = premium;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public float getEstrelas() {
        return estrelas;
    }
    public void setEstrelas(float estrelas) {
        this.estrelas = estrelas;
    }

    
}