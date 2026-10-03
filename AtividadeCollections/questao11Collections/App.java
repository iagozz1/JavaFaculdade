package questao11Collections;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoas = new HashMap<>();
        
        pessoas.put("João", 30);
        pessoas.put("Maria", 25);
        pessoas.put("Pedro", 41);


        for (Map.Entry<String, Integer> entrada : pessoas.entrySet()) {
            String nome = entrada.getKey();
            int idade = entrada.getValue();

            System.out.println(nome + " tem " + idade + " anos ");
        }
    }
}
