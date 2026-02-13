public abstract class Tarea {
    private int id;
    private String nombre;
    private int prioridad;
    private String completado;

    public Tarea(int id, String nombre, int prioridad, String completado) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.completado = completado;
    }

}
