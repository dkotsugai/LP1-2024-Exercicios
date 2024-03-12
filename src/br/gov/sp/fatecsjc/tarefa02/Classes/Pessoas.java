package br.gov.sp.fatecsjc.tarefa02.Classes;

public class Pessoas {

    private String nome;
    private String cpf;
    private int idade;
    private String cor;
    private String sexo;
    private String endereco;
    private String dataNascimento;

    public Pessoas(String nome, String cpf, int idade, String cor, String sexo, String endereco, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.cor = cor;
        this.sexo = sexo;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String falar() {
        return "Pessoa falando...";
    }
    public String andar() {
        return "Pessoa andando...";
    }
    public String correr() {
        return "Pessoa correndo...";
    }
    public String comer() {
        return "Pessoa comendo...";
    }
    public String dormir() {
        return "Pessoa dormindo...";
    }
}
