package org.example.Dp_State;

public class AuGarage extends State {
    public AuGarage(AvoinImpl avoin) {
        super(avoin);
    }

    @Override
    void decoler() {
        System.out.println("Impossible de decoler, vous etes deja au garage....");
    }

    @Override
    void attirer() {
        System.out.println("Impossible d'attirir, vous etes deja au garage....");
    }

    @Override
    void enterAuGarage() {
        System.out.println("vous etes deja au garage....");
    }

    @Override
    void sortirDuGarage() {
        System.out.println("Changement d'etat : garage -------> Piste");
        avoin.setState(new EnPiste(avoin));
    }
}
