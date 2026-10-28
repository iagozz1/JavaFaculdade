package AtividadeStreams.Questao08Streams;

import java.util.List;

public class App {
    static void main(String[] args) {
        List<Pessoa> pessoas = List.of(
                new Pessoa("Iago", 20),
                new Pessoa("Otávio", 19),
                new Pessoa("Ana", 15)
        );

        List<String> nomes = pessoas.stream()
                .filter(p -> p.getIdade() > 18)
                .map(Pessoa::getNome)
                .toList();

        System.out.println(nomes);
    }
}
