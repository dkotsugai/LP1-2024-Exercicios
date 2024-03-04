package br.gov.sp.fatecsjc.tarefa2.Exercicio14;

public class Jogo {
    private int horaInicio;
    private int horaFim;

    public Jogo(int horaInicio, int horaFim) {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }
    public int calcularDuracao() {
        int duracao;

        if (horaInicio <= horaFim) {
            // Mesmo dia
            duracao = horaFim - horaInicio;
        } else {
            // Jogo iniciou em um dia e terminou no dia seguinte
            duracao = 24 - horaInicio + horaFim;
        }

        return duracao;
    }
}