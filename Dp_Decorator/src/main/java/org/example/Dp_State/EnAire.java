package org.example.Dp_State;

public class EnAire extends State{
    public EnAire(AvoinImpl avoin) {
        super(avoin);
    }

    @Override
    void decoler() {
    System.out.println("faite attention, vous etes deja en aire .......!!");
    }

    @Override
    void attirer() {
        System.out.println("Changement d'état: Aire--------->Piste");
        avoin.setState(new EnPiste(avoin));
    }

    @Override
    void enterAuGarage() {
        System.out.println("faite attention, vous etes deja en aire .......!!");
    }

    @Override
    void sortirDuGarage() {
        System.out.println("faite attention, vous etes deja en aire .......!!");
    }
}
