package unidad1.Xestor_de_Tarefas_de_Mantemento_Informático;

import java.util.Scanner;

public class XestorTarefa {
    static Scanner sc = new Scanner(System.in);
    static final int MAX_TAREA = 10;

    static void main() {
        String[] tareas = new String[MAX_TAREA];
        int numTareas = 0;

        int opcion = mostrarMenu();
        switch (opcion) {
            case 1:
                añadirTarea(tareas, numTareas);
                numTareas
                break;
            case 2:
                break;
            case 3:
                break;
        }

    }

    static int mostrarMenu() {
        int opcion;

        System.out.println("Xestor de Tarefas de Mantemento Informático");
        System.out.println("-".repeat(50));
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

    static void añadirTarea(String[] tareas) {
        String descricion, usuario, tarea;

        System.out.println("Añadir tarea");
        System.out.print("\tDescripcion: ");
        descricion = sc.nextLine();
        System.out.print("\tUsuario: ");
        usuario = sc.nextLine();

        descricion = descricion.substring(0, 1).toUpperCase()
                .concat(descricion.substring(1).toLowerCase());

        descricion = convertirPrimeraMayuscula(descricion);
        usuario = convertirCamelCase(usuario);

        String[] partes = usuario.split("\\s:+");
        String formateado = "";
        for (String p : partes) {
            formateado = p.substring(0, 1).toUpperCase()
                    .concat(p.substring(1).toLowerCase())
                    .concat(" ");
        }
        formateado = formateado.trim();

        tarea = descricion.concat(" | Solicitado por: ")
                .concat(usuario)
                .concat(" | Estado: PENDIENTE | Responsable: Ningún");
    }

    static String convertirCamelCase(String usuario) {
    }

    static String convertirPrimeraMayuscula(String descricion) {
    }
}
