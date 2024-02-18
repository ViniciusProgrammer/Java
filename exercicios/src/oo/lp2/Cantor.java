package oo.lp2;

public interface Cantor {
    
    String cantar();

    //como esse método é default podemos ter um corpo dentro dessa interface
    default String dancar(){
        return "Dançando de forma padrão";
    }
} 
