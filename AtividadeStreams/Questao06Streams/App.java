package AtividadeStreams.Questao06Streams;

import java.util.List;

public class App {
    static void main(String[] args) {
        List<Integer> numeros = List.of(2,9,3,5);


        int maior = numeros.stream()
                .max(Integer::compare)
                .get();
        System.out.println("Número maior: " + maior);
    }
}
