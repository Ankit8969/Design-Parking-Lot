package apis;

import data.Ticket;
import ParkingLot.After.payment.*;

import java.nio.channels.UnsupportedAddressTypeException;
import java.util.Map;

public class PayParkingFeesAPI {

    public boolean payParkingFee(Ticket ticket, PaymentMode paymentMode, Map<String,String> paymentDetails) {
        PaymentProcessor paymentProcessor = null;
        if(paymentMode.equals(PaymentMode.CARD)) {
            double amount = Double.parseDouble(paymentDetails.get("AMOUNT"));
            CardDetails cardDetails = null;
            // Logic to create above object
            paymentProcessor = PaymentProcessorFactory.getCardBasedPaymentProcessor(amount, cardDetails);
        }
        else  if(paymentMode.equals(PaymentMode.CASH)) {
            double amount = Double.parseDouble(paymentDetails.get("AMOUNT"));
            paymentProcessor = PaymentProcessorFactory.getCashBasedPaymentProcessor(amount);
        }else {
            throw new UnsupportedAddressTypeException();
        }

        return new ParkingFeeProcessor().processParkingFee(ticket, paymentProcessor);
    }
}
