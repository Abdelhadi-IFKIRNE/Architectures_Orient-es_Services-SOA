package org.example;

import proxy.BankAccountService;
import proxy.BankAccountServiceService;
import proxy.Compte;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BankAccountService stub=new BankAccountServiceService().getBankAccountServicePort();
        System.out.println(stub.conversion(877));
    }
}