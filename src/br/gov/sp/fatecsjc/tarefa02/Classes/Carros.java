package br.gov.sp.fatecsjc.tarefa02.Classes;

public class Carros {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private String proprietario;
    private String dataCompra;

    public Carros(String marca, String modelo, int ano, String cor, String placa, String proprietario, String dataCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.proprietario = proprietario;
        this.dataCompra = dataCompra;
    }

    public String buzinar() {
        return "Carro buzinando...";
    }
    public String andar() {
        return "Carro andando...";
    }
    public String correr() {
        return "Carro correndo...";
    }
    public String parar() {
        return "Carro parando...";
    }
    public String desligar() {
        return "Carro desligando...";
    }
}
