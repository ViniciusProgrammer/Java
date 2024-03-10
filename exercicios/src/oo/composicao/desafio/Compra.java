package oo.composicao.desafio;

import java.util.List;
import java.util.ArrayList;

public class Compra {
    
    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int qtde){
        this.itens.add(new Item(p, qtde));
    }

    void adicionarItem(String nome, double preco, int quant){
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quant));
    }

    double obterValorTotal(){
        double total = 0;

        for(Item item: itens){
            total += item.quantidade *  item.produto.preco;
        }
        return total;
    }
}
