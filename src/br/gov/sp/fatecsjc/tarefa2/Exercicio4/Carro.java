package br.gov.sp.fatecsjc.tarefa2.Exercicio4;

public class Carro {
    private double custoFabrica;

    public Carro(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoFinal() {
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        double custoDistribuidor = custoFabrica * percentualDistribuidor;
        double custoImpostos = custoFabrica * percentualImpostos;
        double custoFinal = custoFabrica + custoDistribuidor + custoImpostos;
        return custoFinal;
    }
}
