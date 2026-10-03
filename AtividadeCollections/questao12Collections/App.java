package questao12Collections;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> pessoa =  new HashMap<>();

        pessoa.put("João", 20);
        System.out.println("João tem " + pessoa.get("João") + " anos ");

        if(pessoa.containsKey("Ana")){
            System.out.println("Ana tem " + pessoa.get("Ana") + " anos ");
        }
        else{
            System.out.println("Ana não encontrada");
        }


    }
}
