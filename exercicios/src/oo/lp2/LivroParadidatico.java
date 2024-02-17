package oo.lp2;

public class LivroParadidatico extends Livro{

    public void editar(){
        System.out.println("Editando...");
    }
    
    public boolean validar(){
        System.out.println("Paradidático::validando...");
        return Math.random() > 0.5;
    }
}
