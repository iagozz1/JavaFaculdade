package JavaAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade05 {
    static void main() {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);
        System.out.print("Digite seu peso: ");
        double peso = leitor.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = leitor.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println("Você está abaixo do peso");
        }else if(imc >= 18.5 && imc < 25){
            System.out.println("Você está no peso normal");
        }else if(imc >= 25 && imc < 30){
            System.out.println("Você está com sobrepeso");
        }else{
            System.out.println("Você está obeso");
        }
    }
}
