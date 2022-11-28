
import java.util.Map;
import java.util.TreeMap;

public class Mapas {
    public static void main(String[] args) {
        TreeMap<String, Integer> mapa = new TreeMap<>();
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);

        System.out.println(mapa);
        System.out.println(mapa.get("clave1"));

        // array["clave1"] = 10;

        mapa.replace("clave3", 45);
        mapa.remove("clave2");

        System.out.println(mapa);

        for (Map.Entry<String, Integer> elemento: mapa.entrySet()) {
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento valor es: " + elemento.getValue());
        }


    }
}
