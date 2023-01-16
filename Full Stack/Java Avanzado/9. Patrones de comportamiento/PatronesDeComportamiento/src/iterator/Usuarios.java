package iterator;

import java.util.LinkedList;

public class Usuarios implements UsuarioIterator {

    private LinkedList<Usuario> usuarios = new LinkedList<>();
    private int position = 0;

    public void crear(Usuario usuario) {
        usuarios.add(usuario);
    }
    @Override
    public boolean hayMas() {
        return position < usuarios.size();
    }

    @Override
    public void reinicia() {
        position = 0;
    }

    @Override
    public Usuario siguiente() {
        Usuario usuario = usuarios.get(position);
        position = position + 1;
        return usuario;
    }
}
