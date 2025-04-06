package br.com.senac.uc15_etapa_4.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "banco")
public class Banco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String banco;

    public Banco() {
    }

    public Banco(int id, String banco) {
        this.id = id;
        this.banco = banco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

}
