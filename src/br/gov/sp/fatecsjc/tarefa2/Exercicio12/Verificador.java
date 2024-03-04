package br.gov.sp.fatecsjc.tarefa2.Exercicio12;

public class Verificador {
    private double valor1;
    private double valor2;

    public Verificador(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void verificarMaior() {
        double maiorValor = Math.max(valor1, valor2);
        System.out.println("O maior valor é: " + maiorValor);
    }
}

