package pl.javadeveloper.solid.liskov;

public class PromoAccount extends Account {
    private int months = 0;

    @Override
    public boolean close() {
        if (getBalance() > 0.0 && months > 3) { // Violation - precondition is strengthened by a subtype
            return true;
        }
        return false;
    }

    public void setMonths(int months) {
        this.months = months;
    }
}
