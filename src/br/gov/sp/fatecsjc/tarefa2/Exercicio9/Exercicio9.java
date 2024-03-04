package br.gov.sp.fatecsjc.tarefa2.Exercicio9;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para informar a quantidade de maçãs compradas
        System.out.print("Informe a quantidade de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        // Cria um objeto Maca
        Maca maca = new Maca(quantidade);

        // Calcula e exibe o custo total da compra
        double custoTotal = maca.calcularCustoTotal();
        System.out.println("\nCusto total da compra: R$" + custoTotal);

        scanner.close();
    }
}