package unidad1.Matrices_y_array;

public class Array3 {
    static void main() {
        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println();
        for (int k = 0; k < matriz.length; k++) {
            System.out.println();
            for (int l = 0; l < matriz.length; l++) {
                System.out.print(matriz[k][l] + "\t");
            }
        }
    }
}