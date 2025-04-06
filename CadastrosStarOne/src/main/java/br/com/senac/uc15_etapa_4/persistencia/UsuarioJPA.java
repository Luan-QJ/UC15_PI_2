package br.com.senac.uc15_etapa_4.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class UsuarioJPA {

    public static Usuario validarUsuario(Usuario usuario) {
        EntityManager manager = JPAUtil.conectar();
        try {
            Query consulta = manager.createQuery("SELECT u FROM usuario u WHERE u.usuario = :usuario AND u.senha = :senha");
            consulta.setParameter("usuario", usuario.getUsuario());
            consulta.setParameter("senha", usuario.getSenha());
            List<Usuario> lista = consulta.getResultList();

            if (!lista.isEmpty()) {
                return lista.get(0);

            }

        } catch (Exception e) {
            manager.getTransaction().rollback();
        } finally {
            JPAUtil.desconectar();
        }

        return null;
    }

}
