package org.example.Dp_Proxy;

public class Proxy extends Abstraction {
    private AbstractionImpl abstraction;

    public Proxy(AbstractionImpl abstraction) {
        this.abstraction = abstraction;
    }

    @Override
    public void operation() {
      System.out.println("avant d'appliquer la méthode abstractImpl j'essaie un traitement ....");
      if(abstraction.getState()==0)abstraction.operation();
      else if(abstraction.getState()>0)abstraction.operation2();
      else if(abstraction.getState()<0)abstraction.operation3();
      else System.out.println("vérifier ton state.......");
      System.out.println("le traitement est fait  parfaitement....");
    }

}
