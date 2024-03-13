package br.gov.sp.fatecsjc.tarefa02.Classes;

public class Calculadora {
    private int numerador;
    private int denominador;

    public double somar(int numerador, int denominador) {
        return numerador + denominador;
    }
    public double subtrair(int numerador, int denominador) {
        return numerador - denominador;
    }
    public double multiplicar(int numerador, int denominador) {
        return numerador * denominador;
    }
    public double dividir(int numerador, int denominador) {
        return numerador / denominador;
    }
    public int getNumerador() {
        return numerador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public int getDenominador() {
        return denominador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
}
