package br.gov.sp.fatecsjc.tarefa2.Exercicio12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Informe o segundo valor (diferente do primeiro): ");
        double valor2 = scanner.nextDouble();

        Verificador verificador = new Verificador(valor1, valor2);
        verificador.verificarMaior();

        scanner.close();
    }
}