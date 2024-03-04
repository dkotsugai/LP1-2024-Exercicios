package br.gov.sp.fatecsjc.tarefa2.Exercicio3;

public class Funcionario {
    private double salarioMensal;

    public Funcionario(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public void aplicarReajuste(double percentualReajuste) {
        double fatorReajuste = 1 + (percentualReajuste / 100);
        salarioMensal *= fatorReajuste;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }
}
