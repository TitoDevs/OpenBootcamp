package ejemploJSON;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try {
            // Creamos el inputstream desde un fichero
            InputStream is = new FileInputStream("datos.json");

            // Creamos un tokenizador que leera desde nuestro IS
            JSONTokener tokener = new JSONTokener(is);

            // Y se lo pasamos a una instancia de la clase JSONObject
            JSONObject obj = new JSONObject(tokener);

            // Sacamos las credenciales
            JSONObject credenciales = obj.getJSONObject("credenciales");

            String usuario = credenciales.getString("usuario");
            String clave = credenciales.getString("clave");

            System.out.println("Usuario " + usuario + " clave " + clave);

            // Dentro de credenciales tenemos los videos
            JSONArray videos = credenciales.getJSONArray("videos");
            for (Object video : videos) {
                System.out.println(video.toString());
            }
        } catch (Exception e) {
            System.out.println("No se puede leer el fichero: " + e.getMessage());
        }
    }
}
