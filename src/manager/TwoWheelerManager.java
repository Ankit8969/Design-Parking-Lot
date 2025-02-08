package manager;

import ParkingLot.After.data.ParkingSpot;

import java.time.LocalDateTime;
import java.util.List;

public class TwoWheelerManager implements VehicleTypeManager{
    @Override
    public List<ParkingSpot> getParkingSpots() {
        return List.of();
    }

    @Override
    public double getParkingFees(LocalDateTime durationInHours) {
        return 0;
    }
}
