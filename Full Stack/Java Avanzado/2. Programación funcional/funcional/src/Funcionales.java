import java.util.function.Function;

public class Funcionales {

    private Function<String, String> toMayus = (x) -> x.toUpperCase();
    private Function<Integer, Integer> sumador = (x) -> x.sum(x, x);
    public void pruebas() {
        toMayus.apply("Tito");
        sumador.apply(5);
    }

    public String toMayus(String x) {
        return x.toUpperCase();
    }
}
