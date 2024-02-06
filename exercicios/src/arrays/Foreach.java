package arrays;

public class Foreach {
    public static void main(String[] args){
        double [] notas = new double[3];
        notas[0] = 8.3;
        notas[1] = 7.1;
        notas[2] = 5.4;

        System.out.println("Com o foreach");

        for(double nota : notas){
            System.out.print(nota + " ");
        }
        System.out.println();
    }
}
