package fundamentos;

public class tipostring {
    public static void main(String[] args){
        System.out.println("Olá mundo!".charAt(2));

        String s = "Bom dia";
        // Concatena conteudo com a string passada pela funcao concat
        System.out.println(s.concat("!!!"));
        //retorna true ou false se a string inicia com a palabra Bom ou não
        System.out.println(s.startsWith("Bom"));
        //Retorna true ou false se a string for exatamente igual ao que foi passado na função
        System.out.println(s.equals("Bom dia"));
        //Retorna true ou false se a string for igual ignorando o fato de ser maiuscula ou minuscula
        System.out.println(s.equalsIgnoreCase("bom dia"));
        System.out.println(s.length());

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        // %s = string, %d = inteiro, %f = float
        System.out.printf("%s %s tem %d anos e ganha R$ %.2f\n", nome, sobrenome, idade, salario);
    }
}
