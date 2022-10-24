package ws;

public class Compte {
    private int code;
    private double balance;
    private String type;

    public Compte() {
    }

    public Compte(int code, double balance, String type) {
        this.code = code;
        this.balance = balance;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
