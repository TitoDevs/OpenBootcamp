
interface Animal {
    boolean beber();
}

interface AnimalVolador {
    boolean beber();
    boolean volar();
}


public class Pajaro implements AnimalVolador {

    @Override
    public boolean beber() {
        return false;
    }

    @Override
    public boolean volar() {
        return false;
    }
}

private class Perro implements Animal {

    @Override
    public boolean beber() {
        return false;
    }
}
