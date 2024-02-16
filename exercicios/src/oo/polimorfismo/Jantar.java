package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args){
        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.2);
        Feijao ingrediente2 = new Feijao(0.1);

        System.out.println("Peso inicial " + convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);

        System.out.println("Peso depois de comer " + convidado.getPeso());
    }
}
