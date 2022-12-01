package org.example.Dp_State;

public class EnPiste extends State{
    public EnPiste(AvoinImpl avoin) {
        super(avoin);
    }

    @Override
    void decoler() {
     System.out.println("Changement d'etat: Piste------>Aire");
     avoin.setState(new EnAire(avoin));
    }

    @Override
    void attirer() {
    System.out.println("faites attention, vous etes en psite ........!");
    }

    @Override
    void enterAuGarage() {
        System.out.println("Changement d'etat: Piste -----------------> Garage");
        avoin.setState(new AuGarage(avoin));
    }

    @Override
    void sortirDuGarage() {
        System.out.println("faites attention, vous etes en psite ........!");
    }
}
