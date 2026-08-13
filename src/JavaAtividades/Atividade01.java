package JavaAtividades;
import java.util.Scanner;

public class Atividade01 {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num = leitor.nextInt();
        System.out.println("""
                
                -- OPERAÇÕES --
                1 - Somar (+)
                2 - Subtrair (-)
                3 - Dividir (/)
                4 - Multiplicar (*)
                
                """);
        System.out.print("Escolha uma opção: ");
        int escolha = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = leitor.nextInt();

        switch (escolha) {
            case 1:
                int soma = num + num2;
                System.out.println("A soma de " + num + " + " + num2 + " é igual a: " + soma);
                break;
            case 2:
                int sub = num - num2;
                System.out.println("A subtração de " + num + " - " + num2 + " é igual a: " + sub);
                break;
            case 3:
                double div = num / num2;
                System.out.println("A divisão de " + num + " / " + num2 + " é igual a: " + div);
                break;
            case 4:
                int multi = num * num2;
                System.out.println("A multiplicação de " + num + " x " + num2 + " é igual a: " + multi);
                break;
            default:
                System.out.println("Número ou opção inválida");
                break;
        }
    }
}
