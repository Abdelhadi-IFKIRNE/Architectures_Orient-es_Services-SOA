package org.example.Decorator;

public class Milke extends Decorator{
    public Milke(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" avec milke";
    }

    @Override
    public double getPrice() {
        return boisson.getPrice()+1.5;
    }

}
