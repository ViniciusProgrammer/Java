package arrays;

import java.util.Arrays;
public class Exercicios {
    public static void main(String[] args){
        double [] notasAlunoA = new double[3];

        notasAlunoA[0] = 8.3;
        notasAlunoA[1] = 7.1;
        notasAlunoA[2] = 5.4;

        System.out.println(Arrays.toString(notasAlunoA));
        int total = 0;
        double media = 0.0;
        for(int i = 0; i < notasAlunoA.length; i++){
            media+= notasAlunoA[i];
            total+= 1;
            System.out.println(notasAlunoA[i]);
        }

        System.out.println("A média foi = " + media / total);
    }
}
