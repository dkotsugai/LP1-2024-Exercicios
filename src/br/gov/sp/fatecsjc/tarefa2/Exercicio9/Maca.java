package br.gov.sp.fatecsjc.tarefa2.Exercicio9;

public class Maca {
    private int quantidade;

    public Maca(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularCustoTotal() {
        double precoPorMaca;

        if (quantidade < 12) {
            precoPorMaca = 1.30;
        } else {
            precoPorMaca = 1.00;
        }

        double custoTotal = quantidade * precoPorMaca;

        return custoTotal;
    }
}