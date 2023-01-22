package Codigo.Inicial;

import java.util.ArrayList;

public interface UsuariosDB {

    ArrayList<Usuario> obtener();
    Usuario buscar(Usuario usuario);
    void insertar(Usuario usuario);
    void borrar(Usuario usuario);
}

