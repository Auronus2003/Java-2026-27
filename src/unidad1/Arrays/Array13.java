package unidad1.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int v = 0;
        int i;
        int n;
        System.out.println("Introduce el valor del array 1:");
        n = sc.nextInt();
        System.out.println("Introduce el valor inicial:");
        v = sc.nextInt();
        System.out.println("Introduce el valor de incremento:");
        i = sc.nextInt();
        int[] array1 = new int[n];
        for (int j = v; j < array1.length; j++) {
            array1[j] = v;
            v += i;
        }
        System.out.println(Arrays.toString(array1));
    }
}