package pt.up.fe.ldts.example3;

public class Fixed extends Discount{
    public Fixed(double fixed) {
        super(fixed);
    }

    @Override
    public double applyDiscount(double price) {
        return price - getDisc();
    }
}

