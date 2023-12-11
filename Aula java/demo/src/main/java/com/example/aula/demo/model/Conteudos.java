package com.example.aula.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Conteudos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConteudo;
    private String nomeConteudo;
    private String profissaoConteudo;
    private float estrelasConteudo;
    private String tituloConteudo;
    private String descricaoConteudo;
    private double precoConteudo;
    private int tempoConteudo;
    private String imagemConteudo;
    private int idProfissional;

    public Conteudos(int idConteudo, String nomeConteudo, String profissaoConteudo, float estrelasConteudo,
                    String tituloConteudo, String descricaoConteudo, double precoConteudo, int tempoConteudo,
                    String imagemConteudo, int idProfissional) {
        this.idConteudo = idConteudo;
        this.nomeConteudo = nomeConteudo;
        this.profissaoConteudo = profissaoConteudo;
        this.estrelasConteudo = estrelasConteudo;
        this.tituloConteudo = tituloConteudo;
        this.descricaoConteudo = descricaoConteudo;
        this.precoConteudo = precoConteudo;
        this.tempoConteudo = tempoConteudo;
        this.imagemConteudo = imagemConteudo;
        this.idProfissional = idProfissional;
    }

    public Conteudos() {

    }

    public int getIdConteudo() {
        return idConteudo;
    }

    public void setIdConteudo(int idConteudo) {
        this.idConteudo = idConteudo;
    }

    public String getNomeConteudo() {
        return nomeConteudo;
    }

    public void setNomeConteudo(String nomeConteudo) {
        this.nomeConteudo = nomeConteudo;
    }

    public String getProfissaoConteudo() {
        return profissaoConteudo;
    }

    public void setProfissaoConteudo(String profissaoConteudo) {
        this.profissaoConteudo = profissaoConteudo;
    }

    public float getEstrelasConteudo() {
        return estrelasConteudo;
    }

    public void setEstrelasConteudo(float estrelasConteudo) {
        this.estrelasConteudo = estrelasConteudo;
    }

    public String getTituloConteudo() {
        return tituloConteudo;
    }

    public void setTituloConteudo(String tituloConteudo) {
        this.tituloConteudo = tituloConteudo;
    }

    public String getDescricaoConteudo() {
        return descricaoConteudo;
    }

    public void setDescricaoConteudo(String descricaoConteudo) {
        this.descricaoConteudo = descricaoConteudo;
    }

    public double getPrecoConteudo() {
        return precoConteudo;
    }

    public void setPrecoConteudo(double precoConteudo) {
        this.precoConteudo = precoConteudo;
    }

    public int getTempoConteudo() {
        return tempoConteudo;
    }

    public void setTempoConteudo(int tempoConteudo) {
        this.tempoConteudo = tempoConteudo;
    }

    public String getImagemConteudo() {
        return imagemConteudo;
    }

    public void setImagemConteudo(String imagemConteudo) {
        this.imagemConteudo = imagemConteudo;
    }

    public int getIdProfissional() {
        return idProfissional;
    }

    public void setIdProfissional(int idProfissional) {
        this.idProfissional = idProfissional;
    }
}
