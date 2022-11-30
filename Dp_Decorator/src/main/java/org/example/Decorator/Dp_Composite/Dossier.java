package org.example.Decorator.Dp_Composite;

import java.util.ArrayList;
import java.util.List;

public class Dossier extends Composant {
    protected List<Composant> composants=new ArrayList<>();

    public Dossier(String description) {
        super(description);
    }

    public void addComposant(Composant composant){
        composant.level=this.level+1;
        composants.add(composant);
    }
    public void removeComposant(Composant composant){
        composants.remove(composant);
    }
    public List<Composant> getChilds(){
        return composants;
    }

    @Override
    public void operation() {
        StringBuilder tab= new StringBuilder(" ");
        for (int i = 0; i < level; i++) tab.append("--");
        System.out.println(tab+description);
        for (Composant c:composants)
            c.operation();
    }
}
