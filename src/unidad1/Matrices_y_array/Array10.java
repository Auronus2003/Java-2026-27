package unidad1.Matrices_y_array;

import java.util.Random;
import java.util.Scanner;

public class Array10 {
    static void main() {
        final int NUM_MESAS = 10;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int personas;

        //Array de mesas
        //      1º fila: números de mesa
        //      2º fila: personas por mesa
        int[][] mesas = new int[2][NUM_MESAS];

        //Inicializar array. Nº mesa de 1 a 10. Nº personas aleatorias [1-4]
        for (int i = 0; i < NUM_MESAS; i++) {
            mesas[0][i] = i + 1;
            mesas[1][i] = random.nextInt(1, 5);
        }

        //Mostrar mesas
        System.out.printf("%-12s", "Mesa número");
        for (int i = 0; i < NUM_MESAS; i++) {
            System.out.printf(" | %d", mesas[0][i]);
        }
        System.out.printf(" |%n%-12s", "Ocupación");
        for (int i = 0; i < NUM_MESAS; i++) {
            System.out.printf(" | %d", mesas[1][i]);
        }
        System.out.printf("  |%n");

        do {
            System.out.print("\n¿Cuántos son? (Introduzca -1 para salir del programa): ");
            personas = sc.nextInt();
            if (personas > 4) {
                System.out.println("\nLo siento, no admitimos grupos de " + personas + ", haga grupos de 4 personas como máximo e intente de nuevo");
            } else if (personas >= 1) {
                // Buscar sitio
                for (int i = 0; i < ; i++) {

                }
            }
        } while (personas!=-1);

        System.out.println("\nGracias. Hasta pronto");
    }
}
