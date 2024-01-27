package fundamentos;

import java.util.Scanner;

public class console {
    public static void main(String[] args){

        //Printando sem pular linha
        System.out.print("Bom");
        System.out.print(" dia!\n");

        System.out.println("Bom");
        System.out.println("Dia");

        System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);
        System.out.printf("Salário = %.2f\n", 2365.2645);

        //Entrada de dados pelo teclado
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Nome = " + nome + " " + sobrenome);

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos de idade\n", nome, sobrenome, idade);
        
        entrada.close();
    }
}
