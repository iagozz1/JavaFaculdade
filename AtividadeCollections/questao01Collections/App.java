package questao01Collections;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();


        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);


        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }


        for (Integer i : numeros) {
            System.out.println(i);
        }
    }
}
