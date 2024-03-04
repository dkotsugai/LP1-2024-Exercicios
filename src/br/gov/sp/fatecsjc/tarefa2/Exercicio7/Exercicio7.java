package br.gov.sp.fatecsjc.tarefa2.Exercicio7;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int valor = scanner.nextInt();

        Verificador.verificarMaiorQueDez(valor);

        scanner.close();
    }
}