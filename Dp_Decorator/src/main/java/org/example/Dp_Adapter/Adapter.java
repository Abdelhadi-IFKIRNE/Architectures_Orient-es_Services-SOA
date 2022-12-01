package org.example.Dp_Adapter;

public class Adapter implements Standard{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void operation() {
       adaptee.operation();
    }
}
