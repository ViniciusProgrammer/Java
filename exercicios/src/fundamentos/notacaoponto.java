package fundamentos;
//A notação ponto manipula os metodos
public class notacaoponto {
    public static void main(String[] args){
        String s = "Bom dia";
        //Vai imprimir a string em maiusculo
        System.out.println(s.toUpperCase());
        //Vai imprimir a string em minusculo por que a funcão toUpperCase não altera a string original
        System.out.println(s);  
        //Substitui a string Bom por Otimo      
        System.out.println(s.replace("Bom", "Otimo"));
        //Vai imprimir a quantidade de caracteres da string ou seja retorna um inteiro
        System.out.println(s.length());

        //Tiois primitivos não tem o operador ponto
    }
}