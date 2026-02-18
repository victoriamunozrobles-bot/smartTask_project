public interface Accionable {

    public void agregarTarea(Tarea tarea);

    public void listarTareas();

    public void marcarCompletada(int id);

    public void eliminarTarea(int id);
}
