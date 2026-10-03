package questao08;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        String menu = """
                1 - Continuar
                0 - Sair
                """;

        while (true) {
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            
            int escolha = sc.nextInt();
            
            
            if(escolha == 0){
                break;
            }

            try{
                conta.sacar();
                System.out.println("Saque realizado!");
                System.out.println("Saldo: " + conta.saldo);
            }catch(Exception e ){
                System.out.println("Saldo atual: " + conta.saldo);
                System.out.println("Erro: " + e.getMessage());
            }
            
        }
    }
}
