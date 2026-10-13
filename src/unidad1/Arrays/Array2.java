package unidad1.Arrays;

public class Array2 {
    static void main() {

        char[] simbolos = new char[10];
        simbolos[0] = 'a';
        simbolos[1] = 'x';
        simbolos[4] = '@';
        simbolos[6] = ' ';
        simbolos[7] = '+';
        simbolos[8] = 'Q';

        for (int i = 0;i < simbolos.length; i++) {
            System.out.print(" " + simbolos[i]);
        }
    }
}