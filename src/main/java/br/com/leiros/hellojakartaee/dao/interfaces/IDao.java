package br.com.leiros.hellojakartaee.dao.interfaces;

import javax.ejb.Remote;
import java.io.Serializable;
import java.util.List;

@Remote
public interface IDao<T> extends Serializable {

    void salvar(T t);
    T atualizar(T t);
    void apagar(Long codigo);
    List<T> listarTodos();
    T buscarPorCodigo(Long codigo);

}
