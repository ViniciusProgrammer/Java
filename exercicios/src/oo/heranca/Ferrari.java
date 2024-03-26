package oo.heranca;

public class Ferrari extends Carros{
    
    @Override
    void acelerar(){
        velocidadeAtual += 20;
    }

    @Override
    void frear(){
        velocidadeAtual -= 13;
    }
}
