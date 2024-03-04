package br.gov.sp.fatecsjc.tarefa2.Exercicio10;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();

        Aluno aluno = new Aluno(nota1, nota2);

        double media = aluno.calcularMedia();
        boolean aprovado = aluno.verificarAprovacao();

        System.out.println("\nMédia: " + media);
        System.out.println(aprovado ? "Aluno APROVADO!" : "Aluno REPROVADO.");

        scanner.close();
    }
}