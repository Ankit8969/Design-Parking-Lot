package payment;

public class CashPaymentProcessor implements PaymentProcessor{

    private final double amount;

    public CashPaymentProcessor(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public boolean executePayment() {
        return false;
    }
}
