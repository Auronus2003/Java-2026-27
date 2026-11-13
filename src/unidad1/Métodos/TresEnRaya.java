package unidad1.Métodos;

import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {
    static Scanner sc = new Scanner(System.in);
    static final int TURNO_PERSONA = 1;
    static final int TURNO_PC = 2;

    static void main() {
        char[][] tablero = new char[3][3];
        char fichaJugador, fichaOrdenador;
        int turno;


        System.out.println("Bienvenidos al tres en raya...\n");

        fichaJugador = elegirFichaJugador();
        fichaOrdenador = asignarFichaOrdenador(fichaJugador);
        turno = sortearTurno();
        iniciarTablero(tablero);
        mostrarTablero(tablero);

        jugadaPersona(tablero);

    }

    static char elegirFichaJugador() {
        char ficha;

        do {
            System.out.println("Que ficha deseas (X - O)? ");
            ficha = sc.nextLine().toUpperCase().charAt(0);
        } while (ficha != 'X' && ficha != 'O');
        return ficha;
    }

    static char asignarFichaOrdenador(char fichaJugador) {
        char fichaOrdenador = (fichaJugador == 'X') ? 'O' : 'X';
        return fichaOrdenador;
    }

    static int sortearTurno() {
        Random random = new Random();
        int eleccion, moneda;

        System.out.println("\nSorteo de turnos...");
        do {
            System.out.println("Elige cara (1) o cruz (2): ");
            eleccion = sc.nextInt();
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

        System.out.println("\nTres En Raya");
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
    }

    static void iniciarTablero(char[][] tablero) {
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero.length; columna++) {
                tablero[fila][columna] = ' ';
            }
        }
    }

    static void jugadaPersona(char[][] tablero) {
        int fila, columna;

        do {
            System.out.println("Fila? ");
            fila = sc.nextInt();
            System.out.println("Columna? ");
            columna = sc.nextInt();
        }while ((fila < 0 || fila > 2) || (columna < 0 || columna > 2));
    }

}
