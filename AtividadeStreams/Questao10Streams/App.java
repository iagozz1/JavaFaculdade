package AtividadeStreams.Questao10Streams;

import java.util.List;

public class App {
    static void main(String[] args) {
        List<Pedido> pedidos = List.of(
                new Pedido("202022", 200),
                new Pedido("9090909", 100)
        );

        double total = pedidos.stream()
                .mapToDouble(Pedido::getValor)
                .sum();
        System.out.println("Valor total dos pedidos: " + total);
    }
}
