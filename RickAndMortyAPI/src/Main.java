import modelos.Personaje;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Personaje> listaPersonajes = new ArrayList<>();

        try {
            /// Primera conexion a la api para obtener cantidad de paginas

            JSONObject jsonObject = new JSONObject(ConsumoAPI.getInfo());
            JSONObject json_info = jsonObject.getJSONObject("info");
            int contPages = json_info.getInt("pages");

            /// recorre las paginas
            for (int i = 1; i <= contPages; i++) {

                JSONObject page = new JSONObject(ConsumoAPI.getInfoPage(i));
                JSONArray page_results = page.getJSONArray("results");

                /// recorre los elementos dentro de la pagina
                /// se realiza el mapeo al arreglo de personajes
                for (int j = 0; j < page_results.length(); j++) {
                    JSONObject elemento = page_results.getJSONObject(j);
                    Personaje nuevoPersonaje = new Personaje();
                    nuevoPersonaje.fromJSON(elemento);
                    listaPersonajes.add(nuevoPersonaje);
                }
            }

            /// escribir archivo
            /*FileWriterUtil.writeToFile(new ArrayList[]{listaPersonajes}, "listaDePersonajes");*/

            System.out.println("Lista de personajes------------");
            for(Personaje item : listaPersonajes) {
                System.out.println(item.toString() + "\n");
            }


        } catch (JSONException e) {
            System.out.println("Error en json o conexion a api: " + e.getMessage());
        }
    }
}