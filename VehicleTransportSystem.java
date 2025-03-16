// Superclass
class Vehicle {
    // Class attributes
    protected int maxSpeed;
    protected String fuelType;

    // Constructor
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Max Speed (in kmph): " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass
class Car extends Vehicle {
    // Class attributes
    private int seatCapacity;

    // Constructor
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        // Calling superclass constructor
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Method to display car details
    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        // Calling superclass method
        super.displayDetails();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass
class Truck extends Vehicle {
    // Class attributes
    private int cargoCapacity;

    // Constructor
    public Truck(int maxSpeed, String fuelType, int cargoCapacity) {
        // Calling superclass constructor
        super(maxSpeed, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    // Method to display truck details
    @Override
    public void displayDetails() {
        System.out.println("Truck Details:");
        // Calling superclass method
        super.displayDetails();
        System.out.println("Cargo Capacity (in litres): " + cargoCapacity);
    }
}

// Subclass
class Motorcycle extends  Vehicle {
    // Class attributes
    private String modelYear;

    // Constructor
    public Motorcycle(int maxSpeed, String fuelType, String modelYear) {
        // Calling superclass constructor
        super(maxSpeed, fuelType);
        this.modelYear = modelYear;
    }

    // Method to display motorcycle details
    @Override
    public void displayDetails() {
        System.out.println("Motorcycle Details:");
        // Calling superclass method
        super.displayDetails();
        System.out.println("Model Year: " + modelYear);
    }
}

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        // Storing objects of subclasses in array
        vehicles[0] = new Car(140, "Petrol", 5);
        vehicles[1] = new Truck(80, "Diesel", 400);
        vehicles[2] = new Motorcycle(300, "Petrol", "2024");

        // Calling displayDetails() method dynamically
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
        }
    }
}

/*
Output:
    Car Details:
    Max Speed (in kmph): 140
    Fuel Type: Petrol
    Seat Capacity: 5
    Truck Details:
    Max Speed (in kmph): 80
    Fuel Type: Diesel
    Cargo Capacity (in litres): 400
    Motorcycle Details:
    Max Speed (in kmph): 300
    Fuel Type: Petrol
    Model Year: 2024
 */