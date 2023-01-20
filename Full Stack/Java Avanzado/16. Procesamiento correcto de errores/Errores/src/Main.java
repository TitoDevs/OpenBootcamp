import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Usuario usuario = null;
        Usuarios usuarios = new Usuarios(usuario);

        for (Usuario actual: usuarios.getUsuarios2()) {
            try {
                System.out.println(actual.name);
            } catch (NullPointerException e) {
            System.out.println("EXCEPTION! Name es NULOOOOOOOOO");
            } finally {
                System.out.println("Finally");
            }

        }
    }

    public static int divisionPorCero(int valor, int dividendo) throws IOException, ArithmeticException {
        int resultado = 0;
        try {
            resultado = valor / dividendo;
            if (dividendo == 1) {
                throw new IOException();
            }
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return resultado;
    }
}