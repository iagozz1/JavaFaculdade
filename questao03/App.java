package questao03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

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

                System.out.print("Digite uma idade: ");

                String idade = sc.next();

                System.out.println("Sua idade: " + Integer.parseInt(idade));


            }catch(NumberFormatException e){
                System.out.println("Não permitido o uso de letras");
            }
    }

}
}