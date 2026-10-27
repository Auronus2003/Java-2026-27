package unidad1.Matrices_y_array;

public class Array2 {
    static void main() {
        int[][] matriz = new int[5][5];
        int contador = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }
        for (int j = 0; j < matriz.length; j++) {
            for (int k = 0; k < matriz.length; k++) {
                System.out.print(matriz[j][k] + "\t");
            }
            System.out.println();
        }
    }
}
