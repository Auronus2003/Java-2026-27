package unidad1.Métodos;

import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static final int TURNO_PERSONA = 1;
    static final int TURNO_PC = 2;

    static void main() {
        char[][] tablero = new char[3][3];
        char fichaJugador, fichaOrdenador;
        int turno, jugadas = 0;
        boolean partidaFinalizada;

        System.out.println("Bienvenidos al tres en raya...\n");
        fichaJugador = elegirFichaJugador();
        fichaOrdenador = asignarFichaOrdenador(fichaJugador);
        turno = sortearTurno();
        iniciarTablero(tablero);
        mostrarTablero(tablero);

        do {
            if (turno == TURNO_PERSONA) {
                jugadaPersona(tablero, fichaJugador);
            } else {
                jugada_Ordenador(tablero, fichaOrdenador);
            }
            mostrarTablero(tablero);
            jugadas++;
            partidaFinalizada = comprobarVictoria(tablero, jugadas, turno);
            turno = (turno == TURNO_PERSONA) ? TURNO_PC : TURNO_PERSONA;
        } while (!partidaFinalizada);
    }

    static char elegirFichaJugador() {
        char ficha;

        do {
            System.out.print("Que ficha deseas (X - O)? ");
            ficha = sc.nextLine().toUpperCase().charAt(0);
        } while (ficha != 'X' && ficha != 'O');

        return ficha;
    }

    static char asignarFichaOrdenador(char fichaJugador) {

        char fichaOrdenador = (fichaJugador == 'X') ? 'O' : 'X';
        return fichaOrdenador;
    }

    static int sortearTurno() {
        int eleccion, moneda;

        System.out.println("\nSorteo de turnos...");
        do {
            System.out.print("Elige cara (1) o cruz (2): ");
            eleccion = sc.nextInt();
            sc.nextLine();
        } while (eleccion != 1 && eleccion != 2);

        moneda = random.nextInt(1, 3);

        if (eleccion == moneda) {
            System.out.println("Has acertado! Juegas primero...");
            return TURNO_PERSONA;
        } else {
            System.out.println("Nos has acertado! Juegas segundo...");
            return TURNO_PC;
        }
    }

    static void mostrarTablero(char[][] tablero) {

        System.out.println("   0   1   2");
        System.out.println(" ┌───┬───┬───┐");

        for (int fila = 0; fila < tablero.length; fila++) {
            System.out.print(fila + "│");
            for (int columna = 0; columna < tablero.length; columna++) {
                System.out.print(" " + tablero[fila][columna] + " │");
            }
            System.out.println();
            if (fila < tablero.length - 1) {
                System.out.println(" ├───┼───┼───┤");
            }
        }
        System.out.println(" └───┴───┴───┘");
        System.out.println("\nPulsa Intro para continuar...\n");
        sc.nextLine();
    }

    static void iniciarTablero(char[][] tablero) {
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero.length; columna++) {
                tablero[fila][columna] = ' ';
            }
        }
    }

    static void jugadaPersona(char[][] tablero, char ficha) {
        int fila, columna;

        System.out.println("Tu turno...");

        do {
            System.out.print("Fila? ");
            fila = sc.nextInt();
            sc.nextLine();
            System.out.print("Columna? ");
            columna = sc.nextInt();
            sc.nextLine();
        } while (fila < 0 || fila > 2 || columna < 0 || columna > 2 || tablero[fila][columna] != ' ');

        tablero[fila][columna] = ficha;
    }

    static void jugada_Ordenador(char[][] tablero, char ficha) {
        int fila, columna;

        System.out.println("Tu turno...");

        do {
            fila = random.nextInt(1, 3);
            columna = random.nextInt(1, 3);
        } while (tablero[fila][columna] != ' ');

        tablero[fila][columna] = ficha;
    }

    static boolean comprobarVictoria(char[][] tablero, int jugadas, int turno) {
        if ((tablero[0][0] != ' ' && tablero[0][0] == tablero[0][1] && tablero[0][0] == tablero[0][2])
                || (tablero[1][0] != ' ' && tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2])
                || (tablero[2][0] != ' ' && tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2])
                || (tablero[0][0] != ' ' && tablero[0][0] == tablero[1][0] && tablero[0][0] == tablero[2][0])
                || (tablero[0][1] != ' ' && tablero[0][1] == tablero[1][1] && tablero[0][1] == tablero[2][1])
                || (tablero[0][2] != ' ' && tablero[0][2] == tablero[1][2] && tablero[0][2] == tablero[2][2])
                || (tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2])
                || (tablero[0][2] != ' ' && tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0])) {

            if (turno == TURNO_PERSONA) {
                System.out.println("Enhorabuena !!! has ganado!!!");
            } else {
                System.out.println("Lo siento !!! has perdido!!!");
            }
            return true;
        } else if (jugadas == 9) {
            System.out.println("partida finalizada !!! Empate !!!");
            return true;
        }
        return false;

    }
}
