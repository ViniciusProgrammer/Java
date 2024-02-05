package classe;

public class valorvsreferencia {
    public static void main(String[] args) {

        //Atribuição por valor
        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(14, 7, 2013);
        Data d2 = d1;

        d1.dia = 19;
        d2.mes = 3;
        d1.ano = 1978;

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

        //utilizando uma função para setar a data padrão
        voltarDataPadrao(d1);

        System.out.println();

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

        int c = 5;
        alterarPrimitivo(c); //Nao altera o valor de c por ser um tipo primitivo
        System.out.println(c);
    }

    static void voltarDataPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int x){
        x++;
    }
}
