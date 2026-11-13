package unidad1.Métodos;

import java.util.Scanner;

public class TresEnRaya {
    static Scanner sc = new Scanner(System.in);

    static void main() {
        char[][] tablero = new char[3][3];
        char fichaJugador, fichaOrdenador;

        System.out.println("Bienvenidos al tres en raya...\n");

        fichaJugador = elegirFichaJugador();
        fichaOrdenador = asignarFichaOrdenador(fichaJugador);

        mostrarTablero(tablero);
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

    static void mostrarTablero(char[][] tablero) {

        System.out.println("┌───┬───┬───┐");

        for (int fila = 0; fila < tablero.length; fila++) {
            System.out.print("│ ");
            for (int columna = 0; columna < tablero.length; columna++) {
                System.out.print(tablero[fila][columna] + " │ ");
            }
            System.out.println();
            if (fila < tablero.length - 1) {
                System.out.println("├───┼───┼───┤");
            }
        }
        System.out.println("└───┴───┴───┘");
    }
}
