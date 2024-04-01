package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        @SuppressWarnings({ "rawtypes" })
        HashSet conjunto = new HashSet();

        /*
         O conjunto HashSet não aceita tipos primitivos
         estamos passando valores primitivos abaixo mas por trás dos panos o java esta convertendo para 
         classes do tipo (Integer, Double, Caracter, Boolean ...)
         */
        conjunto.add(1);
        conjunto.add(true);
        conjunto.add(1.5);
        conjunto.add('x');
        conjunto.add("Teste");
        
        //Imprimindo o tamanho
        System.out.println("Tamanho = " + conjunto.size());

        // o remove retorna um True ou False caso tenha o valor passado dentro do conjunto
        conjunto.remove('x');

        // o Contains também retorna True ou False
        conjunto.contains("Teste");

        //podemos fazer dessa forma mas isso abrange outras restriçoes
        @SuppressWarnings("rawtypes")
        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //união de conjuntos
       // conjunto.addAll(nums);

        //System.out.println(conjunto);

        //System.out.println(conjunto.size());

        //inter-sessão
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        //limpar o conjunto
        conjunto.clear();
        System.out.println(conjunto);
    }   
}
