package questao15Collections;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<Integer, String> dias = new HashMap<>();


        dias.put(1, "Segunda-Feira");
        dias.put(2, "Terça-Feira");
        dias.put(3, "Quarta");
        dias.put(4, "Quinta-Feira");
        dias.put(5, "Sexta-Feira");


        System.out.println("Antes: " + dias);

        dias.replace(3, "Quarta-Feira");

        System.out.println("Depois: " + dias);

        dias.replace(6, "Sábado");

        System.out.println("Sábado adicionado: " + dias.replace(6, "Sábado"));
    }
}
