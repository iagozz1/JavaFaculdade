package questao13Collections;

import java.util.TreeMap;


public class App {
    public static void main(String[] args) {
        TreeMap <String, Integer> pessoas = new TreeMap<>();
    
        pessoas.put("Rafael", 33);
        pessoas.put("Beatriz", 27);
        pessoas.put("Lucas", 19);
        pessoas.put("Amanda", 45);
        pessoas.put("Gustavo", 22);



        System.out.println(pessoas);


        System.out.println("Primeiro: " + pessoas.firstKey());
        System.out.println("Último: " + pessoas.lastKey());



    }
}
