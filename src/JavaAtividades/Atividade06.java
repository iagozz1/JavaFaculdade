package JavaAtividades;

import java.util.Scanner;

public class Atividade06 {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um nome de usuário: ");

        String usuario = leitor.next();

        System.out.print("Digite uma senha: ");
        String senha = leitor.next();

        if(usuario.equals("admin") && senha.equals("1234")){
            System.out.println("Login bem sucedido");
        }else{
            System.out.println("Login inválido");
        }
    }
}
