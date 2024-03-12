package br.gov.sp.fatecsjc.tarefa02.Classes;

public class Tartarugas {

    private String nome;
    private String especie;
    private int idade;
    private String cor;
    private String sexo;
    private String dataNascimento;

    public Tartarugas(String nome, String especie, int idade, String cor, String sexo, String dataNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.cor = cor;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String nadar() {
        return "Tartaruga nadando...";
    }

    public String comer() {
        return "Tartaruga comendo...";
    }

    public String dormir() {
        return "Tartaruga dormindo...";
    }

}
