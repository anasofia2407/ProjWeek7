package pt.up.fe.ldts.example3;


public class Percentage extends Discount {
    public Percentage(double discount) {
        super(discount);
    }

    @Override
    public double applyDiscount(double price) {
        return price - price * getDisc();
    }
}
