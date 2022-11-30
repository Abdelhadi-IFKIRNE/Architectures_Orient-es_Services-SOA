package org.example.Decorator;

public class Espresso extends Boisson{
    @Override
    public String getDescription() {
        return "Boisson espresso";
    }

    @Override
    public double getPrice() {
        return 5.5;
    }

}
