package oo.heranca;

public class CarroTeste {
    public static void main(String[] args){
        Carros c1 = new Ferrari();
        Carros c2 = new Fusca();

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println("Minha Ferrari está à " + c1.velocidadeAtual + " Km/h");

        c1.frear();
        c1.frear();

        System.out.println("Minha Ferrari está à " + c1.velocidadeAtual + " Km/h");

        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();

        System.out.println("Meu Fusca está à " + c2.velocidadeAtual + " Km/h");

        c2.frear();
        c2.frear();
        c2.frear();

        System.out.println("Meu Fusca está à " + c2.velocidadeAtual + " Km/h");
    }
}
