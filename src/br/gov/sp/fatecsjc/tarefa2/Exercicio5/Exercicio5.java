package br.gov.sp.fatecsjc.tarefa2.Exercicio5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.println("Informe o valor total de vendas: R$");
        double valorVendas = scanner.nextDouble();

        System.out.println("Informe o salário fixo do vendedor: R$");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Informe o valor por carro vendido: R$");
        double valorPorCarroVendido = scanner.nextDouble();

        Salario salarioVendedor = new Salario(carrosVendidos, valorVendas, salarioFixo, valorPorCarroVendido);

        double salarioFinal = salarioVendedor.calcularSalarioFinal();

        System.out.println("\nSalário final do vendedor: R$" + salarioFinal);
        System.out.println("Número de carros vendidos: " + salarioVendedor.getCarrosVendidos());
        System.out.println("Valor total de vendas: R$" + salarioVendedor.getValorVendas());
        System.out.println("Salário fixo: R$" + salarioVendedor.getSalarioFixo());
        System.out.println("Valor por carro vendido: R$" + salarioVendedor.getValorPorCarroVendido());

        scanner.close();
    }
}