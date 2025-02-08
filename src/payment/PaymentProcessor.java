package payment;

public interface PaymentProcessor {
    public boolean executePayment();
    double getAmount();
}
