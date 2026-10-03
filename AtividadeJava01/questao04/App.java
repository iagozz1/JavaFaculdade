package questao04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

                String numero1 = sc.next();

                System.out.print("Digite o 2º número: ");

                String numero2 = sc.next();

                System.out.println("Resultado: " +  Integer.parseInt(numero1) /Integer.parseInt(numero2));


            }catch(NumberFormatException e){
                System.out.println("Não permitido o uso de letras.");
            }catch(ArithmeticException e){
                System.out.println("Não permitido divisão por zero.");
            }
    }
}
}
