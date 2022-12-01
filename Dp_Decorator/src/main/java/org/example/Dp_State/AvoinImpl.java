package org.example.Dp_State;

public class AvoinImpl implements IAvion{
    private State state;

    public AvoinImpl() {
        this.state = new EnPiste(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void decoler() {
        state.decoler();
    }

    @Override
    public void attirer() {
       state.attirer();
    }

    @Override
    public void enterAuGarge() {
       state.enterAuGarage();
    }

    @Override
    public void sortirAuGarge() {
         state.sortirDuGarage();
    }

    @Override
    public void doActivity() {
         System.out.println("***************** Do activity ****************");
    }
}
