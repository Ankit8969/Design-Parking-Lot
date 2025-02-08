# 🚗 Parking Lot Low-Level Design (LLD)
This repository contains the Low-Level Design (LLD) of a Parking Lot System, designed to efficiently allocate parking spaces, manage vehicle entries/exits, and calculate parking fees.

## 📌 Requirements
- The user can Park the Car.
- The system should return a Parking Slot on entry.
- The user should be able to Unpark the car at any time.
- The system should calculate the Parking Fee.
- Support for multiple parking strategies (e.g., random allocation, nearest slot allocation).
- Different Parking Slot sizes based on vehicle type.
- Payment method Cash or Card should be supported.

## 🏗 High-Level APIs
The system provides the following APIs:

- ParkingSpot getParkingSpotAPI(ParkingVehicle, random/nearest) → Assigns a parking spot.
- void releaseParkingSpotAPI(ParkingSpot) → Releases a parking spot when a vehicle leaves.
- double getParkingFeeAPI(Vehicle vehicle, ParkingSpot spot) → Calculates the fee.
- List<ParkingSpot> getAllEmptySpotAPI() → Fetches all empty parking spots.
- void configureParkingStrategy() → Configures the parking spot allocation strategy.


## 📂 Entities
The key entities involved in the system are:

- Vehicle → Represents the vehicle entering the parking lot.
- Parking Spot → Represents a parking slot assigned to a vehicle.
- Parking Manager → Manages parking spot allocation and fee calculations.
- Payment → Handles parking fee payments.


## 🔍 Data Classes & Enums

- Vehicle Class
 Stores details like vehicle number, type (Car, Bike, Truck), and entry time.
- ParkingSpot Class
 Holds information about a specific parking spot, its size, and availability.
- ParkingStrategy Enum
Defines different strategies for slot allocation (Random, Nearest).
- ParkingFeeStrategy Enum
Defines different fee calculation strategies.


## ⚙ Design Patterns Used
The system leverages multiple design patterns for better scalability:

- Strategy Pattern → Used for dynamic parking allocation strategies.
- Factory Pattern → Used for creating different vehicle and spot types.


## 📜 API Implementations
- getParkingSpotAPI
Assigns a parking spot based on the vehicle type and selected strategy.
- releaseParkingSpotAPI
Marks the parking spot as available when the vehicle exits.
- getParkingFeeAPI
Calculates parking fees based on the duration of the vehicle's stay.
- getAllEmptySpotAPI
Returns a list of available parking spots.


## 💰 Payment Methods
The system supports multiple payment methods:

- Cash
- Card
