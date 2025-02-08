package payment;

public class CardDetails {
    private final String name;
    private final String cardNumber;
    private final int pin;

    public CardDetails(String name, String cardNumber, int pin) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.pin = pin;
    }
}
