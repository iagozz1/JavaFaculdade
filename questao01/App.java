package questao01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

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
                System.out.print("Digite o 1º número: ");

                num1 = sc.nextInt();

                System.out.print("Digite o 2º número: ");

                num2 = sc.nextInt();

                System.out.println("Resultado: " + num1 / num2);



            }catch(InputMismatchException e){
                System.out.println("Digite um número positivo.");
            }catch(ArithmeticException e){
                System.out.println("Não existe divisão por zero.");
            }
        }
    }
}
