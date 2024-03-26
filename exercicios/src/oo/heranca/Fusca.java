package oo.heranca;

public class Fusca extends Carros{
    
    @Override
    void acelerar(){
        velocidadeAtual += 10;
    }

    @Override
    void frear(){
        velocidadeAtual -= 7;
    }
}
