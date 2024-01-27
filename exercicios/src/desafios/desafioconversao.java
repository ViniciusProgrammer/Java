package desafios;
import java.util.Scanner;
public class desafioconversao {
    public static void main(String[] args){
        String valor1, valor2, valor3;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro salario: ");
        valor1 = entrada.nextLine().replace(",", ".");

        System.out.print("Digite o segundo salario: ");
        valor2 = entrada.nextLine().replace(",", "." );

        System.out.print("Digite o terceiro salario: ");
        valor3 = entrada.nextLine().replace(",", ".");

        double n1 = Double.parseDouble(valor1);
        double n2 = Double.parseDouble(valor2);
        double n3 = Double.parseDouble(valor3);
        double soma, media;
        soma = n1 + n2 + n3;
        media = (n1 + n2 + n3) / 3;

        System.out.println("A soma salario dos 3 salarios foi de " + (soma));
        System.out.println("A média salarial foi de " + (media));
        
        entrada.close();
    }
}
