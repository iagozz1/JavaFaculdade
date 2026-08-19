package JavaAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade09 {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Quanto você ganha por hora: ");

        double ganhoHoras = leitor.nextDouble();

        System.out.print("Número de horas trabalhadas: ");
        double horasTrabalhadas = leitor.nextDouble();

        double salarioBruto = ganhoHoras * horasTrabalhadas;

        double impostoRenda = (11 * salarioBruto / 100);
        double inss = (8 * salarioBruto / 100);
        double sindicato = (5 * salarioBruto / 100);

        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Imposto de Renda (11%): R$" + impostoRenda);
        System.out.println("INSS (8%): R$" + inss);
        System.out.println("Sindicato (5%): R$" + sindicato);
        System.out.println("Salário Líquido: R$" + (salarioBruto - impostoRenda - inss - sindicato));

    }
}
