package AtividadeStreams.Questao03Streams;

import java.util.List;

public class App {
    static void main(String[] args) {
        List<Integer> numeros = List.of(2,3,4,5,6,7,8);


        numeros.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}
