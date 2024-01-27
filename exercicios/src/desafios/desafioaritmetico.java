package desafios;

public class desafioaritmetico {
    public static void main(String[] args){
        int a, expA, divExpA,
        expressaoA, b, expB, expressaoB,
        geral, divGeral, potSomaExpressao;
        
        a = (6 * (3 + 2));
        expA = (int) Math.pow(a, 2);
        divExpA = 3 * 2;
        expressaoA = (int) expA / divExpA;

        b = ((1 - 5) * (2 - 7)) / 2;
        expB = (int) Math.pow(b, 2);
        expressaoB = (int) expB;

        System.out.println(expressaoA);
        System.out.println(expressaoB);

        potSomaExpressao = (expressaoA - expressaoB);
        potSomaExpressao = (int) Math.pow(potSomaExpressao, 3);

        divGeral = (int)Math.pow(10, 3);
        geral = (potSomaExpressao) / divGeral;

        System.out.println("Resultado foi  = " + geral);
    }
}
