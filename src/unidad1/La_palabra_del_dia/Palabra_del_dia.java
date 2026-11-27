package unidad1.La_palabra_del_dia;

import java.util.Random;
import java.util.Scanner;

public class Palabra_del_dia {
    static final Scanner sc = new Scanner(System.in);
    static final String NEGRO = "\u001b[30m";
    static final String VERMELLO = "\u001b[31m";
    static final String VERDE = "\u001b[32m";
    static final String AMARELO = "\u001b[33m";
    static final String AZUL = "\u001b[34m";
    static final String MAGENTA = "\u001b[35m";
    static final String CYAN = "\u001b[36m";
    static final String BRANCO = "\u001b[37m";
    static final String RESET = "\u001B[0m";
    static final String[] diccionario = {
            "amigo", "amora", "anaco", "andar", "areal",
            "barco", "beber", "besta", "bicos", "bolsa",
            "bruxa", "burro", "cabra", "cacho", "campo",
            "canto", "carne", "carro", "casta", "cebol",
            "cerdo", "chave", "choro", "cinco", "clase",
            "cocho", "comer", "costa", "cousa", "cravo",
            "curar", "dente", "deitar", "doado", "dorme",
            "dousa", "droga", "dunha", "eira", "enano",
            "facer", "falar", "fame", "farol", "ferro",
            "festa", "fillo", "fondo", "forno", "fraga",
            "frota", "fumea", "gaita", "gando", "garfo",
            "gasto", "gordo", "herba", "home", "horta",
            "igrexa", "lagoa", "lamba", "lance", "leite",
            "levar", "libro", "longo", "lume", "maior",
            "malta", "marea", "medir",
            "mesmo", "moeda", "moito", "monte", "morte",
            "mover", "muller", "nacer", "nadal", "nesta",
            "noite", "norte", "nunca", "oliva", "orella",
            "palla", "palma", "panza", "parar", "parte",
            "pedra", "peixe", "perna", "perro", "pesca",
            "piano", "picar", "plato", "pobre", "poder",
            "ponte", "porta", "praia", "prato", "preto",
            "pulga", "queixo", "quero", "rabia", "radio",
            "raiar", "ramal", "rapaz", "rasca", "regue",
            "reino", "rente", "resto", "rocha", "román",
            "sabio", "sabor", "sacar", "salto", "santo",
            "secar", "selva", "senso", "serra", "sonar",
            "sorte", "suave", "tarde", "teito", "temer",
            "terra", "tirar", "tolea", "tomar", "torre",
            "traxe", "trigo", "troco", "valer", "vapor",
            "verde", "verme", "viaxe", "vixía", "volta",
            "xente", "xogar", "xordo", "zorra"
    };

    static void main() {
        String[] taboleiro = new String[5];
        String palabraSecreta;
        int intentos = 0;

        palabraSecreta = escollerPalabra(diccionario);
    }

    private static String escollerPalabra(String[] diccionario) {
        Random random = new Random();
        int pos = random.nextInt(0, diccionario.length);
        return diccionario[pos].toLowerCase();
    }
}
