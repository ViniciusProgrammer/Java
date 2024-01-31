package fundamentos;

import java.util.Scanner;

public class repeticaoindeterminada {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = entrada.nextLine();

        while(!palavra.equalsIgnoreCase("sair")){
            System.out.print("Digite uma palavra: ");
            palavra = entrada.nextLine();
        }

        System.out.println("Fim!");
        
        entrada.close();
    }
}
