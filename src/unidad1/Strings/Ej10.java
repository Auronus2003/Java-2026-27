package unidad1.Strings;

public class Ej10 {
    static void main() {
        String cadena = "Mi niña quiere un pequeñin 3";
        int letras = 0, numeros = 0;
        char caracter;

        for (int i=0; i<cadena.length(); i++) {
            caracter = cadena.charAt(i);
            if (Character.isLetter(caracter)){
                letras++;
            }else if (Character.isDigit(caracter)){
                numeros++;
            }
        }
        System.out.println("Letras: " + letras);
        System.out.println("Numero: " + numeros);
    }
}
