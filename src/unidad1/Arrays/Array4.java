package unidad1.Arrays;

import java.util.Scanner;

public class Array4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[20];
        int positivos = 0;
        int negativos = 0;
        System.out.print("Dame 20 numeros: ");

        for (int i = 0; i < numero.length; i++) {
            numero[i] = sc.nextInt();
            if (numero[i] > 0){
                positivos += numero[i];
            }else {
                negativos += numero[i];
            }
        }
        System.out.println("positivos: " + positivos);
        System.out.println("negativos:" + negativos);

    }
}
