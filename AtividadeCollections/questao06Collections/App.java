package questao06Collections;

import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Pessoa>  apoio = new ArrayList<>();

        apoio.add(new Pessoa("Ana", 19, "202-443-687.09"));
        apoio.add(new Pessoa("Iago", 21, "282-443-687.09"));
        apoio.add(new Pessoa("Otavio", 50, "222-222-222.02"));
        apoio.add(new Pessoa("Nikoly", 30, "222-222-222-.02"));
        

        apoio.sort(Comparator.comparingInt(Pessoa::getIdade));


        System.out.println("Por idade: " + apoio);

        System.out.println();
        apoio.sort(Comparator.comparing(Pessoa:: getNome));

        System.out.println("Por nome: " + apoio);
    }
}
