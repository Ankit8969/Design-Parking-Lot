package payment;


public class CardPaymentProcessor implements PaymentProcessor{

    private final double amount;
    private final CardDetails cardDetails;

    public CardPaymentProcessor(double amount, CardDetails cardDetails) {
        this.amount = amount;
        this.cardDetails = cardDetails;
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public boolean executePayment() {
        /**
         * Business logic for Card Payment
         */
        return true;
    }
}
