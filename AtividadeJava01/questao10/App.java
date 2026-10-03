package questao10;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = """
                1 - Somar
                2 - Diminuir
                3 - Multiplicar
                4 - Dividir
                0 - Sair
                """;

        while (true) {
            System.out.println(menu);

            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();

            if(escolha == 0){
                System.out.println("Saindo do programa...");
                break;
            }

            switch (escolha) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            try{

                System.out.print("Digite o 1º número: ");
                String numero1 = scanner.next();
    
                System.out.print("Digite o 2º número: ");
                String numero2 = scanner.next();
    
                if(escolha == 1){
                    System.out.println("Resultado: " + (Integer.parseInt(numero1) + Integer.parseInt(numero2)));

                }else if(escolha == 2){
                    System.out.println("Resultado " + (Integer.parseInt(numero1) - Integer.parseInt(numero2)));

                }else if(escolha == 3){
                    System.out.println("Resultado: " + (Integer.parseInt(numero1) * Integer.parseInt(numero2)));

                }else if(escolha == 4){

                    if(Integer.parseInt(numero1) == 0 || Integer.parseInt(numero2) == 0){
                        throw new DivisaoPorZeroException("Divisão por zero inválida.");
                    }

                    System.out.println("Resultado: " + (Integer.parseInt(numero1) / Integer.parseInt(numero2)));
                }

            }catch(DivisaoPorZeroException e){
                System.out.println(e.getMessage());
            }catch(NumberFormatException e){
                System.out.println("Não use letras.");
            }finally{
                System.out.println("Operação concluída.");
            }


        }
    }
}
