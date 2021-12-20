package pt.up.fe.ldts.example3;

public abstract class Discount {
    private final double disc;

    public Discount(double disc) {
        this.disc = disc;
    }

    public double getDisc() {
        return disc;
    }

    public abstract double applyDiscount(double price);

}