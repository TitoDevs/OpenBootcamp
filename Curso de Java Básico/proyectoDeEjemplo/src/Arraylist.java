import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // List lista = new ArrayList<String>();

        // CapacidadVector = CapacidadVector * 2
        //
        // CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        lista.remove("ElementoB");
        System.out.println("contenido: " + lista);

        for (String nombre : lista) {
            System.out.println(nombre);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        String array[] = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }

        for (String elemento : array) {
            System.out.println("Elemento es: " + elemento);
        }

        for (Object arrayObject : lista.toArray()){
            System.out.println(arrayObject.toString());
        }
    }
}
