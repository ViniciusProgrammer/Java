package oo.lp2;

public abstract class Livro {

    abstract public boolean validar(); //Apenas a assinatura do método fica aqui na super classe, sua implementação fica nas classes derivadas desta aqui

    abstract public void editar();

    public void salvar(){
        if(validar()){
            System.out.println("Salvando...");
        }
        else{
            System.out.println("Não foi possivel salvar!");
        }
    }
}
