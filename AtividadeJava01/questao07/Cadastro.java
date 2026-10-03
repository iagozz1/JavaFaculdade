package questao07;

import java.util.Scanner;

public class Cadastro {
    public void cadastrar(){
        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");

        idade = sc.nextInt();


        if(idade < 0){
            throw new IdadeInvalidaException("Idade inválida. Idade menor que 0");
        }

        if(idade > 120){
            throw new IdadeInvalidaException("Idade inválida. Idade maior que 120");
        }

        System.out.println("Cadastro concluído");
    }
}
