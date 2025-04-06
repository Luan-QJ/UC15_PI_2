package br.com.senac.uc15_etapa_4.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "condicao_pagamento")
public class CondicaoPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;
    private int prazo;

    public CondicaoPagamento() {

    }

    public CondicaoPagamento(int id, String descricao, int prazo) {
        this.id = id;
        this.descricao = descricao;
        this.prazo = prazo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

}
