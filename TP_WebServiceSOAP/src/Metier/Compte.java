package Metier;

public class Compte {
    private String code;
    private String name;
    private double balance;

    public Compte(String code, String name, double balance) {
        this.code = code;
        this.name = name;
        this.balance = balance;
    }

    public Compte() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
