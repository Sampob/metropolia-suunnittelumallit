package Chain;

public class KorotusPyynto {
    private double amount;
    private double base;

    public KorotusPyynto(double amount, double base) {
        this.amount = amount;
        this.base = base;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

}
