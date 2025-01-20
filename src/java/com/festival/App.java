import java.util.List;

public class App {
    public static void main(String[] args) {
        ImportadorDatos importador = new ImportadorDatos();
        List<Proyeccion> proyecciones = importador.importar("src/main/resources/proyecciones.csv");
        
        if (proyecciones.isEmpty()) {
            System.out.println("No se encontraron proyecciones en el archivo.");
            return;
        }

        System.out.println("Proyecciones importadas:");
        for (Proyeccion proyeccion : proyecciones) {
            System.out.println("Título: " + proyeccion.getPelicula().getTitulo());
            System.out.println("Director: " + proyeccion.getPelicula().getDirector());
            System.out.println("Duración: " + proyeccion.getPelicula().getDuracion() + " minutos");
            System.out.println("Sala: " + proyeccion.getSala().getNombre());
            System.out.println("Localidad: " + proyeccion.getSala().getLocalidad());
            System.out.println("Capacidad: " + proyeccion.getSala().getCapacidad());
            System.out.println("Horario: " + proyeccion.getHorario());
            System.out.println("------------------------------------------");
        }
    }
}
