import java.util.Vector;

public class Vectores {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector(16);
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("Capacidad: " + vector.capacity() + " Tamaño: " + vector.size());
        vector.trimToSize();
        System.out.println("Capacidad: " + vector.capacity() + " Tamaño: " + vector.size());


        System.out.println(vector.get(2));
        System.out.println("Datos del vector: " + vector);

        vector.remove(2);
        System.out.println("Datos del vector: " + vector);

        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());

        Vector<Integer> vector1 = new Vector(50, 15);

        Vector<Integer> vector2 = new Vector();
        vector2.add(1);
        vector2.add(2);


        boolean resultado = vector.equals(vector2);
        System.out.println("Son iguales? " + resultado);

        for (int i : vector) {
            System.out.println("Valor actual en vector: " + i);
        }

        for (int i = 0; i < vector.size() - 1; i++) {
            if (i % 2 == 0){
                vector.remove(i);
                continue;
            }
            System.out.println("Valor es: " + vector.get(i) + " en posición: " + i);
        }
    }
}
