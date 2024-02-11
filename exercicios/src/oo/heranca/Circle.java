package oo.heranca;

public class Circle {
    public double raio;

    public Circle(double raio){
        System.out.println("Iniciando o contrutor da classe Circle");
        this.raio = raio;
    }

    double area(){
        return Math.PI * Math.pow(raio, 2);
    }
}
