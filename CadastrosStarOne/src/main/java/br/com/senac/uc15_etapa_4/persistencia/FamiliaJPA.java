package br.com.senac.uc15_etapa_4.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class FamiliaJPA {

    public static void cadastrar(Familia familia) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.persist(familia);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }

    }

    public static List<Familia> listar() {
        List<Familia> listaFamilia = new ArrayList<Familia>();

        EntityManager manager = JPAUtil.conectar();
        try {
            Query consulta = manager.createQuery("SELECT f FROM familia_produto f");
           listaFamilia = consulta.getResultList();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }

        return listaFamilia;

    }

    public static void excluir(int id) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            Familia familia = manager.find(Familia.class, id);
            if (familia != null) {
                manager.remove(familia);
            }
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }
    }

    public static Familia obter(int id) {
        EntityManager manager = JPAUtil.conectar();
        try {
            return manager.find(Familia.class, id);
        } finally {
            JPAUtil.desconectar();
        }
    }

    public static void atualizar(Familia familia) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.merge(familia);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.desconectar();
        }
    }
}
