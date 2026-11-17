package unidad1.Métodos;

import java.util.Random;
import java.util.Scanner;

public class BuscaTesoro {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static final int FILAS = 5, COLS = 5;
    static final char TESORO = '$';
    static final char TESORO_ENCONTRADO = '€';
    static final char MINA = '!';
    static final char MINA_ENCONTRADA = '*';
    static final char DISPARO = 'X';
    static final char BLANCO = ' ';

    static void main() {
        char jugar;
        do {
            iniciarPartida();
            System.out.println("Jugar otra vez? (S/N)");
            jugar = sc.nextLine().toUpperCase().charAt(0);
        } while (jugar == 'S');
    }

    static void iniciarPartida() {
        char[][] tablero = new char[FILAS][COLS];
        boolean partidaFinalizada;

        iniciarTablero(tablero, 3);
        mostrarTablero(tablero);

        do {
            partidaFinalizada = realizarJugada(tablero);
            mostrarTablero(tablero);
        } while (!partidaFinalizada);
    }

    static void iniciarTablero(char[][] tablero, int numMinas) {
        int f, c;

        // Rellenar con espacios
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLS; j++) {
                tablero[i][j] = BLANCO;
            }
        }

        // Colocar Tesoro
        f = random.nextInt(0, FILAS);
        c = random.nextInt(0, COLS);
        tablero[f][c] = TESORO;

        // Colocar Minas
        while (numMinas > 0) {
            f = random.nextInt(0, FILAS);
            c = random.nextInt(0, COLS);
            if (tablero[f][c] == BLANCO) {
                tablero[f][c] = MINA;
                numMinas--;
            }
        }
    }

    static void mostrarTablero(char[][] tablero) {
        int n = tablero.length;
        if (n == 0) return;
        int m = tablero[0].length;

        // 1. Calculamos los dígitos necesarios para filas y columnas
        int anchoFila = String.valueOf(n - 1).length();
        int anchoCol = Math.max(3, String.valueOf(m - 1).length());
        String margenIzq = " ".repeat(anchoFila);
        String barraHoriz = "─".repeat(anchoCol);
        int padIzq = (anchoCol - 1) / 2;
        int padDer = anchoCol - 1 - padIzq;

        // 2. Encabezado de columnas
        System.out.print(margenIzq + " ");
        for (int col = 0; col < m; col++) {
            System.out.printf("%-" + (anchoCol + 1) + "d", col);
        }
        System.out.println();

        // 3. Borde superior (┌───┬───┐)
        System.out.print(margenIzq + "┌");
        for (int col = 0; col < m; col++) {
            System.out.print(barraHoriz + (col < m - 1 ? "┬" : "┐"));
        }
        System.out.println();

        // 4. Filas y separadores intermedios
        for (int fila = 0; fila < n; fila++) {
            System.out.printf("%" + anchoFila + "d│", fila);

            for (int col = 0; col < m; col++) {
                System.out.print(" ".repeat(padIzq));
                if (tablero[fila][col] == MINA || tablero[fila][col] == TESORO) {
                    System.out.print(BLANCO);
                } else {
                    System.out.print(tablero[fila][col]);
                }
                System.out.print(" ".repeat(padDer) + "│");
            }
            System.out.println();

            if (fila < n - 1) {
                System.out.print(margenIzq + "├");
                for (int col = 0; col < m; col++) {
                    System.out.print(barraHoriz + (col < m - 1 ? "┼" : "┤"));
                }
                System.out.println();
            }
        }

        // 5. Borde inferior (└───┴───┘)
        System.out.print(margenIzq + "└");
        for (int col = 0; col < m; col++) {
            System.out.print(barraHoriz + (col < m - 1 ? "┴" : "┘"));
        }

        System.out.println();
        System.out.println("\nPulsa Intro para continuar....");
        sc.nextLine();
    }

    static boolean realizarJugada(char[][] tablero) {
        int f, c;

        do {
            System.out.println("Dónde quieres excavar");
            System.out.print("\tFila: ");
            f = sc.nextInt();
            sc.nextLine();
            System.out.print("\tColumna: ");
            c = sc.nextInt();
            sc.nextLine();
        } while (f < 0 || c < 0 || f >= FILAS || c >= COLS);

        System.out.println();

        return comprobarVictoria(tablero, f, c);

    }

    /*
        Retorna true si hay victoria o derrota
        Retorna false si la partida continua
     */

    static boolean comprobarVictoria(char[][] tablero, int f, int c) {
        if (tablero[f][c] == TESORO) {
            // Victoria
            System.out.println("Enhorabuena !!! Has ganado !!!\n");
            tablero[f][c] = TESORO_ENCONTRADO;
            return true;
        } else if (tablero[f][c] == MINA) {
            // Derrota
            System.out.println("Derrota !!! Has Perdido !!!\n");
            tablero[f][c] = MINA_ENCONTRADA;
            return true;
        } else {
            // Disparo
            tablero[f][c] = DISPARO;
            return false;
        }
    }
}