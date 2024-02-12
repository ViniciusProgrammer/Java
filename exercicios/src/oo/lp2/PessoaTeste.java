package oo.lp2;

public class PessoaTeste {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();

        System.out.println("Inicialmente sem nada!");

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade = " + p1.getIdade());
        System.out.println("Altura = " + p1.getAltura());

        System.out.println("Agora com valores!");
        
        p1.setNome("Vinicius");
        p1.setIdade(21);
        p1.setAltura(1.89);
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade = " + p1.getIdade());
        System.out.println("Altura = " + p1.getAltura());
    }   
}
