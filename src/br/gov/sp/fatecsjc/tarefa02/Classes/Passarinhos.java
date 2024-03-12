package br.gov.sp.fatecsjc.tarefa02.Classes;

public class Passarinhos {

    private String nome;
    private String especie;
    private int idade;
    private String cor;
    private String sexo;
    private String dataNascimento;

    public Passarinhos(String nome, String especie, int idade, String cor, String sexo, String dataNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.cor = cor;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String cantar() {
        return "Passarinho cantando...";
    }
    public String voar() {
        return "Passarinho voando...";
    }
    public String comer() {
        return "Passarinho comendo...";
    }
    public String dormir() {
        return "Passarinho dormindo...";
    }
}
