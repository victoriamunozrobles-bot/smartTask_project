public class TareaNormal extends Tarea {
    private String normal;

    public TareaNormal(int id, String nombre, int prioridad, String completado, String normal) {
        super(id, nombre, prioridad, completado);
        this.normal = normal;
    }

}
