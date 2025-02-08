package data;

import ParkingLot.After.apis.Vehicle;

public class TicketGenerator {
    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        String ticketNum = getUniqueTicketNum();
        /**
         * Here we have to write our logic to check parkingSpot is empty or not.
         */
        return new Ticket(ticketNum, vehicle, parkingSpot);
    }

    private String getUniqueTicketNum() {
        return "";
    }
}
