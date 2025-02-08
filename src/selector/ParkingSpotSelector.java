package selector;

import ParkingLot.After.data.ParkingSpot;

import java.util.List;

public interface ParkingSpotSelector {
    ParkingSpot getParkingSpot(List<ParkingSpot> parkingSpots);
}
