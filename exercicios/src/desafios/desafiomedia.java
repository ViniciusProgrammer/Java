package desafios;

import java.util.Locale;
import java.util.Scanner;

public class desafiomedia {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int quantidade = 0;
        double media = 0.0, nota = 0;  

        while(nota != -1){
            System.out.print("Digite a nota: ");
            nota = scanner.nextDouble();
            
            if(nota >= 0 && nota <= 10.0){
                media += nota;
                quantidade++;
            }
            else if(nota > 10.0 || nota < -1){
                System.out.println("Nota inválida!");
                System.out.print("Digite a nota novamente: ");
                nota = scanner.nextDouble();
            }
        }
        System.out.printf("A média da turma foi igual %.1f\n", media/quantidade);
        scanner.close();
    } 
}
