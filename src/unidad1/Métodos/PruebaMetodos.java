package unidad1.Métodos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PruebaMetodos {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1
        System.out.println("Introduce una texto: ");
        String texto = sc.nextLine();
        mostrarTextoMayuscula(texto);
        System.out.println(texto);

        // Ejercicio 2
        System.out.println("Dame un numero: ");
        int numero = sc.nextInt();sc.nextLine();
        mostrarValorAbsoluto(numero);
        System.out.println(numero);

        // Ejercicio 3
        int[] arrayvacio =  new int[10];
        rellenarArray(arrayvacio);
        System.out.println(Arrays.toString(arrayvacio));
    }

    static void mostrarTextoMayuscula(String texto) {
        String textoMayuscula = texto.toUpperCase();
        System.out.println(textoMayuscula);
    }

    public static void mostrarValorAbsoluto(int numero){
        if (numero < 0){
            numero = numero * (-1);
        } else {
            System.out.println("numero:" + numero);
        }
    }

    public static void rellenarArray(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
        }
    }

    public static void mostrarMayor(int x, int y) {

    }
}
