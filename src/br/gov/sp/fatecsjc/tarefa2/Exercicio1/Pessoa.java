package br.gov.sp.fatecsjc.tarefa2.Exercicio1;

public class Pessoa {
    private int anos;
    private int meses;
    private int dias;
    private final int DIAS_POR_ANO = 365;
    private final int DIAS_POR_MES = 30;

    public Pessoa(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public int calcularIdadeEmDias() {
        int idadeEmDias = (anos * DIAS_POR_ANO) + (meses * DIAS_POR_MES) + dias;
        return idadeEmDias;
    }
}