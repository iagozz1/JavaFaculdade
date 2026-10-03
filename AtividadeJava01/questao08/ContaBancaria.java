package questao08;

import java.util.Scanner;

public class ContaBancaria {
    Scanner scanner = new Scanner(System.in);

    double saldo;
    double saque;

    public void sacar(){
        System.out.print("Valor do seu saldo: ");
        saldo = scanner.nextInt();

        System.out.print("Quanto deseja sacar?: ");
        saque = scanner.nextDouble();

        if(saque > saldo){
            throw new SaldoInsuficienteException("Saque maior que o saldo disponível.");
        }

        saldo -= saque;


        if((saldo - saque) < 0){
            throw new SaldoInsuficienteException("O saldo não pode ficar negativo.");
        }
    }
}
