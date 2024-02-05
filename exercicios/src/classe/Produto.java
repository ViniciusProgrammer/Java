package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

      //Construtor padrão para produto y lá na classe Produtoteste
      Produto(){

      }

    //COntrutor com parametros para produto x lá na classe Produtoteste
    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
}
