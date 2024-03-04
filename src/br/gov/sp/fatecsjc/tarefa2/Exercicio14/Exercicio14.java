package br.gov.sp.fatecsjc.tarefa2.Exercicio14;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para informar a hora de início e a hora de fim
        System.out.print("Informe a hora de início do jogo: ");
        int horaInicio = scanner.nextInt();

        System.out.print("Informe a hora de fim do jogo: ");
        int horaFim = scanner.nextInt();

        // Cria um objeto Jogo
        Jogo jogo = new Jogo(horaInicio, horaFim);

        // Calcula e exibe a duração do jogo
        int duracao = jogo.calcularDuracao();
        System.out.println("\nA duração do jogo foi de " + duracao + " horas.");

        scanner.close();
    }
}