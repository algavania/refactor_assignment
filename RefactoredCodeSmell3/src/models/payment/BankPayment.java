package models.payment;

public class BankPayment implements PaymentMethod {
    @Override
    public double calculateFee(double amount) {
        return 0.01 * amount;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer...");
    }
    
}
