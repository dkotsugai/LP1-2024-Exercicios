package br.gov.sp.fatecsjc.tarefa02.Classes;

public class Peixes {

        private String nome;
        private String especie;
        private int idade;
        private String cor;
        private String sexo;
        private String dataNascimento;

        public Peixes(String nome, String especie, int idade, String cor, String sexo, String dataNascimento) {
            this.nome = nome;
            this.especie = especie;
            this.idade = idade;
            this.cor = cor;
            this.sexo = sexo;
            this.dataNascimento = dataNascimento;
        }

        public String nadar() {
            return "Peixe nadando...";
        }
        public String comer() {
            return "Peixe comendo...";
        }
        public String dormir() {
            return "Peixe dormindo...";
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
