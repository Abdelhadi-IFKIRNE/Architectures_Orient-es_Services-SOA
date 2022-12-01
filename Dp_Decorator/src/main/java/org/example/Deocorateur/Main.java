package org.example.Deocorateur;

public class Main {
    public static void main(String[] args) {
        Boisson boisson=new Espresso();
        System.out.println("*********************************************************");
        System.out.println(boisson.getDescription());
        System.out.println(boisson.getPrice());
        System.out.println("*********************************************************");
        Boisson b2=new Milke(boisson);
        System.out.println("*********************************************************");
        System.out.println(b2.getDescription());
        System.out.println(b2.getPrice());
        System.out.println("*********************************************************");
        Boisson b3=new Milke(new Milke(new Milke(new Choco(boisson))));
        System.out.println("*********************************************************");
        System.out.println(b3.getDescription());
        System.out.println(b3.getPrice());
        System.out.println("*********************************************************");
    }
}