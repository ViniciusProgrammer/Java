package fundamentos;

import javax.swing.JOptionPane;

public class ifElse {
    public static void main(String[] args)
    {
        String valor = JOptionPane.showInputDialog("Informe um valor: ");
        int numero = Integer.parseInt(valor);

        if(numero % 2 == 0){
            JOptionPane.showMessageDialog(null, "Número par");
        }
        else{
            JOptionPane.showMessageDialog(null, "Número ímpar");
        }
    }
}
