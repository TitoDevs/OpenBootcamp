package Demo1;

public class RelojImpl implements Reloj {

    @Override
    public String horaActual() {
        return "10";
    }

    @Override
    public String minutoActual() {
        return "08";
    }

    @Override
    public String segundoActual() {
        return "45";
    }
}
