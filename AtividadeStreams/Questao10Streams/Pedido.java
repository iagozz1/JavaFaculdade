package AtividadeStreams.Questao10Streams;

public class Pedido {
    String id;
    long valor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public Pedido(String id, long valor) {
        this.id = id;
        this.valor = valor;
    }
}
