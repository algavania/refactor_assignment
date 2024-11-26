package models;
public class Discount {
    private String code;

    public double apply(double price) {
        if (code.equals("DISC10")) {
            return price * 0.10;
        } else if (code.equals("DISC20")) {
            return price * 0.20;
        } else {
            return 0;
        }
    }
}
