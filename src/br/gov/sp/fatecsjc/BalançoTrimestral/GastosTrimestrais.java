package br.gov.sp.fatecsjc.BalançoTrimestral;

public class GastosTrimestrais {
    private double janeiro;
    private double fevereiro;
    private double marco;
    public GastosTrimestrais(double janeiro, double fevereiro, double marco) {
        this.janeiro = janeiro;
        this.fevereiro = fevereiro;
        this.marco = marco;
    }
    public double TrimestreGastos() {
        return janeiro + fevereiro + marco;
    }
    public double MediaMensal() {
        return TrimestreGastos() / 3;
    }
}