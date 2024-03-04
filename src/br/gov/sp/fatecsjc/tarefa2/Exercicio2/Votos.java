package br.gov.sp.fatecsjc.tarefa2.Exercicio2;


public class Votos {
    private final int totalEleitores;
    private final int votosBrancos;
    private final int votosNulos;
    private final int votosValidos;
    public Votos(int totalEleitores, int votosBrancos, int votosNulos, int votosValidos) {
        this.totalEleitores = totalEleitores;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
        this.votosValidos = votosValidos;
    }
    public double calcularPercentualBrancos() {
        return (double) votosBrancos / totalEleitores * 100;
    }

    public double calcularPercentualNulos() {
        return (double) votosNulos / totalEleitores * 100;
    }

    public double calcularPercentualValidos() {
        return (double) votosValidos / totalEleitores * 100;
    }

    public void exibirResultados() {
        System.out.println("\nResultados da Eleição:");
        System.out.println("Total de eleitores: " + totalEleitores);
        System.out.println("Percentual de votos brancos: " + calcularPercentualBrancos() + "%");
        System.out.println("Percentual de votos nulos: " + calcularPercentualNulos() + "%");
        System.out.println("Percentual de votos válidos: " + calcularPercentualValidos() + "%");
    }
}