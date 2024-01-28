package desafios;

public class desafiologicos {
    public static void main(String[] args){
        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        System.out.println("Comprou TV 50\"? " + comprouTV50);
        System.out.println("Comprou TV 32\"? " + comprouTV32);
        System.out.println("Comprou Sorvete? " + comprouSorvete);

        // Operador Unário
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Mais saudável? " + maisSaudavel);   
    }
}
