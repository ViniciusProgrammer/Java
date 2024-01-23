package fundamentos;

public class tiposprimitivos {
    public static void main(String[] args){
        // Inforações de um funcionário

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L; // coloca-se o L no final para indicar que é um long

        // Tipos numéricos reais
        float salario = 11_445.44F; // coloca-se o F no final para indicar que é um float, por padrao o java entende que é um double qualquer numero com ponto flutuante
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // true
        char status = 'A'; // ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);
        // Número de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);

        System.out.println("Férias? " + estaDeFerias);

        System.out.println("Status: " + status);
    }
}
