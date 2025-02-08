package apis;

import data.ParkingSpot;
import vacator.ParkingSpotVacator;

public class VacateParkingSpotAPI {

    public boolean vacateParkingSpot(ParkingSpot parkingSpot) {
        try {
            new ParkingSpotVacator().vacateParkingSpot(parkingSpot);
            return true;
        }catch (Exception e) {
            throw e;
        }

    }

}
