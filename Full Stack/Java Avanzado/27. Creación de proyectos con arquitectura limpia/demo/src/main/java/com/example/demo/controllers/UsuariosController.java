package com.example.demo.controllers;

import com.example.demo.entities.Usuario;
import com.example.demo.services.UsuariosService;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.lang.annotation.Target;
import java.net.URI;

@Component
@Path("/")
public class UsuariosController {
    private final UsuariosService usuariosService;

    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @GET
    @Path("/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> listarTodos() {
        return usuariosService.listar();
    }

    @GET
    @Path("/usuarios/{nombre")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario listarUno(@PathParam("nombre") String nombre) {
        return usuariosService.obtener(nombre);
    }

    @POST
    @Path("/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crearUsuario(Usuario usuario) {
        usuariosService.insertar(usuario);

        return Response.created(
                URI.create("/usuarios/" + usuario.nombreUsuario)
        ).build();
    }

    @DELETE
    @Path("/usuarios/{nombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response borrarUsuario(@PathParam("nombre") String nombre) {
        usuariosService.borrar(nombre);

        return Response.ok().build();
    }

}
