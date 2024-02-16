package oo.lp2;

public class Oficina {
    public static void main(String[] args){
        Oficina oficina = new Oficina();
        oficina.manter(new Bicicleta());

        Bicicleta b = new Bicicleta();
        b.trocarPedal();
    }

    public void manter(Veiculo veiculo){
        veiculo.checklist();
        veiculo.adjust();
        veiculo.cleanup();
    }
}
