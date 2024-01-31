package fundamentos;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String texto = "";

        do{

            System.out.print("Deseja continuar? ");
            texto = scanner.nextLine();

        }while(!texto.equalsIgnoreCase("Não"));
        scanner.close();
    }
}
