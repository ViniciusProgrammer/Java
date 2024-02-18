package oo.lp2;

public class WesleySafadao implements Cantor{

    public String cantar(){
        return "Ar condicionado no quinze";
    }

    @Override
    public String dancar(){
        String padrao = Cantor.super.dancar();
        return padrao + " Wesley";
    }
}
