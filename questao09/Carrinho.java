package questao09;

public class Carrinho {
    public void adicionarItem(String nome, int quantidade, double preco){

        if(nome.trim().isEmpty() || nome == null){
            throw new IllegalArgumentException("O nome do item não pode estar vazio");
        }

        if(quantidade <= 0){
            throw new IllegalArgumentException("Quantidade inválida");
        }

        if(preco <= 0 ){
            throw new PrecoInvalidoException("Preço inválido");
        }

        System.out.println("Compra realizada.");

    }
}
