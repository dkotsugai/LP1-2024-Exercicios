package br.gov.sp.fatecsjc.tarefa1.BalançoTrimestral;

public class Empresa {
    public static void main(String[] args) {

        double Janeiro = 27000;
        double Fevereiro = 15000;
        double Marco = 10000;

        GastosTrimestrais Trimestrais = new GastosTrimestrais(Janeiro,Fevereiro,Marco);

        double Total = Trimestrais.TrimestreGastos();

        double mediaMensal = Trimestrais.MediaMensal();

        System.out.println("Os gastos da empresa no trimestre foram de R$" + String.format("%.2f", Total));
        System.out.println("A média mensal de gasto foi de R$" + String.format("%.2f", mediaMensal));
    }
}