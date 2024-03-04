package br.gov.sp.fatecsjc.tarefa2.Exercicio11;

class Verificador {
    private int anoAtual;
    private int anoNascimento;

    public Verificador(int anoAtual, int anoNascimento) {
        this.anoAtual = anoAtual;
        this.anoNascimento = anoNascimento;
    }

    public void verificarPodeVotar() {
        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Pode votar este ano!");
        } else {
            System.out.println("Não pode votar este ano!");
        }
    }
}