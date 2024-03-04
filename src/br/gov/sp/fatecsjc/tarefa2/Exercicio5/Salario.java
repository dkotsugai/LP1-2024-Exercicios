package br.gov.sp.fatecsjc.tarefa2.Exercicio5;

public class Salario {
    private int carrosVendidos;
    private double valorVendas;
    private double salarioFixo;
    private double valorPorCarroVendido;

    public Salario(int carrosVendidos, double valorVendas, double salarioFixo, double valorPorCarroVendido) {
        this.carrosVendidos = carrosVendidos;
        this.valorVendas = valorVendas;
        this.salarioFixo = salarioFixo;
        this.valorPorCarroVendido = valorPorCarroVendido;
    }

    public double calcularSalarioFinal() {
        double comissao = 0.05 * valorVendas;

        double salarioFinal = salarioFixo + (carrosVendidos * valorPorCarroVendido) + comissao;

        return salarioFinal;
    }

    public int getCarrosVendidos() {
        return carrosVendidos;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double getValorPorCarroVendido() {
        return valorPorCarroVendido;
    }
}