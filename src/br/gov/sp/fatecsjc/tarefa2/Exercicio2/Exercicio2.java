package br.gov.sp.fatecsjc.tarefa2.Exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Informe o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.print("Informe o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Informe o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        Votos eleicao = new Votos(totalEleitores, votosBrancos, votosNulos, votosValidos);

        eleicao.exibirResultados();

        scanner.close();
    }
}