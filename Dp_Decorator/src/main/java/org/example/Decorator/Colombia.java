package org.example.Decorator;

public class Colombia extends Boisson{
    @Override
    public String getDescription() {
        return " Boisson Colombia";
    }

    @Override
    public double getPrice() {
        return 3.5;
    }

}
