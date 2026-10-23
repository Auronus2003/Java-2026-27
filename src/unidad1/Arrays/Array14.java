package unidad1.Arrays;

public class Array14 {
    static void main() {
        int[] enteros = new int[11];
        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < i; j++) {
                enteros[i] = i;
                System.out.println(enteros[i]);
            }
        }
    }
}