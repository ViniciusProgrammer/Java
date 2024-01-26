package fundamentos;

public class conversaotiposnumericosprimitivos {
    public static void main(String[] args){
        //Conversão implicita
        double a = 1;
        System.out.println(a);

        //Conversão explicita
        float x = (float) 1.5; // outra solução é colocar o f no final do número dessa forma 1.5f
        System.out.println(x);

        //Conversão explicita
        int y = 4;
        byte z = (byte) y;
        //vai imprimit normalmente o valor 4 pois o range é de -128 a 127
        System.out.println(z);

        double w = 1.999999;
        int w2 = (int) w;
        System.out.println(w2);
    }
}
