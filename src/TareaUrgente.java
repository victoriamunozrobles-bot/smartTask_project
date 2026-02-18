public class TareaUrgente extends Tarea {
    private String urgente;

    public TareaUrgente(int id, String nombre, int prioridad, String completado, String urgente) {
        super(id, nombre, prioridad, completado);
        this.urgente = urgente;
    }
}
