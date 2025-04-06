package br.com.senac.uc15_etapa_4.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class UtilizacaoJPA {

    public static void cadastrar(Utilizacao utilizacao) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.persist(utilizacao);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }

    }

    public static List<Utilizacao> listar() {
        List<Utilizacao> listaUtilizacao = new ArrayList<Utilizacao>();

        EntityManager manager = JPAUtil.conectar();
        try {
            Query consulta = manager.createQuery("SELECT u FROM utilizacao_produto u");
            listaUtilizacao = consulta.getResultList();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }

        return listaUtilizacao;

    }

    public static void excluir(int id) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            Utilizacao utilizacao = manager.find(Utilizacao.class, id);
            if (utilizacao != null) {
                manager.remove(utilizacao);
            }
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }
    }

    public static Utilizacao obter(int id) {
        EntityManager manager = JPAUtil.conectar();
        try {
            return manager.find(Utilizacao.class, id);
        } finally {
            JPAUtil.desconectar();
        }
    }

    public static void atualizar(Utilizacao utilizacao) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.merge(utilizacao);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.desconectar();
        }
    }
}
