package unidad1.Xestor_de_Tarefas_de_Mantemento_Informático;

import java.util.Scanner;

public class GestorTareas {
    static Scanner sc = new Scanner(System.in);
    static final int MAX_TAREAS = 10;

    static void main() {
        String[] tareas = new String[MAX_TAREAS];
        int opcion, numTareas = 0;

        do {
            opcion = mostrarMenu();

            switch (opcion) {
                case 1:
                    if (añadirTarea(tareas, numTareas)) {
                        numTareas++;
                    }
                    break;

                case 2:
                    cambiarEstadoTarea(tareas, numTareas, "EN REVISIÓN");
                    break;
                case 3:
                    cambiarEstadoTarea(tareas, numTareas, "COMPLETADA");
                    break;
                case 4:
                    listarTareas(tareas, numTareas);
                    break;
                case 5:
                    filtrarDescripcion(tareas, numTareas);
                    break;
                case 6:
                    filtrarUsuario(tareas, numTareas);
                    break;
                case 7:
                    resumen(tareas, numTareas);
                    break;
            }
        } while (opcion != 0);
    }


    static int mostrarMenu() {
        int opcion;


        System.out.println("Xestor de Tarefas de Mantemento Informático");
        System.out.println("-".repeat(45));
        System.out.println("\t1. Engadir nova tarefa");
        System.out.println("\t2. Revisar tarefa");
        System.out.println("\t3. Completar tarefa");
        System.out.println("\t4. Listar tarefas");
        System.out.println("\t5. Buscar tarefa por descrición");
        System.out.println("\t6. Filtrar tarefas por usuario");
        System.out.println("\t7. Resumo");
        System.out.println("\t0. SAÍR\n");

        do {
            System.out.print("Selecciona unha opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
        } while (opcion < 0 || opcion > 7);

        return opcion;
    }

    static boolean añadirTarea(String[] tareas, int numTareas) {
        String usuario, descripcion, tarea;

        System.out.println("\nAñadir Tarea");
        System.out.println("-".repeat(45));

        if (numTareas >= MAX_TAREAS) {
            System.out.println("Error: no se pueden añadir más tareas, memoria llena...\n");
            return false;
        }

        System.out.print("\tDescripción: ");
        descripcion = sc.nextLine();
        System.out.print("\tUsuario: ");
        usuario = sc.nextLine();

        descripcion = convertirPrimeraMayuscula(descripcion);
        usuario = convertirCamelCase(usuario);

        tarea = descripcion.concat(" | Solicitado por: ")
                .concat(usuario)
                .concat(" | Estado: PENDIENTE | Responsable: Ninguno");

        tareas[numTareas] = tarea;
        System.out.println();

        return true;
    }

    static String convertirPrimeraMayuscula(String texto) {
        texto = texto.substring(0, 1).toUpperCase()
                .concat(texto.substring(1).toLowerCase());
        return texto;
    }

    static String convertirCamelCase(String texto) {
        String[] partes = texto.split("\\s+");

        String formateado = "";
        for (String p : partes) {
            formateado = p.substring(0, 1).toUpperCase()
                    .concat(p.substring(1).toLowerCase())
                    .concat(" ");
        }
        return formateado.trim();
    }

    static void listarTareas(String[] tareas, int numTareas) {
        System.out.println("\nListar Tareas");
        System.out.println("-".repeat(45));

        for (int i = 0; i < numTareas; i++) {
            System.out.println((i + 1) + ". " + tareas[i]);
        }

        System.out.println();
    }

    static void revisarTarea(String[] tareas, int numTareas) {
        String[] partes;
        String responsable;
        int n;

        listarTareas(tareas, numTareas);
        do {
            System.out.print("Que tarea quieres revisar? ");
            n = sc.nextInt();
            sc.nextLine();
        } while (n <= 0 || n > numTareas);
        n--;

        System.out.print("Responsable? ");
        responsable = sc.nextLine();
        partes = tareas[n].split("\\|");
        tareas[n] = partes[0].concat("|")
                .concat(partes[1])
                .concat("| Estado: EN REVISIÓN | ")
                .concat("Responsable: ")
                .concat(convertirCamelCase(responsable));

        System.out.println("\nTarea revisada....\n");
    }

    static void completarTarea(String[] tareas, int numTareas) {
        String[] partes;
        String responsable;
        int n;

        listarTareas(tareas, numTareas);
        do {
            System.out.print("Que tarea quieres completar? ");
            n = sc.nextInt();
            sc.nextLine();
        } while (n <= 0 || n > numTareas);
        n--;

        System.out.print("Responsable? ");
        responsable = sc.nextLine();
        partes = tareas[n].split("\\|");
        tareas[n] = partes[0].concat("|")
                .concat(partes[1])
                .concat("| Estado: COMPLETADA | ")
                .concat("Responsable: ")
                .concat(convertirCamelCase(responsable));

        System.out.println("\nTarea revisada....\n");
    }

    static void cambiarEstadoTarea(String[] tareas, int numTareas, String nuevoEstado) {
        String[] partes;
        String responsable;
        int n;

        listarTareas(tareas, numTareas);
        do {
            if (nuevoEstado.equals("EN REVISIÓN")) {
                System.out.print("Que tarea quieres revisar? ");
            } else {
                System.out.print("Que tarea quieres completar? ");
            }
            n = sc.nextInt();
            sc.nextLine();
        } while (n <= 0 || n > numTareas);
        n--;

        System.out.print("Responsable? ");
        responsable = sc.nextLine();
        partes = tareas[n].split("\\|");
        tareas[n] = partes[0].concat("|")
                .concat(partes[1]);

        if (nuevoEstado.equals("EN REVISIÓN")) {
            tareas[n] = tareas[n].concat("| Estado: EN REVISIÓN | ");
        } else {
            tareas[n] = tareas[n].concat("| Estado: COMPLETADA | ");
        }
        tareas[n] = tareas[n].concat("Responsable: ").concat(convertirCamelCase(responsable));

        System.out.println("\nTarea modificada1....\n");
    }

    static void filtrarDescripcion(String[] tareas, int numTareas) {
        String texto;
        boolean encontrada = false;

        System.out.println("\nBuscar Tarea por Descripción");
        System.out.println("-".repeat(45));

        System.out.print("\tTexto a buscar: ");
        texto = sc.nextLine().trim().toLowerCase();

        for (int i = 0; i < numTareas; i++) {
            String descripcion = tareas[i].split("\\|")[0].toLowerCase();

            if (descripcion.contains(texto)) {
                System.out.println((i + 1) + ". " + tareas[i]);
                encontrada = true;
            }
        }
    }

    static void filtrarUsuario(String[] tareas, int numTareas) {
        System.out.println("Nombre de usuario");
        String nombre = sc.nextLine();
        nombre = convertirCamelCase(nombre);
        for (int i = 0; i < numTareas; i++) {
            if (tareas[i].contains("Solicitado por: " + nombre)) {
                System.out.println(i + 1 + ". " + tareas[i]);
            }
        }
    }

    static void resumen(String[] tareas, int numTareas) {
        int pendientes = 0, revision = 0, completados = 0;

        System.out.println("Resumen Tareas...");

        for (int i = 0; i < numTareas; i++) {
            if (tareas[i].contains("Estado: PENDIENTE")) {
                pendientes++;
            } else if (tareas[i].contains("Estado: EN REVISION")) {
                revision++;
            } else {
                completados++;
            }
        }

        System.out.println("Resumen Tareas...");
        System.out.println("\tTotal tareas: " + numTareas);
        System.out.println("\tPendientes" + pendientes);
        System.out.println("\tEn revivión" + revision);
        System.out.println("\tCompletados" + completados);
    }
}
