package questao07;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro c = new Cadastro();

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
                c.cadastrar();

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
