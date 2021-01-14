package br.com.leiros.hellojakartaee.controler;

import br.com.leiros.hellojakartaee.entidades.Usuario;
import br.com.leiros.hellojakartaee.servicos.UsuarioServico;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class UsuarioBean implements Serializable {

    @Inject
    private UsuarioServico usuarioServico;

    private Usuario usuarioSelecionado;

    private List<Usuario> usuarios;

    @PostConstruct
    public void iniciar(){
        this.usuarios = this.usuarioServico.listarTodos();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
        this.usuarioSelecionado = usuarioSelecionado;
    }

    private void showMessage(String clientId) {
        FacesContext.getCurrentInstance()
                .addMessage(null,
                        new FacesMessage(FacesMessage.SEVERITY_INFO, clientId +
                                " multiview state has been cleared out", null));
    }
}
