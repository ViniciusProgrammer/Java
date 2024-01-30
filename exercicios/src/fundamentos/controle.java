package fundamentos;

import java.util.Scanner;

//só consegui utilizando int, double não funcionou
public class controle {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        int media = entrada.nextInt();

        if(media <= 100 && media >= 70){
            System.out.println("Aprovado!");
            System.out.println("Parabéns!");
        }

       if(media < 70 && media >= 45){
            System.out.println("Recuperação!");
        }

        if(media < 45 && media >= 0){
            System.out.println("Reprovado!");
        }
        
        entrada.close();
    }
}

/*

OUTRA FORMA DE FAZER

 package fundamentos;

import javax.swing.JOptionPane;
//só consegui utilizando int, double não funcionou com Scanner
public class controle {
    public static void main(String[] args){
        String valor = JOptionPane.showInputDialog("Informe a nota: ");
        Double nota = Double.parseDouble(valor);

        if(nota >= 7.0){
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
        else if(nota >= 5.0 && nota < 7.0){
            JOptionPane.showMessageDialog(null, "Recuperação");
        }
        else{
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}

 */