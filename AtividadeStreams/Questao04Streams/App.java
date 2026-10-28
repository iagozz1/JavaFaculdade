package AtividadeStreams.Questao04Streams;

import java.util.List;

public class App {
    static void main(String[] args) {
        List<Integer> numeros = List.of(4, 25, 32, 78, 45, 13, 10, 77, 58, 61, 52);


        long total = numeros.stream()
                .filter(n -> n > 10)
                .count();
        System.out.println("Quantidade de números maiores que 10: " + total);
    }
}
