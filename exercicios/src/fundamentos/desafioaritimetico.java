package fundamentos;

public class desafioaritimetico {
    public static void main(String[] args){
        int a = 5 * 4 - 12;

        //Converti para int devido ao Math.pow retornar um double por padrão
        int b = (int) Math.pow(a, 3);

        System.out.println(b);
    }
}
