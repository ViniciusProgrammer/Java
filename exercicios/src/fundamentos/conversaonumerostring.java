package fundamentos;

public class conversaonumerostring {
    public static void main(String[] args){
        Integer num = 10000;

        //convertendo inteiro para string
        System.out.println(num.toString());
        //mostrando o tamanho da string
        System.out.println(num.toString().length());

        int num2 = 10000;
        //Outra forma de converter inteiro para string
        System.out.println(Integer.toString(num2));
        System.out.println(Integer.toString(num2).length());
    }
}
