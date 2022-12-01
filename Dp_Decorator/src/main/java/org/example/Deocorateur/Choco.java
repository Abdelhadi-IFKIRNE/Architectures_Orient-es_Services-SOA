package org.example.Deocorateur;

public class Choco extends Decorator{
    public Choco(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" avec Chocolat";
    }

    @Override
    public double getPrice() {
        return boisson.getPrice()+2.5;
    }
}
