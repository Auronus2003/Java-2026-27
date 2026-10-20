package unidad1.Arrays;

import java.util.Scanner;

public class Array12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String[] meses = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};
        int[] temperatura = new int[12];

        for (int i = 0; i < temperatura.length; i++) {
            System.out.print("Introduce la temperatura del mes " + meses[i] + ": ");
            temperatura[i] = sc.nextInt();
        }
        System.out.println();

        for (int m = 0; m < meses.length; m++) {
            System.out.print(meses[m] + ": ");
            for (int i = 0; i < temperatura[m]; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
