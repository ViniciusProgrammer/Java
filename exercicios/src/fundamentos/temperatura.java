package fundamentos;

public class temperatura {
    public static void main(String[] args){
        final double fator1 = 5.0/9.0;
        final int fator2 = 32;
        double temperatura = 97;
        char escala = 'C';
        double resultado = (temperatura - fator2) * fator1;
        
        System.out.println( "O resultado foi = " + resultado + " " + escala);
    }
}
