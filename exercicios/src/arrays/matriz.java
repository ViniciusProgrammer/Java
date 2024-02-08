package arrays;

import java.util.Scanner;
import java.util.Locale;

public class matriz {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de estudantes: ");
        int quantidade_alunos = scanner.nextInt();

        System.out.print("Informe a quantidade de notas por estudante: ");
        int quantidade_notas = scanner.nextInt();

        double [] [] notas_turma = new double [quantidade_alunos] [quantidade_notas];

        int soma = 0;
        for(int i = 0; i < notas_turma.length; i++){
            for(int j = 0; j < notas_turma[i].length; j++){
                System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
                notas_turma[i][j] = scanner.nextDouble();
                soma += notas_turma[i][j];
            }
        }
        double media = (double) soma / (quantidade_alunos * quantidade_notas);
        System.out.printf("A média da turma foi: %.2f\n", media);

        scanner.close();
    }
}
