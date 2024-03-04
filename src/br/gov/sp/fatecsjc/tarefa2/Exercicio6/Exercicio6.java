package br.gov.sp.fatecsjc.tarefa2.Exercicio6;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        Temperatura temperatura = new Temperatura(temperaturaFahrenheit);
        double temperaturaCelsius = temperatura.converterParaCelsius();

        System.out.println("\nA temperatura em Celsius é: " + temperaturaCelsius + "°C");
        scanner.close();
    }
}