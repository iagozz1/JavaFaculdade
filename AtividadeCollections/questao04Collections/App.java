package AtividadeCollections.questao04Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(42);
        numeros.add(7);
        numeros.add(19);
        numeros.add(3);
        numeros.add(25);

        Collections.sort(numeros);
        System.out.println("Crescente: " + numeros);

        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Descrescente: " + numeros);
    }
}
