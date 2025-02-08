package payment;

import ParkingLot.After.data.Ticket;
import ParkingLot.After.manager.VehicleTypeManager;
import ParkingLot.After.manager.VehicleTypeManagerFactory;

import java.time.LocalDateTime;

public class ParkingFeeProcessor {

    public double getParkingFee(Ticket ticket) {
        LocalDateTime duration = ticket.getVehicle().getEntryTime();
        VehicleTypeManager vehicleTypeManager =  VehicleTypeManagerFactory.getVehicleTypeManager(ticket.getVehicle().getVehicleType());
        return vehicleTypeManager.getParkingFees(duration);
    }

    public boolean processParkingFee(Ticket ticket, PaymentProcessor paymentProcessor) {
        if(getParkingFee(ticket) != paymentProcessor.getAmount()) {
            throw new RuntimeException("");
        }

        return paymentProcessor.executePayment();
    }
}
