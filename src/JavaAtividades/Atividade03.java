package JavaAtividades;

import java.util.Scanner;

public class Atividade03 {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int num = leitor.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " é um número par");
        }else{
            System.out.println(num + " é um número ímpar");
        }
    }
}
