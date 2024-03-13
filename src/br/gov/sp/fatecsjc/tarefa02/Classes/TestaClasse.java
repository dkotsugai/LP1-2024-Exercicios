package br.gov.sp.fatecsjc.tarefa02.Classes;

public class TestaClasse {

    public static void main(String[] args) {

        Carros carro = new Carros("Fiat", "Uno", 2010, "Vermelho", "ABC-1234", "João", "01/01/2010");
        System.out.println(carro.buzinar());
        System.out.println(carro.andar());

        Cachorros cachorro = new Cachorros("Cachorro", "Vira-lata", 5, "Marrom", "Pequeno", "Macho", "João", "01/01/2015");
        System.out.println(cachorro.latir());
        System.out.println(cachorro.andar());


        Elefantes elefante = new Elefantes("Elefante", "Elefante", 10, "Cinza", "Macho", "João", "01/01/2010");
        System.out.println(elefante.barulho());
        System.out.println(elefante.andar());

        Macacos macaco = new Macacos("Macaco", "Macaco", 5, "Marrom", "Macho", "01/01/2015");
        System.out.println(macaco.gritar());
        System.out.println(macaco.andar());

        Galinhas galinha = new Galinhas("Galinha", "Galinha", 2, "Branca", "Fêmea", "01/01/2019");
        System.out.println(galinha.cacarejar());
        System.out.println(galinha.andar());

        Gatos gato = new Gatos("Gato", "Gato", 3, "Preto", "Macho", "01/01/2018");
        System.out.println(gato.miar());
        System.out.println(gato.andar());

        Passarinhos passarinho = new Passarinhos("Passarinho", "Passarinho", 1, "Azul", "Macho", "01/01/2020");
        System.out.println(passarinho.cantar());
        System.out.println(passarinho.voar());

        Pessoas pessoa = new Pessoas("Pessoa", "Humano", 30, "Branco", "Masculino", "João", "01/01/1990");
        System.out.println(pessoa.andar());
        System.out.println(pessoa.comer());

        Peixes peixe = new Peixes("Peixe", "Peixe", 1, "Dourado", "Macho", "01/01/2020");
        System.out.println(peixe.nadar());
        System.out.println(peixe.comer());

        Tartarugas tartaruga = new Tartarugas("Tartaruga", "Tartaruga", 5, "Verde", "Fêmea", "01/01/2016");
        System.out.println(tartaruga.andar());
        System.out.println(tartaruga.nadar());
        System.out.println(tartaruga.comer());
    }

}
