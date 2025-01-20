import java.time.LocalDateTime;

public class Proyeccion {
    private Pelicula pelicula;
    private Sala sala;
    private LocalDateTime horario;

    // Getters y setters
    public Pelicula getPelicula() { return pelicula; }
    public void setPelicula(Pelicula pelicula) { this.pelicula = pelicula; }
    public Sala getSala() { return sala; }
    public void setSala(Sala sala) { this.sala = sala; }
    public LocalDateTime getHorario() { return horario; }
    public void setHorario(LocalDateTime horario) { this.horario = horario; }
}
