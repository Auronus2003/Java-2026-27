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
        int numero = sc.nextInt();
        sc.nextLine();
        mostrarValorAbsoluto(numero);
        System.out.println(numero);

        // Ejercicio 3
        int[] arrayvacio = new int[10];
        rellenarArray(arrayvacio);
        System.out.println(Arrays.toString(arrayvacio));

        // Ejercicio 5
        System.out.println("Introduce un numero: ");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce otro numero: ");
        int y = sc.nextInt();
        sc.nextLine();
        mostrarMayor(x, y);

        // Ejercicio 6
        mostrarDNI(12345678, 'M');

        // Ejercicio 7
        System.out.println(convertirPrimeraLetraMayusculas("HOLA"));

        // Ejercicio 8
        int mayor = calcularMayor(3, 10);
        System.out.println(mayor);

        // Ejercicio 9
        String dni = formarDNI(12345678, 'M');
        System.out.println(dni);

        // Ejercicio 10
        sonDiferentes(5,5,5);

        // Ejercicio 11

    }

    static void mostrarTextoMayuscula(String texto) {
        String textoMayuscula = texto.toUpperCase();
        System.out.println(textoMayuscula);
    }

    public static void mostrarValorAbsoluto(int numero) {
        if (numero < 0) {
            numero = numero * (-1);
        } else {
            System.out.println("numero:" + numero);
        }
    }

    public static void rellenarArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
        }
    }

    public static void mostrarMayor(int x, int y) {
        if (x > y) {
            System.out.println("El mayor es: " + x);
        } else {
            System.out.println("El mayor es: " + y);
        }
    }

    public static void mostrarDNI(int parteNumerica, char letra) {
        System.out.println(parteNumerica + " - " + Character.toUpperCase(letra));
    }

    public static String convertirPrimeraLetraMayusculas(String texto){
        return texto.substring(0, 1).toUpperCase().concat(texto.substring(1).toLowerCase());
    }

    public static int calcularMayor(int x, int y) {
        if (x > y) {
            return x;
        } else  {
            return y;
        }
    }

    public static String formarDNI(int parteNumerica, char letra) {
        String dni = parteNumerica + " - " + Character.toUpperCase(letra);
        return dni;
    }

    public static boolean sonDiferentes(int x, int y, int z){
        return  x != y && x != z && y != z;
    }

    public static int buscarMayor(int[] array){

    }
}
