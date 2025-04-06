package br.com.senac.uc15_etapa_4.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class CondicaoPagamentoJPA {

    public static void cadastrar(CondicaoPagamento condicao) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.persist(condicao);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }

    }

    public static List<CondicaoPagamento> listar() {
        List<CondicaoPagamento> listaCondicao = new ArrayList<CondicaoPagamento>();

        EntityManager manager = JPAUtil.conectar();
        try {
            Query consulta = manager.createQuery("SELECT c FROM condicao_pagamento c");
            listaCondicao = consulta.getResultList();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }

        return listaCondicao;

    }

    public static void excluir(int id) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            CondicaoPagamento condicao = manager.find(CondicaoPagamento.class, id);
            if (condicao != null) {
                manager.remove(condicao);
            }
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }
    }

    public static CondicaoPagamento obter(int id) {
        EntityManager manager = JPAUtil.conectar();
        try {
            return manager.find(CondicaoPagamento.class, id);
        } finally {
            JPAUtil.desconectar();
        }
    }

    public static void atualizar(CondicaoPagamento condicao) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.merge(condicao);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.desconectar();
        }
    }
}
