package JavaAtividades;

import java.util.Scanner;

public class Atividade08 {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = leitor.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
