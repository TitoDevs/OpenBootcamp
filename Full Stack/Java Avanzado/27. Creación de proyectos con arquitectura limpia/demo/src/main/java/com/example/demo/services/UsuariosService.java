package com.example.demo.services;

import com.example.demo.entities.Usuario;
import com.example.demo.repositories.UsuariosDB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuariosService {
    UsuariosDB usuariosDB;

    public UsuariosService(UsuariosDB usuariosDB) {
        this.usuariosDB = usuariosDB;
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

        usuariosDB.insertar(usuario);
    }

    public void borrar(String username) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;
        usuariosDB.borrar(usuario);
    }
}
