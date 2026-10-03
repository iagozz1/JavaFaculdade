package AtividadeCollections.questao05Collections;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> numeros = new LinkedList<>();
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        numeros.addFirst(0);
        numeros.addLast(6);


        System.out.println(numeros);

        System.out.println("Primeiro: " + numeros.getFirst());
        System.out.println("Último: " + numeros.getLast());
    }
}
