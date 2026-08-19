package JavaAtividades;

import java.util.Scanner;

public class Atividade04 {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = leitor.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = leitor.nextInt();


        if(num > num2 && num > num3){
            System.out.println("O maior número é: " + num);
        }else if(num2 > num && num2 > num3){
            System.out.println("O maior número é: " + num2);
        }else if(num3 > num && num3 > num2){
            System.out.println("O maior número é: " + num3);
        }else{
            System.out.println("Os números são iguais ou inválidos.");
        }
    }
}
