package fundamentos;

public class switch1 {
    public static void main(String[] args){
        String faixa = "verde";

        switch(faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
            default:
                System.out.println("Não sei de nada");
        }

        /*
         *Essa forma de switch é chamada de "fall through", onde ele executa todos os cases abaixo do case que foi entrado incluindo este
         */
    }
}
