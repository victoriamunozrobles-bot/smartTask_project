import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        GestorTareas gestor = new GestorTareas();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        System.out.println(
                "______________________________________________________________");
        System.out.println("Bienvenido a SmartTask");
        System.out.println(
                "______________________________________________________________");

        while (continuar) {
            try {
                System.out.println("\n--- MENÚ PRINCIPAL ---");
                System.out.println("1. Agregar Tarea");
                System.out.println("2. Mostrar lista de Tareas");
                System.out.println("3. Marcar como Completada");
                System.out.println("4. Eliminar Tarea");
                System.out.println("0. Salir");
                System.out.println("----------------------");
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("\n--- AGREGAR TAREA ---");
                        System.out.print("Nombre de la tarea: ");
                        String nombre = scanner.nextLine();

                        int idGenerado = (int) (Math.random() * 10000);

                        System.out.println("Seleccione la prioridad de la tarea:");
                        System.out.println("1. Tarea URGENTE");
                        System.out.println("2. Tarea NORMAL");
                        int prioridad = 0;

                        try {
                            prioridad = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Error: La prioridad debe ser un número. Se asignará 1 por defecto.");
                            prioridad = 1;
                        }
                        Tarea nuevaTarea = null;
                        if (prioridad == 1) {
                            nuevaTarea = new TareaUrgente(idGenerado, nombre, 1);
                        } else {
                            nuevaTarea = new TareaNormal(idGenerado, nombre, 2);
                        }

                        gestor.agregarTarea(nuevaTarea);
                        break;

                    case 2:
                        gestor.listarTareas();
                        break;

                    case 3:
                        System.out.print("Ingrese el ID de la tarea a marcar como completada: ");
                        int idCompletar = scanner.nextInt();
                        gestor.marcarCompletada(idCompletar);
                        break;

                    case 4:
                        System.out.print("Ingrese el ID de la tarea a eliminar: ");
                        int idEliminar = scanner.nextInt();
                        gestor.eliminarTarea(idEliminar);
                        break;

                    case 0:
                        continuar = false;
                        System.out.println("¡Gracias por usar SmartTask! ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        break;
                }

            } catch (Exception e) {
                System.out.println(">>> ERROR: Entrada inválida. Por favor ingrese un número. <<<");
                scanner.nextLine();
            }
        }

        scanner.close();

    }
}
