package br.gov.sp.fatecsjc.tarefa2.Exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o salário mensal atual: ");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Informe o percentual de reajuste: ");
        double percentualReajuste = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(salarioAtual);

        funcionario.aplicarReajuste(percentualReajuste);

        System.out.println("Novo salário: R$" + funcionario.getSalarioMensal());

        scanner.close();
    }
}