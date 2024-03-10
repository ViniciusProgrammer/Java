package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args){
    
        
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caderno", 18.65, 5);
        compra1.adicionarItem(new Produto("Notebook", 2499.99), 2);
        
        
        Compra compra2 = new Compra();
        compra2.adicionarItem("Mochila", 88.75, 5);
        compra2.adicionarItem(new Produto("Impressora", 799.50), 1);
        
        Cliente cliente = new Cliente("Ana Maria");
        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}
