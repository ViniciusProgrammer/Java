package oo.lp2;

public class LivroDidatico extends Livro{

    public void editar(){
        System.out.println("Qualquer coisa");
    }
    
    //Implementação do método validar
    public boolean validar(){
        System.out.println("LivroDidático::validando...");
        return Math.random() < 0.5;
    }
}
