package org.example.Dp_Adapter;

public class Client {
    public static void main(String[] args) {
        Standard standard=new StandardImpl();
        standard.operation();
        Adaptee adaptee=new AdapteeImpl();
        standard=new Adapter(adaptee);
        standard.operation();
    }
}
