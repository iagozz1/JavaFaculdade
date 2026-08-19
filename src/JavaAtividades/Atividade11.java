package JavaAtividades;

import java.util.Scanner;

public class Atividade11 {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            boolean numero = false;
            boolean letraMaiuscula = false;
            System.out.print("Digite uma senha forte: ");
            String senha = leitor.next();
            if (senha.length() < 8) {
                System.out.println("Sua senha precisa de no mínimo 8 caracteres");
                continue;
            }

            for (int i = 0; i < senha.length() ; i++) {

                char atual = senha.charAt(i);

                if(Character.isDigit(atual)){
                    numero = true;
                }
                if(Character.isUpperCase(atual)){
                    letraMaiuscula = true;
                }
            }

            if(numero == false){
                System.out.println("Sua senha precisa de um número");
            }
            if(letraMaiuscula == false){
                System.out.println("Sua senha precisa de uma letra maiúscula");
            }

            if(numero == true && letraMaiuscula == true){
                System.out.println("Senha cadastrada com sucesso!");
                break;
            }
        }
    }
}

