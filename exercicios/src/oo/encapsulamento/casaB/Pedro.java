package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{

    //Não poderei ter acesso se criar uma instância de Ana que é a classe herdada
    //posso acessar diretamente sem ser pela instancia

    void testeAcessos(){
        System.out.println(todosSabem);
        System.out.println(formaDeFalar);
    }
}
