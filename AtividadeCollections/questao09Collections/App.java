package questao09Collections;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);


        if(numeros.contains(15)){
            System.out.println("15 está no conjunto");
        }
        else{
            System.out.println("15 não está no conjunto");
        }


        if(numeros.contains(18)){
            System.out.println("18 está no conjunto");
        }
        else{
            System.out.println("18 não está no conjunto");
        }
    }
}
