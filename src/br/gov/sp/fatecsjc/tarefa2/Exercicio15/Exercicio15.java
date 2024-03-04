package br.gov.sp.fatecsjc.tarefa2.Exercicio15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de horas trabalhadas em um mês: ");
        int horasTrabalhadasPorMes = scanner.nextInt();

        System.out.print("Informe o salário por hora: R$");
        double salarioPorHora = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(horasTrabalhadasPorMes, salarioPorHora);

        double salarioTotal = funcionario.calcularSalarioTotal();
        System.out.println("\nO salário total do funcionário é: R$" + salarioTotal);

        scanner.close();
    }
}