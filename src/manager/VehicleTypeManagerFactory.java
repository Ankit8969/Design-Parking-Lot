package manager;

import ParkingLot.After.data.VehicleType;

public class VehicleTypeManagerFactory {
    private VehicleTypeManagerFactory(){};

    public static VehicleTypeManager getVehicleTypeManager(VehicleType vehicleType) {
        VehicleTypeManager vehicleTypeManager;
        if (vehicleType == null) {
            throw new IllegalArgumentException("VehicleType cannot be null");
        }

        if (vehicleType.equals(VehicleType.TWO_WHEELER)) {
            vehicleTypeManager = new TwoWheelerManager();
        } else if (vehicleType.equals(VehicleType.FOUR_WHEELER)) {
            vehicleTypeManager = new FourWheelerManager();
        } else if (vehicleType.equals(VehicleType.HEAVY)) {
            vehicleTypeManager = new HeavyVehicleManager();
        } else {
            throw new UnsupportedOperationException(
                    "We don't have support for this vehicle type: " + vehicleType
            );
        }
        return vehicleTypeManager;
    }

}
