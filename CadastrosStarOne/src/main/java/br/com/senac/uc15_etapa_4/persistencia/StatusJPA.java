package br.com.senac.uc15_etapa_4.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class StatusJPA {

    public static void cadastrar(Status status) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.persist(status);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }

    }

    public static List<Status> listar() {
        List<Status> listaStatus = new ArrayList<Status>();

        EntityManager manager = JPAUtil.conectar();
        try {
            Query consulta = manager.createQuery("SELECT s FROM status_cadastro s");
            listaStatus = consulta.getResultList();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }

        return listaStatus;

    }

    public static void excluir(int id) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            Status status = manager.find(Status.class, id);
            if (status != null) {
                manager.remove(status);
            }
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }
    }

    public static Status obter(int id) {
        EntityManager manager = JPAUtil.conectar();
        try {
            return manager.find(Status.class, id);
        } finally {
            JPAUtil.desconectar();
        }
    }

    public static void atualizar(Status status) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.merge(status);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.desconectar();
        }
    }
}
