package br.gov.sp.fatecsjc.tarefa02.Classes;

public class Elefantes {

    private String nome;
    private String especie;
    private int idade;
    private String cor;
    private String sexo;
    private String dono;
    private String dataNascimento;

    public Elefantes(String nome, String especie, int idade, String cor, String sexo, String dono, String dataNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.cor = cor;
        this.sexo = sexo;
        this.dono = dono;
        this.dataNascimento = dataNascimento;
    }

    public String barulho() {
        return "Elefante barulhento...";
    }
    public String andar() {
        return "Elefante andando...";
    }
    public String correr() {
        return "Elefante correndo...";
    }
    public String comer() {
        return "Elefante comendo...";
    }
    public String dormir() {
        return "Elefante dormindo...";
    }
}
