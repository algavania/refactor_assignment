package models.payment;

public class UnknownPayment implements PaymentMethod {
    @Override
    public double calculateFee(double amount) {
        return 0.0;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Unknown payment method.");
    }
    
}
