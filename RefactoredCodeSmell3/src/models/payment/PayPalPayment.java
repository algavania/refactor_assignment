package models.payment;

public class PayPalPayment implements PaymentMethod {
    @Override
    public double calculateFee(double amount) {
        return 0.03 * amount;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment...");
    }
    
}
