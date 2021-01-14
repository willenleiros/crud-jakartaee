package br.com.leiros.hellojakartaee.servicos;

import br.com.leiros.hellojakartaee.dao.interfaces.IDao;
import br.com.leiros.hellojakartaee.entidades.Livro;
import br.com.leiros.hellojakartaee.entidades.Usuario;

import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.transaction.Transactional;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

@Dependent
public class UsuarioServico implements Serializable {

    @EJB(beanName = "UsuarioDao")
    private IDao usuarioDao;

    @EJB(beanName = "LivroDao")
    private IDao livroDao;

    @Transactional
    public void salvar(@Valid Usuario usuario){

        usuarioDao.salvar(usuario);

        Livro livro = new Livro();
        livro.setCodigo(1L);
        livro.setDescricao(usuario.getNome() + " - Chuva de sol");

        livroDao.salvar(livro);
    }

    public List<Usuario> listarTodos(){
        return usuarioDao.listarTodos();
    }

}
