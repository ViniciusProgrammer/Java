package fundamentos;

import java.util.Scanner;

public class igualdadestring {
    public static void main(String[] args){
        System.out.println("2" == "2");

        String s1 = new String("2");

        //forma errada e vai retornar false
        System.out.println("2" == s1);
        //forma correta e vai retornar true
        System.out.println("2".equals(s1));

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String s2 = entrada.nextLine();

        System.out.println(s1.equals(s2.trim()));
        
        /*trim() elimiina os espaços em branco antes e depois da string
         o equals() compara o conteúdo da string é igual
         o next() por padrão já tira os epsaços em branco antes e depois da string
         o nexLine() não tira os espaços
        */
    }
}
