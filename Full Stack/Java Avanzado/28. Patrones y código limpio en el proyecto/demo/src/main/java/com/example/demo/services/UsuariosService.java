package com.example.demo.services;

import com.example.demo.entities.Usuario;
import com.example.demo.entities.UsuariosBuilder;
import com.example.demo.repositories.UsuariosDB;
import com.example.demo.repositories.UsuariosDBFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuariosService {
    UsuariosDBFactory udbf = new UsuariosDBFactory("memoria");
    UsuariosDB usuariosDB = udbf.getDatabaseInstance();

    public UsuariosService(UsuariosDB usuariosDB) {
        this.usuariosDB = usuariosDB;
    }

    public void Usuarios() {

    }

    public ArrayList<Usuario> listar() {
        return usuariosDB.obtener();
    }

    public Usuario obtener(String username) {
        ArrayList<Usuario> usuarios = usuariosDB.obtener();

        for (Usuario usuarioActual : usuarios) {
            if (usuarioActual.nombreUsuario.equalsIgnoreCase(username)) {
                return usuarioActual;
            }
        }

        return null;
    }

    public void insertar(Usuario usuario) {
        if (obtener(usuario.nombreUsuario) != null) {
            return;
        }

        Usuario usuarioFiltrado = crearUsuarioReal(usuario);
        usuariosDB.insertar(usuarioFiltrado);
    }

    public void borrar(String username) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;
        usuariosDB.borrar(usuario);
    }

    private Usuario crearUsuarioReal(Usuario usuario) {
        UsuariosBuilder usuariosBuilder = new UsuariosBuilder(usuario.nombreUsuario);
        Usuario temp = usuariosBuilder
                .conNombre(usuario.nombre)
                .conApellidos(usuario.apellidos.)
                .conNivelDeAcceso(usuario.nivelAcceso)
                .conEmail(usuario.email)
                .build();

        return temp;
    }
}
