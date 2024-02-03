package classe;

public class Produtoteste {
    public static void main(String[] args){
        //Construtor com parametros para produto x
        Produto x = new Produto("Imprenssora", 3560.50, 0.30);

        //x.nome = "Imprenssora";
        //x.preco = 3560.50;
        //x.desconto = 0.30;

        //Construtor padrão para produto y
        var y = new Produto();
        
        y.nome = "Monitor";
        y.preco = 750.89;
        y.desconto = 0.15;

        System.out.println(x.nome);
        System.out.println(y.nome);

        System.out.println("\nValores individuais dos produtos\n");

        System.out.println(x.nome + " = " + x.preco);
        System.out.println(y.nome + " = " + y.preco);

        double precofinal = x.precoComDesconto();
        double precofinal2 = y.precoComDesconto();
        double mediaCarrinho = (precofinal + precofinal2) / 2;

        System.out.printf("Media do carrinho = %.2f\n", mediaCarrinho);
    }
}
