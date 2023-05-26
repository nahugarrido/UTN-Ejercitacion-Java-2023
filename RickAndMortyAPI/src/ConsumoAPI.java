import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ConsumoAPI {

    public static String apiURL = "https://rickandmortyapi.com/api/character/";

    public static String getInfo() {
        try {
            URL url = new URL(apiURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("Codigo de error: " + responseCode);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    stringBuilder.append(scanner.nextLine());
                }
                scanner.close();

                return stringBuilder.toString();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    public static String getInfoPage(int page) {
        try {
            URL url = new URL(apiURL + "?page=" + page);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("Codigo de error: " + responseCode);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    stringBuilder.append(scanner.nextLine());
                }
                scanner.close();

                return stringBuilder.toString();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }
}