package br.gov.sp.fatecsjc.tarefa1.MediaSemestral;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nota da primeira prova (LP1): ");
            double nota1 = scanner.nextDouble();

            System.out.println("Nota da segunda prova (LP1): ");
            double nota2 = scanner.nextDouble();

            System.out.println("Nota da terceira prova (LP1): ");
            double nota3 = scanner.nextDouble();

            // Verifica se as notas estão dentro do intervalo válido (0 a 10)
            if (!Semestre.notasValidas(nota1, nota2, nota3)) {
                System.out.println("Por favor, insira notas válidas entre 0 e 10. Reiniciando o programa...\n");
                continue;  // Reinicia o loop
            }

            Semestre semestre = new Semestre(nota1, nota2, nota3);

            double media = semestre.calcularMedia();
            System.out.println("A média do aluno: " + String.format("%.1f",media));
            break;
        }

        scanner.close();
    }
}