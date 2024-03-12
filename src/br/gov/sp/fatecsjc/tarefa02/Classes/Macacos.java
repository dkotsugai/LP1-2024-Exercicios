package br.gov.sp.fatecsjc.tarefa02.Classes;

public class Macacos {
     
    private String nome;
    private String especie;
    private int idade;
    private String cor;
    private String sexo;
    private String dataNascimento;

    public Macacos(String nome, String especie, int idade, String cor, String sexo, String dataNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.cor = cor;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String gritar() {
        return "Macaco gritando...";
    }
    public String andar() {
        return "Macaco andando...";
    }
    public String correr() {
        return "Macaco correndo...";
    }
    public String comer() {
        return "Macaco comendo...";
    }
    public String dormir() {
        return "Macaco dormindo...";
    }
}
