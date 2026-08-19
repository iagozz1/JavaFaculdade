package JavaAtividades;

import java.util.Scanner;

public class Atividade02 {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = leitor.next();

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.println("Olá " + nome + ", sua idade é " + idade + " anos. ");
    }
}
