package classe;

public class AreaCircTeste {

    public static void main(String[] args){
        AreaCirc a1 = new AreaCirc(5.6);
        AreaCirc a2 = new AreaCirc(3.1);

        /*//AreaCirc.pi = 3.1415;   Acessando a variável de classe diretamente, essa atribuição tem um efeito global, 
        ou seja ela afeta todos os objetos da classe AreaCirc, pois a variável pi é compartilhada por todos os objetos da classe.
        alterando o valor de pi, todos os objetos que utilizam pi terão o valor alterado.
        */

        // Acessando a variável de classe diretamente
        System.out.println(a1.area());

        // Acessando a variável de classe diretamente
        System.out.println(a2.area());

        //Acessando a variável de classe diretamente
        System.out.println(AreaCirc.PI);

        //Acessando o método de classe diretamente
        System.out.println(AreaCirc.area(50));
    }
}
