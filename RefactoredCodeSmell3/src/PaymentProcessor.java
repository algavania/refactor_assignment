import models.payment.PaymentMethod;

public class PaymentProcessor {
    public double processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
        return paymentMethod.calculateFee(amount);
    }
}
