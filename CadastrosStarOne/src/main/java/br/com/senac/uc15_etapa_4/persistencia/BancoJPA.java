package br.com.senac.uc15_etapa_4.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class BancoJPA {

    public static void cadastrar(Banco banco) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.persist(banco);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }

    }

    public static List<Banco> listar() {
        List<Banco> listaBanco = new ArrayList<Banco>();

        EntityManager manager = JPAUtil.conectar();
        try {
            Query consulta = manager.createQuery("SELECT b FROM banco b");
            listaBanco = consulta.getResultList();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }

        return listaBanco;

    }

    public static void excluir(int id) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            Banco banco = manager.find(Banco.class, id);
            if (banco != null) {
                manager.remove(banco);
            }
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }
    }

    public static Banco obter(int id) {
        EntityManager manager = JPAUtil.conectar();
        try {
            return manager.find(Banco.class, id);
        } finally {
            JPAUtil.desconectar();
        }
    }

    public static void atualizar(Banco banco) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.merge(banco);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.desconectar();
        }
    }
}
