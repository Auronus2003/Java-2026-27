package unidad1.Strings;

public class Ej8 {
    static void main() {
        String cadena = "OLa quE tAl";
        String[] palabras= cadena.split("\\s+");
        String r = "";
        cadena.split(" ");

        for (String s : palabras) {
            r = r.concat(s.substring(0, 1).toUpperCase());
            r = r.concat(s.substring(1).toLowerCase());
            r = r.concat(" ");
        }
        System.out.println(r);
    }
}