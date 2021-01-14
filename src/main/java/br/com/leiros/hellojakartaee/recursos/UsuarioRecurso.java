package br.com.leiros.hellojakartaee.recursos;

import br.com.leiros.hellojakartaee.entidades.Usuario;
import br.com.leiros.hellojakartaee.servicos.UsuarioServico;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/usuario")
public class UsuarioRecurso {

    @Inject
    private UsuarioServico usuarioServico;

    @GET
    @Produces("application/json")
    public List<Usuario> listarTodos() {
        return usuarioServico.listarTodos();
    }
}