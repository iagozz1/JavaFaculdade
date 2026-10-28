package AtividadeStreams.Questao12Streams;

import java.util.ArrayList;
import java.util.List;

public class Autonomo {
    private final String nome;
    private final String cpf;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    private final List<Servico> servicos = new ArrayList<>();

    public Autonomo(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public List<Servico> getServicos() { return servicos; }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }




}
