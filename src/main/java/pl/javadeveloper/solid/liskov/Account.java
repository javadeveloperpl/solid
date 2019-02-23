package pl.javadeveloper.solid.liskov;

public class Account {
    private double balance = 0.0;

    public boolean close() {
        if (balance > 0.0) {
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
