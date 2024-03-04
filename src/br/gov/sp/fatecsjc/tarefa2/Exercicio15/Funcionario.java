package br.gov.sp.fatecsjc.tarefa2.Exercicio15;

public class Funcionario {
    private int horasTrabalhadasPorMes;
    private double salarioPorHora;
    private final int horasSemana = 40;
    private final int semanasPorMes = 4;

    public Funcionario(int horasTrabalhadasPorMes, double salarioPorHora) {
        this.horasTrabalhadasPorMes = horasTrabalhadasPorMes;
        this.salarioPorHora = salarioPorHora;
    }

    public double calcularSalarioTotal() {
        int horasNormais = Math.min(horasTrabalhadasPorMes, horasSemana * semanasPorMes);
        int horasExtras = Math.max(horasTrabalhadasPorMes - horasNormais, 0);

        double salarioTotal = (horasNormais * salarioPorHora) + (horasExtras * 1.5 * salarioPorHora);

        return salarioTotal;
    }
}