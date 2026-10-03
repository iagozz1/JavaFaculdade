package questao06Collections;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    
    
    
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getCpf() {
        return cpf;
    }

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    
    @Override
    public String toString() {
        return '\n'+ "Nome: " + nome +  " Idade: " + idade + " CPF (" + cpf + ")";
    }
}
