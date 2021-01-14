package br.com.leiros.hellojakartaee.dao;

import br.com.leiros.hellojakartaee.dao.interfaces.IDao;
import br.com.leiros.hellojakartaee.entidades.Usuario;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless(name = "UsuarioDao")
public class UsuarioDao implements IDao<Usuario> {

    @PersistenceContext(unitName="hello")
    private EntityManager em;

    @Override
    public void salvar(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public Usuario atualizar(Usuario usuario) {
        Usuario retorno = em.merge(usuario);
        return retorno;
    }

    @Override
    public void apagar(Long codigo) {
        Usuario usuario = em.find(Usuario.class, codigo);
        em.remove(usuario);
    }

    @Override
    public List<Usuario> listarTodos() {
        Query query =  em.createNamedQuery("listarTodosUsuarios");
        return query.getResultList();
    }

    @Override
    public Usuario buscarPorCodigo(Long codigo) {
        return em.find(Usuario.class, codigo);
    }
}
