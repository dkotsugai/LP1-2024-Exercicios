package br.gov.sp.fatecsjc.tarefa1.MediaSemestral;

public class Semestre {
    private double P1, E1, E2, API, X, SUB;

    public Semestre(double P1, double E1, double E2, double API, double X, double SUB) {
        this.P1 = P1;
        this.E1 = E1;
        this.E2 = E2;
        this.API = API;
        this.X = X;
        this.SUB = SUB;
    }

    public double calcularMedia() {
        double resultado = (P1 * 0.6 + ((E1 + E2) / 2) * 0.4) * 0.5 +
                (Math.max(P1 * 0.6 + ((E1 + E2) / 2) * 0.4 - 5.9, 0) /
                        (P1 * 0.6 + ((E1 + E2) / 2) * 0.4 - 5.9)) * (API * 0.5) + X +
                SUB * 0.2;

        return resultado;
    }
}