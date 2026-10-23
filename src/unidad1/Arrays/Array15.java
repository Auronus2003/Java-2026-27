package unidad1.Arrays;

import java.util.Random;

public class Array15 {
    static void main() {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 101);
        }
    }
}
