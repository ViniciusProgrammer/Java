package fundamentos;

import java.util.Scanner;

public class wappers {
    //A versao objeto dos tipos primitivos
    public static void main(String[] args){
        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L;

        System.out.println(i);

        Scanner entrada = new Scanner(System.in);

        //convertendo uma string para um inteiro
        Integer x = Integer.parseInt(entrada.nextLine());

        //Irá imprimir justamente o valor primitivo que esta associado ao objeto b
        System.out.println(b.byteValue());
        System.out.println(s.toString()); // irá imprimir o valor como string
        System.out.println(x);

        System.out.println(l / 3.0);

        //Convertendo uma string para um boolean
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);

        //Convertendo um boolean para uma string
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c + "...");

        Float f = 123.0F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        entrada.close();
    }
}
