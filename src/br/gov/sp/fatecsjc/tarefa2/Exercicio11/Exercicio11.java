package br.gov.sp.fatecsjc.tarefa2.Exercicio11;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ano atual: ");
        int anoAtual = scanner.nextInt();

        System.out.println("Informe o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

       Verificador verificador = new Verificador(anoAtual, anoNascimento);

        verificador.verificarPodeVotar();

        scanner.close();
    }
}
