package models.payment;

public interface PaymentMethod {
    double calculateFee(double amount);
    void processPayment(double amount);
}