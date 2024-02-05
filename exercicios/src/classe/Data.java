package classe;

public class Data {
    int dia; //obj
    int mes; //obj
    int ano; //obj

    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;

        //this(1, 1, 1970); Uma forma de chamar um construtor dentro de outro
    }

    Data(int dia, int mes, int ano){
    //this.objeto = parametro (esse é o molde que o this usa)
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String dataFormatada(){
        String data = dia + "/" + mes + "/" + ano;
        return data;
    }
}
