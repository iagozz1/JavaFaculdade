package questao07Collections;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();


        numeros.add(10);
        numeros.add(20);
        numeros.add(10);
        numeros.add(30);
        numeros.add(40);


        System.out.println("Conjunto: " + numeros);
        System.out.println("Tamanho: " + numeros.size());
        System.out.println("Add(10) retornou: " + numeros.add(10) );
    }
}
