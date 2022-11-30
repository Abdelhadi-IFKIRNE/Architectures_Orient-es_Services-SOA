package org.example.Decorator.Dp_Composite;

public abstract class Composant {
    protected int level=0;
    protected String description;
   public abstract void operation();

    public Composant(String description) {
        this.description = description;
    }
}
