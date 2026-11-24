package unidad1.Notas;

public class GestionNotas {

    public static void main(String[] args) {

        String[] nombres = {
                "Ana", "Carlos", "Lucia", "Pedro",
                "Marta", "David", "Elena", "Pablo"
        };

        double[] notas = {
                7.5, 4.2, 8.8, 5.5, 3.7, 6.0, 9.2, 4.8
        };

        // 1. Mostrar todos los alumnos
        System.out.println("=== LISTADO DE ALUMNOS ===");
        mostrarAlumnos(nombres, notas);

        // 2. Mostrar los alumnos aprobados
        System.out.println("\n=== ALUMNOS APROBADOS ===");
        mostrarAprobados(nombres, notas);

        // 3. Mostrar los alumnos suspensos
        System.out.println("\n=== ALUMNOS SUSPENSOS ===");
        mostrarSuspensos(nombres, notas);

        // Mejora 1-3
        System.out.println("\n=== LISTADO DE ALUMNOS ===");
        mostrarAlumnos(nombres, notas, 0, 10);

        System.out.println("\n=== ALUMNOS APROBADOS ===");
        mostrarAlumnos(nombres, notas, 5, 10);

        System.out.println("\n=== ALUMNOS SUSPENSOS ===");
        mostrarAlumnos(nombres, notas, 0, 4.99);

        // 4. Calcular la nota media
        System.out.println("\n=== NOTA MEDIA ===");
        System.out.println(calcularMedia(notas));

        // 5. Obtener la nota máxima
        System.out.println("\n=== NOTA MÁXIMA ===");
        System.out.println(obtenerMaxima(notas));

        // 6. Contar los alumnos aprobados
        System.out.println("\n=== NÚMERO DE APROBADOS ===");
        System.out.println(contarAprobados(notas));

        // 7. Comprobar si todos han aprobado
        System.out.println("\n=== TODOS HAN APROBADO ===");
        System.out.println(todosAprobados(notas));

        // 8. Buscar un alumno
        System.out.println("\n=== BUSCAR ALUMNO ===");
        int posicion = buscarAlumno(nombres, "Carlos");
        if (posicion != -1) {
            System.out.println("Carlos está en la posición " + posicion);
        } else {
            System.out.println("Alumno no encontrado");
        }

        // 9. Consultar la nota de un alumno
        System.out.println("\n=== CONSULTAR NOTA ===");
        /* double nota = consultarNota(nombres, notas, "Lucia");

        if (nota != -1) {
            System.out.println("Nota de Lucia: " + nota);
        } else {
            System.out.println("Alumno no encontrado");
        } */

        // 10. Modificar la nota de un alumno
        System.out.println("\n=== MODIFICAR NOTA ===");
        /* boolean modificada = modificarNota(
                nombres, notas, "Carlos", 6.5);

        if (modificada) {
            System.out.println("Nota modificada correctamente");
        } else {
            System.out.println("No se ha podido modificar la nota");
        } */

        // 11. Incrementar todas las notas
        System.out.println("\n=== LISTADO DESPUÉS DEL INCREMENTO ===");
        // incrementarNotas(notas, 0.5);
        // mostrarAlumnos(nombres, notas);

        // 12. Calcular el porcentaje de aprobados
        System.out.println("\n=== PORCENTAJE DE APROBADOS ===");
        // System.out.println(porcentajeAprobados(notas) + "%");

        // 13. Contar las notas superiores a 7
        System.out.println("\n=== NOTAS SUPERIORES A 7 ===");
        // System.out.println(contarSuperiores(notas, 7));

        // 14. Obtener la nota de una posición
        System.out.println("\n=== CONSULTAR NOTA POR POSICIÓN ===");
        // System.out.println(obtenerNota(notas, 3));

    }

    // IMPLEMENTA AQUÍ LOS MÉTODOS NECESARIOS

    static void mostrarAlumnos(String[] nombres, double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println((i + 1) + ". " + nombres[i]);
        }
    }

    static void mostrarAprobados(String[] nombres, double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(nombres[i] + " " + notas[i]);
            }
        }
    }

    static void mostrarSuspensos(String[] nombres, double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                System.out.println(nombres[i] + " " + notas[i]);
            }
        }
    }

    static void mostrarAlumnos(String[] nombres, double[] notas, double min, double max) {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < min && notas[i] > max) {
                System.out.println("\t" + nombres[i] + " " + notas[i]);
            }
        }
    }

    private static double calcularMedia(double[] notas) {
        double suma = 0;

        for (double n : notas) {
            suma += n;
        }

        return suma / notas.length;
    }

    static double obtenerMaxima(double[] notas) {
        double maxima = 0;
        for (double n : notas) {
            if (n > maxima) {
                maxima = n;
            }
        }
        return maxima;
    }

    static int contarAprobados(double[] notas) {
        int aprobados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            }
        }
        return aprobados;
    }

    static boolean todosAprobados(double[] notas) {
        int i = 0;
        while (i < notas.length && notas[i] >= 5) {
            i++;
        }
        return i >= notas.length;
    }

    static int buscarAlumno(String[] nombres, String carlos) {
        return 0;
    }
}
