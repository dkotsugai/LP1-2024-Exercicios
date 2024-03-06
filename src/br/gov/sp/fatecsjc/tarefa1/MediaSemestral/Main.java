package br.gov.sp.fatecsjc.tarefa1.MediaSemestral;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota P1: ");
        double P1 = scanner.nextDouble();

        System.out.print("Digite a nota E1: ");
        double E1 = scanner.nextDouble();

        System.out.print("Digite a nota E2: ");
        double E2 = scanner.nextDouble();

        System.out.print("Digite a nota API: ");
        double API = scanner.nextDouble();

        System.out.print("Digite a nota X: ");
        double X = scanner.nextDouble();

        System.out.print("Digite a nota SUB: ");
        double SUB = scanner.nextDouble();

        Semestre semestreDoAluno = new Semestre(P1, E1, E2, API, X, SUB);

        double mediaDoSemestre = semestreDoAluno.calcularMedia();
        System.out.println("A média do aluno é de: " + mediaDoSemestre);

        scanner.close();
    }
}