package classe;

public class Jantar {
    public static void main(String[] args){
        Comida c1 = new Comida("Arroz", 0.265);
        Comida c2 = new Comida("Feijão", 0.442);

        Pessoa p1 = new Pessoa("Ana", 55.5);
        
        System.out.println(p1.apresentar());
        p1.comer(c1);
        System.out.println(p1.apresentar());
        p1.comer(c2);
        System.out.println(p1.apresentar());
    }
}