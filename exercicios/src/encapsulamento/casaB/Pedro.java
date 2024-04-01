package encapsulamento.casaB;

import encapsulamento.casaA.Ana;

public class Pedro extends Ana{
    
    void testeAcessos(){

        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
        System.out.println(new Ana().todosSabem);
    }
}
