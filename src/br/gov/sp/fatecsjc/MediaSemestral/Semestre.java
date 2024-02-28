package br.gov.sp.fatecsjc.MediaSemestral;

public class Semestre {
    private double nota1;
    private double nota2;
    private double nota3;

    public Semestre(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }
    public static boolean notasValidas(double nota1, double nota2, double nota3) {
        return (nota1 >= 0 && nota1 <= 10) && (nota2 >= 0 && nota2 <= 10) && (nota3 >= 0 && nota3 <= 10);
    }
}