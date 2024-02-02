package classe;

import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args){
        Data data1 = new Data();
        Data data2 = new Data();

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira data: ");
        data1.dia = entrada.nextInt();
        data1.mes = entrada.nextInt();
        data1.ano = entrada.nextInt();

        System.out.print("Digite a segunda data: ");
        data2.dia = entrada.nextInt();
        data2.mes = entrada.nextInt();
        data2.ano = entrada.nextInt();

        System.out.println("Data 1: " + data1.dia + "/" + data1.mes + "/" + data1.ano);
        System.out.println("Data 2: " + data2.dia + "/" + data2.mes + "/" + data2.ano);

        entrada.close();
    }
}
