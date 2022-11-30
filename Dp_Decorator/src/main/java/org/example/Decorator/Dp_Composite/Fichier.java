package org.example.Decorator.Dp_Composite;

public class Fichier extends Composant{
    public Fichier(String description) {
        super(description);
    }

    @Override
    public void operation() {
        StringBuilder tab= new StringBuilder(" ");
        for (int i = 0; i <level ; i++) tab.append("--");
        System.out.println(tab+" "+description);
    }
}
