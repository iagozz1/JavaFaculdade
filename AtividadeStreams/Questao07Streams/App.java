package AtividadeStreams.Questao07Streams;

import java.util.List;

public class App {
    static void main(String[] args) {
            List<String> palavras = List.of("Caju", "Maçã", "Abacate", "Melancia");

           long quantidade =  palavras.stream()
                   .filter(p -> p.length() > 5)
                   .count();
        System.out.println("Palavras com mais de 5 letras: " + quantidade);



    }
}
