package oo.lp2;

public class Operations {
    public void operate(String op){
        System.out.println("Operando sobre String...");
    }

    public void operate(int op){
        System.out.println("Operando sobre um inteiro...");
    }

    public void operate(double op){
        System.out.println("Operando sobre um double...");
    }

    public void operate(int ...op){
        System.out.println("Operando sobre varargs...");
    }
}
