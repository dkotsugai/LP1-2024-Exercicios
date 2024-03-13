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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
