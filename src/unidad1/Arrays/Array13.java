package unidad1.Arrays;

import java.util.Scanner;

public class Array13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int v = 0;
        int i;
        int n;
        System.out.println("Introduce el valor del array 1:");
        n = sc.nextInt();
        System.out.println("Introduce el valor de v:");
        v = sc.nextInt();
        System.out.println("Introduce el valor de i:");
        i = sc.nextInt();
        int[] array1 = new int[n];
        for (int j = v; j < array1[n]; j += i) {
            array1[j] = i;
            System.out.println(array1[j] + " ");
        }
    }
}