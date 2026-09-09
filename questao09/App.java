package questao09;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        String menu = """
                1 - Continuar
                0 - Sair
                """;

        while (true) {
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            
            int escolha = scanner.nextInt();
            
            
            if(escolha == 0){
                break;
            }

            try{
                System.out.print("Digite o nome do produto: ");
                String nome = scanner.next();

                System.out.print("Digite a quantidade: ");
                int quantidade = scanner.nextInt();

                System.out.print("Preço do produto: ");
                double preco = scanner.nextDouble();

                scanner.nextLine();


                carrinho.adicionarItem(nome, quantidade, preco);

            }catch(PrecoInvalidoException e){
                System.out.println(e.getMessage());
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
