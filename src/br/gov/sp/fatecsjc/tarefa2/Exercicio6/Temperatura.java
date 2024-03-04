package br.gov.sp.fatecsjc.tarefa2.Exercicio6;

public class Temperatura {
    private double temperaturaFahrenheit;

    public Temperatura(double temperaturaFahrenheit) {
        this.temperaturaFahrenheit = temperaturaFahrenheit;
    }

    public double converterParaCelsius() {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
}