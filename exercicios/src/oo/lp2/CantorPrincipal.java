package oo.lp2;

public class CantorPrincipal {

    public void cantarAgora(Cantor cantor){
        System.out. println(cantor.cantar());
        System.out.println(cantor.dancar());
    }
    public static void main(String[] args){
        //forma padrão
        Cantor cantor = new MiltonNascimento();
        System.out.println(cantor.cantar());

        //forma que chama através do método acima.
        CantorPrincipal principal = new CantorPrincipal();
        principal.cantarAgora(new MiltonNascimento());
        principal.cantarAgora(new WesleySafadao());

        //podemos dessa forma criarmos quantos cantores quisermos que o método acima funcionará
    }
}
