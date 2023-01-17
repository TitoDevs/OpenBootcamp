import java.util.function.Function;

public class Funcionales {

    private Function<String, String> toMayus = (x) -> x.toUpperCase();
    private Function<Integer, Integer> sumador = (x) -> x.sum(x, x);
    public void pruebas() {
        saluda(toMayus, "Tito");
    }

    public void saluda(Function<String, String> mifuncion, String nombre) {
        mifuncion.apply(nombre);
    }
}
