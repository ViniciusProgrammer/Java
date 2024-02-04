package classe;

public class AreaCirc {
    double raio;
    final static double PI = 3.1415;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }

    //método para a instância(objeto) da classe
    double area(){
        return raio * raio * PI;
        // return Math.pow(raio, 2) * pi; outra forma de ser feita
    }

    //método para a classe e na classe teste eu não preciso criar um objeto para chamar esse método basta chamar a classe diretamente
    static double area(double raio){
        return PI * Math.pow(raio, 2);
    }
}

