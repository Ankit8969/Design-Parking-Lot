package manager;

import ParkingLot.After.data.ParkingSpot;

import java.time.LocalDateTime;
import java.util.List;

public interface VehicleTypeManager {

    List<ParkingSpot> getParkingSpots();

    double getParkingFees(LocalDateTime durationInHours);
}
