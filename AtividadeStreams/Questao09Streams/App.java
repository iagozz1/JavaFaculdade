package AtividadeStreams.Questao09Streams;

import java.util.List;

public class App {
    static void main(String[] args) {
        List<Integer> numeros = List.of(2,-2,-6,10,20);
        List<Integer> numeros2 = List.of(1,2,3,4,5,6);


        boolean verificarPositivo = numeros.stream()
                .allMatch(n -> n >0);
        System.out.println("Os números da lista 1 são todos positivos?: " + verificarPositivo);

        boolean verificarPositivo2 = numeros2.stream()
                .allMatch(num -> num > 0 );
        System.out.println("Os números da lista 2 são todos positivos?: " + verificarPositivo2);
    }
}
