package pt.up.fe.ldts.example3;

public class SimpleOrder {
    private Discount discount;
    private double price;

    public SimpleOrder(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        if (discount != null) {
            this.discount = discount;
        }
    }

    public double getTotal() {
        if (discount != null)
            discount.applyDiscount(price);
        return price;
    }

}
