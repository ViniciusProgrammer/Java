package colecoes;

import java.util.SortedSet;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class ConjuntoHomogenio {
    public static void main(String[] args){

        //Set<String> lista = new HashSet<String>();
        //para ordenar conforme a ordem de inserção.
        
        SortedSet<String> lista = new TreeSet<String>(); // <String> isso é Generics
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Bruna");
        lista.add("Rita");

        for(String nome : lista){
            System.out.print(nome + " ");
        }
        System.out.println();

        //normal Set
        Set<Integer> numeros = new HashSet<Integer>();
        numeros.add(45);
        numeros.add(38);
        numeros.add(90);
        numeros.add(23);
        numeros.add(11);

        for(Integer n : numeros){
            System.out.print(n + " ");
        }
        System.out.println();
    }   
}
