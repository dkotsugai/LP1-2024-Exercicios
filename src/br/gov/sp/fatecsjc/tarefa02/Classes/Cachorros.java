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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
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

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
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
