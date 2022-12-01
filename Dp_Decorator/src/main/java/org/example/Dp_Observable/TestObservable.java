package org.example.Dp_Observable;

public class TestObservable {

    public static void main(String[] args) {
    ObservableImpl observable=new ObservableImpl();
    ObserverImpl observer=new ObserverImpl();
    ObserverImpl observer2=new ObserverImpl();
    ObserverImpl observer3=new ObserverImpl();
    ObserverImpl observer4=new ObserverImpl();
    System.out.println("----------avant les mises a jours----------");

    observer.getStatus();
    observer2.getStatus();
    observer3.getStatus();
    observer4.getStatus();

    observable.addObserver(observer);
    observable.addObserver(observer2);
    observable.addObserver(observer3);
    observable.addObserver(observer4);

    observable.setState(800);

    System.out.println("----------apres les mises a jours----------");


    observer.getStatus();
    observer2.getStatus();
    observer3.getStatus();
    observer4.getStatus();

    }
}
