package unidad1.Matrices_y_array;

import java.util.Scanner;

/*
Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
introduzca en ella valores (también introducidos por teclado).
Luego deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores que cero,
cuántos son menores que cero y cuántos son igual a cero.
*/

public class Array4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N;
        int M;
        int neg = 0, pos = 0, zero = 0;
        System.out.println("Dime numeros de N:");
        N = sc.nextInt();
        System.out.println("Dime numeros de M:");
        M = sc.nextInt();
        int[][] matriz = new int[N][M];

        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matriz[i][j] > 0) {
                    pos++;
                } else if (matriz[i][j] == 0) {
                    zero++;
                } else {
                    neg++;
                }
            }
        }
        System.out.println("Positivo: " + pos);
        System.out.println("Negativo: " + neg);
        System.out.println("Zero: " + zero);
    }
}