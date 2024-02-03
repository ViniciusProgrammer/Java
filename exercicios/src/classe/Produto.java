package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

      //Construtor padrão para produto y lá na classe Produtoteste
      Produto(){

      }

    //COntrutor com parametros para produto x lá na classe Produtoteste
    Produto(String nomeInicial, double precoInicial, double descontoInicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
}
