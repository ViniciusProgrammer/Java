package oo.lp2;

public class Automovel extends Veiculo{
    
    @Override
    public void checklist(){
        System.out.println("Automóvel::checklist");
    }

    @Override
    public void adjust(){
        System.out.println("Automóvel::adjust");
    }

    @Override
    public void cleanup(){
        System.out.println("Automóvel::cleanup");
    }
}
