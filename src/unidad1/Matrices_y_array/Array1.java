package unidad1.Matrices_y_array;

import java.util.Random;

public class Array1 {
    static void main() {
        int[][] matriz = new int[3][6];
        matriz[0][0] = 0;
        matriz[0][1] = 30;
        matriz[0][2] = 2;
        matriz[0][5] = 5;
        matriz[1][0] = 75;
        matriz[1][4] = 0;
        matriz[2][2] = -2;
        matriz[2][3] = 9;
        matriz[2][5] = 11;

        for (int i = 0; i < matriz[0].length; i++) {
            System.out.println("Columna " + i);
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println(matriz[i][j]);

            }
        }
    }
}
