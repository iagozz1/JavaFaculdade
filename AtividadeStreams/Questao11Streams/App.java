package AtividadeStreams.Questao11Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    static void main(String[] args) {
        List<String> nomes = List.of("Iago", "Otávio", "Tkin" , "Reinaldo");


         Map<Integer, List<String>> tamanho = nomes.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Tamanho: " + tamanho);

    }
}
