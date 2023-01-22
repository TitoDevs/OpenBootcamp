import java.util.ArrayList;

abstract class UsuariosDB {
    abstract public ArrayList<Usuario> obtener();
    abstract Usuario buscar(Usuario usuario);
    abstract void insertar(Usuario usuario);
    abstract void borrar(Usuario usuario);
}
