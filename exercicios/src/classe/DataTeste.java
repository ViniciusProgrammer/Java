package classe;

public class DataTeste {
    public static void main(String[] args){
        Data data1 = new Data(31, 12, 2020);
        Data data2 = new Data();

        System.out.println("Utilizando o contrutor com parametrizado");
        System.out.println(data1.dataFormatada());

        System.out.println("Utilizando o contrutor padrão");
        System.out.println(data2.dataFormatada());
    }
}
