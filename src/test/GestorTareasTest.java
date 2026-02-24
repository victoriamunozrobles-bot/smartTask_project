package test;

import org.junit.Before;
import org.junit.Test;

import main.GestorTareas;
import main.Tarea;
import main.TareaNormal;
import main.TareaUrgente;

import static org.junit.Assert.*;

import java.util.List;

public class GestorTareasTest {
    private GestorTareas gestor;

    @Before
    public void setUp() {
        gestor = new GestorTareas();
    }

    @Test
    public void testAgregarTarea() {
        Tarea tarea = new TareaNormal(1, "Estudiar JUnit", 2);

        gestor.agregarTarea(tarea);

        List<Tarea> lista = gestor.getTareas();

        assertFalse("La lista no debería estar vacía", lista.isEmpty());

        assertEquals("Debería haber exactamente 1 tarea en la lista", 1, lista.size());

        assertEquals("Estudiar JUnit", lista.get(0).getNombre());
    }

    @Test
    public void testAgregarTarea_emptyTaskList() {
        List<Tarea> lista = gestor.getTareas();

        assertTrue("La lista debería estar vacía", lista.isEmpty());

    }

    @Test
    public void testMarcarCompletada() {
        Tarea tarea = new TareaUrgente(100, "Pagar cuentas", 1);
        gestor.agregarTarea(tarea);

        assertFalse("La tarea debería iniciar como NO completada", tarea.getCompletado());

        gestor.marcarCompletada(100);

        assertTrue("La tarea debería estar marcada como completada", tarea.getCompletado());
    }

    @Test
    public void testMarcarCompletada_IdNoExistente() {
        gestor.agregarTarea(new TareaNormal(1, "Tarea Real", 1));

        gestor.marcarCompletada(999);

        assertFalse("La tarea original no debería haber cambiado", gestor.getTareas().get(0).getCompletado());
    }

    @Test
    public void testEliminarTarea() {
        Tarea t1 = new TareaNormal(1, "Tarea Uno", 2);
        Tarea t2 = new TareaNormal(2, "Tarea Dos", 2);

        gestor.agregarTarea(t1);
        gestor.agregarTarea(t2);

        assertEquals(2, gestor.getTareas().size());

        gestor.eliminarTarea(1);

        assertEquals("Debería quedar 1 tarea", 1, gestor.getTareas().size());

        assertEquals(2, gestor.getTareas().get(0).getId());
    }

    @Test
    public void testEliminarTarea_IdNoExistente() {
        gestor.agregarTarea(new TareaNormal(1, "Tarea 1", 1));

        gestor.eliminarTarea(50);

        assertEquals("La lista debería seguir teniendo 1 tarea", 1, gestor.getTareas().size());
    }

    @Test
    public void testListarTareasNoFalla() {
        Tarea t1 = new TareaNormal(5, "Test Listar", 2);
        gestor.agregarTarea(t1);

        gestor.listarTareas();
    }

    @Test
    public void testListarTareasFalla() {
        Tarea t1 = new TareaNormal(5, "Test Listar", 2);
        gestor.agregarTarea(t1);
        gestor.agregarTarea(null);

        assertThrows(NullPointerException.class, () -> {
            gestor.listarTareas();
        });

    }

    @Test
    public void testListarTareas_ListaVacia() {
        try {
            gestor.listarTareas();
        } catch (Exception e) {
            fail("listarTareas() no debería fallar con una lista vacía");
        }
    }
}
