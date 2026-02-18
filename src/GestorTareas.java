import java.util.ArrayList;
import java.util.List;

public class GestorTareas implements Accionable {
    private List<Tarea> listaTareas;

    public GestorTareas() {
        this.listaTareas = new ArrayList<>();
    }

    @Override
    public void agregarTarea(Tarea tarea) {
        this.listaTareas.add(tarea);
        System.out.println("----------------------");
        System.out.println("Tarea agregada con éxito.");
        System.out.println("----------------------");
    }

    @Override
    public void listarTareas() {
        System.out.println("------------------ Lista de tareas ------------------");
        for (Tarea tarea : listaTareas) {
            System.out.println(tarea.toString());
        }
        System.out.println("------------------------------------------------------");
    }

    @Override
    public void marcarCompletada(int id) {
        boolean encontrada = false;

        for (Tarea tarea : listaTareas) {
            if (tarea.getId() == id) {
                tarea.setCompletado(true);
                System.out.println("----------------------");
                System.out.println("Tarea '" + tarea.getNombre() + "' completada :)");
                System.out.println("----------------------");
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("----------------------");
            System.out.println("No se encontró nunguna tarea con el ID: " + id);
            System.out.println("----------------------");
        }
    }

    @Override
    public void eliminarTarea(int id) {
        boolean eliminado = listaTareas.removeIf(tarea -> tarea.getId() == id);

        if (eliminado) {
            System.out.println("----------------------");
            System.out.println("La tarea '" + id + "' ha sido eliminada.");
            System.out.println("----------------------");
        } else {
            System.out.println("----------------------");
            System.out.println("ID no encontrado. No se pudo eliminar la tarea.");
            System.out.println("----------------------");
        }
    }

    public List<Tarea> getTareas() {
        return this.listaTareas;
    }
}
