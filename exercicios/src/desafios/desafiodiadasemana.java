package desafios;

import java.util.Locale;
import java.util.Scanner;

public class desafiodiadasemana {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String dia = entrada.next();

        if(dia.equals("Domingo") || dia.equals("domingo")){
            System.out.println(1);
        }
        else{
            if(dia.equals("Segunda") || dia.equals("segunda")){
                System.out.println(2);
            }
            else if(dia.equals("Terça") || dia.equals("terça") 
            || dia.equals("Terca") || dia.equals("terca")){
                System.out.println(3);
            }
            else if(dia.equals("Quarta") || dia.equals("quarta")){
                System.out.println(4);
            }
            else if(dia.equals("Quinta") || dia.equals("quinta")){
                System.out.println(5);
            }
            else if(dia.equals("Sexta") || dia.equals("sexta")){
                System.out.println(6);
            }
            else if(dia.equals("Sábado") || dia.equals("sábado")
            || dia.equals("Sabado") || dia.equals("sabado")){
                System.out.println(7);
            }
            else{
                System.out.println("Dia inválido");
            }
        }
        System.out.println("Fim do programa");
        entrada.close();
    }
}
