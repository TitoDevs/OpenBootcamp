abstract class Vehiculo {
    String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    abstract int obtenerPotencia();
}

class Coche extends Vehiculo {
    @Override
    int obtenerPotencia() {
        return 1000;
    }
}

class Moto extends Vehiculo {
    @Override
    int obtenerPotencia() {
        return 1000;
    }
}

class Furgoneta extends Vehiculo {
    @Override
    int obtenerPotencia() {
        return 1750;
    }
}

class Avion extends Vehiculo {
    @Override
    int obtenerPotencia() {
        return 75000;
    }
}