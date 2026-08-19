package JavaAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade07 {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Digite o tipo de combustível (G - Gasolina / A - Alcool): ");
        String tipoCombustivel = leitor.next();

        System.out.print("Digite a quantidade de litros: ");
        double quanLitros = leitor.nextDouble();

        double pagamentoGasolina = quanLitros * 5.50;
        double pagamentoAlcool = quanLitros * 4.00;

        if (tipoCombustivel.equals("G") || tipoCombustivel.equals("g")) {
            System.out.println("Valor a pagar: R$" + pagamentoGasolina);
        } else if (tipoCombustivel.equals("A") || tipoCombustivel.equals("a")) {
            System.out.println("Valor a pagar: R$" + pagamentoAlcool);
        }
    }
}
