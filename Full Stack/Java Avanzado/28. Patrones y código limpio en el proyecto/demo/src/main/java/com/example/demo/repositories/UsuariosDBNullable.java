package com.example.demo.repositories;

import com.example.demo.entities.Usuario;

import java.util.ArrayList;

public class UsuariosDBNullable extends UsuariosDB {

    @Override
    public ArrayList<Usuario> obtener() {
        return null;
    }

    @Override
    public Usuario buscar(Usuario usuario) {
        return null;
    }

    @Override
    public void insertar(Usuario usuario){

    }

    @Override
    public void borrar(Usuario usuario) {

    }
}
