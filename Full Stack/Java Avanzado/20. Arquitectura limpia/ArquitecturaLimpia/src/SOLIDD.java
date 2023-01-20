interface BaseDeDatos {
    void obtenerDatos();
    void enviarDatos();
}

class BDDMySQL implements BaseDeDatos {

}

class BDDFile implements BaseDeDatos {

}

public class SOLIDD {
    public BaseDeDatos bdd;

    public dameDatos(BaseDeDatos bdd) {

    }

    public tomaDatos(BaseDeDatos bdd) {

    }
}

public static class main {
    public static void main(String[] args) {
        SOLIDD solido = new SOLIDD();

        BDDFile bbdd = new BDDFile();
        BDDMySQL otrabbdd = new BDDMySQL();

        solido.dameDatos(bbdd);
        solido.tomaDatos(otrabbdd);
    }
}