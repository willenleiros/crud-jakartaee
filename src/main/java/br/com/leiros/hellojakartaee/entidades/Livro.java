package br.com.leiros.hellojakartaee.entidades;

import br.com.leiros.hellojakartaee.entidades.interfaces.IEntidade;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name="listarTodosLivros", query="SELECT l FROM Livro l")
})
public class Livro implements IEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String descricao;

    @Override
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
