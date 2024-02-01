package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class switch2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        int nota = scanner.nextInt();

       switch(nota){ // o switch só aceita inteiros, strings e enums (a partir do java 7)
            case 1: case 2:
                System.out.println("Conceito E");
                break;
            case 3: case 4:
                System.out.println("Conceito D");
                break;
            case 5: case 6:
                System.out.println("Conceito C");
                break;
            case 7: case 8:
                System.out.println("Conceito B");
                break;
            case 9: case 10:
                System.out.println("Conceito A");
                break;
            default:
                System.out.println("Nota inválida"); // o break é opcional
       }
       scanner.close();
    }
}
