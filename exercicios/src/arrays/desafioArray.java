package arrays;

import java.util.Locale;
import java.util.Scanner;

public class desafioArray {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        int quantidade, soma = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas que deseja inserir: ");
        quantidade = scanner.nextInt();
        
        double[] notas = new double[quantidade];

        for(int i = 0; i < quantidade; i++){
            System.out.print("Digite a nota " + i + 1 + ": ");
            notas[i] = scanner.nextDouble();
        }

        for(double nota : notas){
            soma += nota;
        }

        System.out.printf("A média foi = %.1f", (double)soma / quantidade);
        System.out.println();

        scanner.close();
    }
}
