package questao02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu = """
                1 - Continuar
                0 - Sair
                """;

        while(true){
            System.out.println(menu);

            System.out.print("Escolha uma opção: ");

            int escolha = sc.nextInt();


            if(escolha == 0){
                break;
            }

            try{
                String[] nomes = new String[]{"José", "Lucas","Vinicius","Iago","Otavio","João"};

                System.out.print("Digite uma posição: ");

                int numero = sc.nextInt();

                System.out.println("Posição: " + numero + '\n' + " Nome: " + nomes[numero] );


            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Posição inválida. Erro: " + e.getMessage());
            }
    }

}
}
