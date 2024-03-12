package br.gov.sp.fatecsjc.tarefa02.Classes;

public class Galinhas {

        private String nome;
        private String especie;
        private int idade;
        private String cor;
        private String sexo;
        private String dataNascimento;

        public Galinhas(String nome, String especie, int idade, String cor, String sexo, String dataNascimento) {
            this.nome = nome;
            this.especie = especie;
            this.idade = idade;
            this.cor = cor;
            this.sexo = sexo;
            this.dataNascimento = dataNascimento;
        }

        public String cacarejar() {
            return "Galinha cacarejando...";
        }
        public String andar() {
            return "Galinha andando...";
        }
        public String correr() {
            return "Galinha correndo...";
        }
        public String comer() {
            return "Galinha comendo...";
        }
        public String dormir() {
            return "Galinha dormindo...";
        }
}
