package AtividadeStreams.Questao02Streams;

import java.util.List;

public class App {
    static void main(String[] args) {
    List<String> nomes = List.of("otávio", "iago");

    nomes.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);

    }


}
