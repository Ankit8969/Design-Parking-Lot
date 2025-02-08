package data;

public class ParkingSpot {
    /**
     * floorNum - Since we have multiple floor
     * vehicleTYpe -> 2W, 4W, Heavy
     * name -> 1A, 1B (spot details)
     * isFree -> checking for availability
     */
    private final String floorNum;
    private final VehicleType vehicleType;
    private final String name;
    private final boolean isFree;

    public ParkingSpot(String floorNum, VehicleType vehicleType, String name, boolean isFree) {
        this.floorNum = floorNum;
        this.vehicleType = vehicleType;
        this.name = name;
        this.isFree = isFree;
    }

    public String getFloorNum() {
        return floorNum;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getName() {
        return name;
    }

    public boolean isFree() {
        return isFree;
    }
}
