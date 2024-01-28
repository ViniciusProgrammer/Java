package fundamentos;

public class logicos {
    public static void main(String[] args){
        boolean condicao1 = true;
        boolean condicao2 = 3 > 5;

        //operadores logicos
        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!condicao2);
        System.out.println(!!condicao1);
        System.out.println(condicao1 && !condicao2);
    }
}
