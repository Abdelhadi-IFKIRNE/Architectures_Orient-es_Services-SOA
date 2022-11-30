package org.example.Decorator;

public abstract class Decorator extends Boisson{
    protected Boisson boisson;

    public Decorator(Boisson boisson) {
        this.boisson = boisson;
    }

    public abstract String getDescription();
    public abstract double getPrice();
}
