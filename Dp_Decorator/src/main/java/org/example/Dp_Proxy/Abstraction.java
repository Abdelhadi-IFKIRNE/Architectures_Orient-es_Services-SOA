package org.example.Dp_Proxy;

public abstract class Abstraction {
    private int state=0;
    public abstract void operation();

    public void operation2() {
     System.out.println("j'applique la methode opera 2");
    }

    public void operation3() {
        System.out.println("j'applique la methode opera 3");
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
