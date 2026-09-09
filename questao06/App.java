package questao06;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                String variavel = null;
                System.out.println(variavel.length());
            }catch(NullPointerException e){
                System.out.println("A variável está vazia, digite algo.");
            }
        }
    }
}
