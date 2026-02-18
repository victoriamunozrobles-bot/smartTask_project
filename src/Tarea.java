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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getCompletado() {
        return completado;
    }

    public void setCompletado(String completado) {
        this.completado = completado;
    }

}
