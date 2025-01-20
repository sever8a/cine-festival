import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList;

public class ImportadorDatos {
    public List<Proyeccion> importar(String archivo) {
        List<Proyeccion> proyecciones = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Parsear la línea y crear objetos Proyeccion
                // Añadir objetos Proyeccion a la lista
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return proyecciones;
    }
}
