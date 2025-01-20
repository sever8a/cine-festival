public class App {
    public static void main(String[] args) {
        ImportadorDatos importador = new ImportadorDatos();
        List<Proyeccion> proyecciones = importador.importar("src/main/resources/proyecciones.csv");
        // Gestionar las proyecciones importadas
    }
}
