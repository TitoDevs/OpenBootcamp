import java.util.*;
public class LinkedList {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        java.util.LinkedList<String> listaEnlazada = new java.util.LinkedList<>(lista);

    }
}
