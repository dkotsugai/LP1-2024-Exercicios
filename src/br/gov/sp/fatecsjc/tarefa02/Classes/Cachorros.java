package br.gov.sp.fatecsjc.tarefa02.Classes;

public class Cachorros {
    private String nome;
    private String raca;
    private int idade;
    private String cor;
    private String porte;
    private String sexo;
    private String dono;
    private String dataNascimento;


    public Cachorros(String nome, String raca, int idade, String cor, String porte, String sexo, String dono, String dataNascimento) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.porte = porte;
        this.sexo = sexo;
        this.dono = dono;
        this.dataNascimento = dataNascimento;
    }

    public String latir() {
        return "Au au!";
    }
    public String andar() {
        return "Cachorro andando...";
    }
    public String correr() {
        return "Cachorro correndo...";
    }
    public String comer() {
        return "Cachorro comendo...";
    }
    public String dormir() {
        return "Cachorro dormindo...";
    }


}
