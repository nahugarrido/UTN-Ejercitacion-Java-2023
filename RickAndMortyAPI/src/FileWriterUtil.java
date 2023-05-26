import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileWriterUtil {
    public static <T> void writeToFile(T[] entities, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (T entity : entities) {
                writer.write(entity.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> List<T> readFromFile(String filename) {
        List<T> entities = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                T entity = (T) line; // Realiza un casting del tipo String a T (puede ser necesario ajustarlo según el tipo de entidad)
                entities.add(entity);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return entities;
    }

    public <T> void showList(List<T> list) {
        for(T item : list) {
            System.out.println(item.toString() + "\n");
        }
    }


}
