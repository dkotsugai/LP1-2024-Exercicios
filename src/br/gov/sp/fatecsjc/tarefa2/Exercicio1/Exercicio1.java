package br.gov.sp.fatecsjc.tarefa2.Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("e quantos meses: ");
        int meses = scanner.nextInt();

        System.out.print("e dias: ");
        int dias = scanner.nextInt();

        Pessoa pessoa = new Pessoa(anos, meses, dias);

        int idadeEmDias = pessoa.calcularIdadeEmDias();
        System.out.println("Sua idade em dias é: " + idadeEmDias+ " dias");

        scanner.close();
    }
}