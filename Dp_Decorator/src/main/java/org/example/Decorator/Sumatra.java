package org.example.Decorator;

public class Sumatra extends Boisson{
    @Override
    public String getDescription() {
        return " Boisson sumatra";
    }

    @Override
    public double getPrice() {
        return 4.5;
    }

}
