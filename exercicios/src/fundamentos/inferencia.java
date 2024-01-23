package fundamentos;

public class inferencia {
    public static void main(String[] args){
        double a = 4.5;
        System.out.println(a);

        // Ao utilizar o var, o java infere o tipo da variável
        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);
    }
    /*
      O java é uma linguagem fortemente tipada, ou seja, uma variável só pode
      receber um tipo de dado e não pode ser alterado depois de definida.
     */
}
