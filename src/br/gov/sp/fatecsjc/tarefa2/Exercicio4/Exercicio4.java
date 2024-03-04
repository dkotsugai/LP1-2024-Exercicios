package br.gov.sp.fatecsjc.tarefa2.Exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("O valor de custo da Fabrica para produção do carro é de: R$");
        double custoFabrica = scanner.nextDouble();

        Carro carro = new Carro(custoFabrica);

        double custoFinal = carro.calcularCustoFinal();

        System.out.println("Custo final do carro ao consumidor: R$" + custoFinal);

        scanner.close();
    }
}
