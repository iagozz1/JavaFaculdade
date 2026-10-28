package AtividadeStreams.Questao12Streams;

public class Servico {
    private  TipoServico tipo;
    private double valor;

    public TipoServico getTipo() {
        return tipo;
    }

    public void setTipo(TipoServico tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Servico(TipoServico tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
}
