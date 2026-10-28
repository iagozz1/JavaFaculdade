package AtividadeStreams.Questao05Streams;

import java.util.List;

public class App {
    static void main(String[] args) {
        List<String> nomes = List.of("Pedro", "Ana", "José", "Maria", "Antonia", "Augusto", "Carlos", "Francisco");

        List<String> resultado = nomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .sorted()
                .toList();
        System.out.println(resultado);
    }
}
