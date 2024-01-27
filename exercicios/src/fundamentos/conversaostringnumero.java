package fundamentos;

import javax.swing.JOptionPane;

public class conversaostringnumero {
    public static void main(String[] args){
        String valor1 = JOptionPane.showInputDialog(
            "Digite o primeiro numero: ");
        String valor2 = JOptionPane.showInputDialog(
            "Digite o segundo numero: ");
        //concatenando strings
        System.out.println(valor1 + valor2);
        double n1 = Double.parseDouble(valor1); 
        double n2 = Double.parseDouble(valor2);

        System.out.println("A SOMA VALE = " + (n1 + n2));
        System.out.println("A MÉDIA VALE = " + (n1 + n2) / 2);
    }
}
