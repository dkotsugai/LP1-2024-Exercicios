package br.gov.sp.fatecsjc.tarefa2.Exercicio10;


public class Aluno {
    private double nota1;
    private double nota2;

    public Aluno(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public boolean verificarAprovacao() {
        return calcularMedia() >= 6.0;
    }
}