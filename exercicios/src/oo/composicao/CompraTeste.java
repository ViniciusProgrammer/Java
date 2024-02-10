package oo.composicao;

public class CompraTeste {
    public static void main(String[] args){
        Compra compra1 = new Compra();
        compra1.cliente = "Vinicius";
        compra1.itens.add(new Item("caneta", 20, 7.45));
        compra1.itens.add(new Item("borracha", 12, 4.89));
        compra1.itens.add(new Item("caderno", 5, 23.50));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.valorTotal());
    }
}
