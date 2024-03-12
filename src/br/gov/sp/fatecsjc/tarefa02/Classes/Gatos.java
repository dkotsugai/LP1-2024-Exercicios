package br.gov.sp.fatecsjc.tarefa02.Classes;

public class Gatos {

    private String nome;
    private String especie;
    private int idade;
    private String cor;
    private String sexo;
    private String dataNascimento;

    public Gatos(String nome, String especie, int idade, String cor, String sexo, String dataNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.cor = cor;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String miar() {
        return "Gato miando...";
    }
    public String andar() {
        return "Gato andando...";
    }
    public String correr() {
        return "Gato correndo...";
    }
    public String comer() {
        return "Gato comendo...";
    }
    public String dormir() {
        return "Gato dormindo...";
    }
}
