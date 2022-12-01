package org.example.Dp_Observable;

public class ObserverImpl implements Observer {
    private int state=0;
    @Override
    public void update(Observable observable) {
       System.out.println("changement d'etat de  :"+state);
       state=((ObservableImpl)observable).getState();
       System.out.println(" vers :---->"+state);
    }

    public void getStatus(){
        System.out.println("the new state is :"+state);
    }
}
