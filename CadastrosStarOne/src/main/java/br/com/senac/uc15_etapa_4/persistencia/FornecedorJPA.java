package br.com.senac.uc15_etapa_4.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class FornecedorJPA {

    public static void cadastrar(Fornecedor fornecedor) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.persist(fornecedor);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }

    }

    public static List<Fornecedor> listar() {
        List<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();

        EntityManager manager = JPAUtil.conectar();
        try {
            Query consulta = manager.createQuery("SELECT f FROM fornecedor f");
            listaFornecedor = consulta.getResultList();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }

        return listaFornecedor;

    }

    public static void excluir(int id) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            Fornecedor fornecedor = manager.find(Fornecedor.class, id);
            if (fornecedor != null) {
                manager.remove(fornecedor);
            }
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }
    }

    public static Fornecedor obter(int id) {
        EntityManager manager = JPAUtil.conectar();
        try {
            return manager.find(Fornecedor.class, id);
        } finally {
            JPAUtil.desconectar();
        }
    }

    public static void atualizar(Fornecedor fornecedor) {
        EntityManager manager = JPAUtil.conectar();
        try {
            manager.getTransaction().begin();
            manager.merge(fornecedor);
            manager.getTransaction().commit();
        } catch (Exception e) {
            manager.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.desconectar();
        }
    }
}
