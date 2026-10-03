package questao05;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Arquivo abrindo...");
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
                System.out.print("Forneça um número: ");
                String numero = sc.next();


                System.out.println("Número digitado: " + Integer.parseInt(numero));
            }catch(NumberFormatException e){
                System.out.println("Não use letras");
            }finally{
                System.out.println("Arquivo fechado.");
            }
            
    }
}
}