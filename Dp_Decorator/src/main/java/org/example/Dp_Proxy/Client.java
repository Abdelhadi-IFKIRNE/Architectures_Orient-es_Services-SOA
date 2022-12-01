package org.example.Dp_Proxy;

public class Client {
    public static void main(String[] args) {
        Abstraction abstraction1=new AbstractionImpl();
        Abstraction abstraction=new Proxy((AbstractionImpl) abstraction1);
        abstraction.operation();
        abstraction1.setState(20);
        Abstraction abstraction2=new Proxy((AbstractionImpl) abstraction1);
        abstraction2.operation();
    }
}
