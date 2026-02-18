import org.junit.Before;
import org.junit.Test;
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
    public void testMarcarCompletada() {
        Tarea tarea = new TareaUrgente(100, "Pagar cuentas", 1);
        gestor.agregarTarea(tarea);

        assertFalse("La tarea debería iniciar como NO completada", tarea.getCompletado());

        gestor.marcarCompletada(100);

        assertTrue("La tarea debería estar marcada como completada", tarea.getCompletado());
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
    public void testListarTareasNoFalla() {
        Tarea t1 = new TareaNormal(5, "Test Listar", 2);
        gestor.agregarTarea(t1);

        gestor.listarTareas();

        assertTrue(true);
    }
}
