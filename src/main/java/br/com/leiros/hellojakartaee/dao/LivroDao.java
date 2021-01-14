package br.com.leiros.hellojakartaee.dao;

import br.com.leiros.hellojakartaee.dao.interfaces.IDao;
import br.com.leiros.hellojakartaee.entidades.Livro;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless(name = "LivroDao")
public class LivroDao implements IDao<Livro> {

    @PersistenceContext(unitName="hello")
    private EntityManager em;

    @Override
    public void salvar(Livro livro) {
        em.persist(livro);
    }

    @Override
    public Livro atualizar(Livro livro) {
        Livro retorno = em.merge(livro);
        return retorno;
    }

    @Override
    public void apagar(Long codigo) {

    }

    @Override
    public List<Livro> listarTodos() {
        Query query =  em.createNamedQuery("listarTodosLivros");
        return query.getResultList();
    }

    @Override
    public Livro buscarPorCodigo(Long codigo) {
        return em.find(Livro.class, codigo);
    }
}
