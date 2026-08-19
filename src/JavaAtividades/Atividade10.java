package JavaAtividades;

import java.util.Scanner;

public class Atividade10 {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        double menorPeso = 999;
        double maiorPeso = 0;
        int contador = 0;

        while (true) {
            System.out.println("""
                    ---- MENU ----
                    1 - Cadastrar peso
                    2 - Finalizar
                    """);
            System.out.print("Escolha uma opção: ");

            int escolha = leitor.nextInt();

            if (escolha == 1) {
                while (true) {

                    System.out.print("Digite o peso do animal: ");
                    double peso = leitor.nextDouble();
                    contador++;

                    if (peso > maiorPeso) {
                        maiorPeso = peso;
                    }

                    if (peso < menorPeso) {
                        menorPeso = peso;
                    }
                    System.out.print("Ir para o menu? (S - Sim) / (N - Não): ");
                    String continuar = leitor.next();

                    if (continuar.equals("S") || continuar.equals("s")) {
                        break;
                    }
                }
            } else if (escolha == 2) {
                System.out.println("Animais registrados: " + contador);
                System.out.println("Maior peso: " + maiorPeso);
                System.out.println("Menor peso: " + menorPeso);
                break;

            }
        }
    }
}

