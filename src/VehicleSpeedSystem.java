/*
Lab06 - Question04
Implement a Vehicle Speed Calculation System that computes the speed of different
types of vehicles. The system should support cars and bicycles, both of which are specific
types of vehicles.
• A Car has an engine capacity (CC) and a top speed (km/h).
• A Bicycle has a gear count and a maximum pedaling speed (km/h).
 */

class Vehicle {
    protected String vehicleName;

    public Vehicle() {
        this.vehicleName = "Unknown Vehicle";
    }

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle Name: " + vehicleName);
    }

    public double calculateSpeed() {
        return 0.0;
    }

    public double calculateSpeed(double factor) {
        return calculateSpeed() * factor;
    }
}

class Car extends Vehicle {
    private int engineCapacity;   // CC
    private double topSpeed;      // km/h

    public Car() {
        super("Standard Car");
        this.engineCapacity = 1500;
        this.topSpeed = 180.0;
    }

    public Car(String vehicleName, int engineCapacity, double topSpeed) {
        super(vehicleName);
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    @Override
    public double calculateSpeed() {
        return topSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Type: Car");
        System.out.println("Engine Capacity: " + engineCapacity + " CC");
        System.out.println("Top Speed: " + calculateSpeed() + " km/h");
    }
}

class Bicycle extends Vehicle {
    private int gearCount;
    private double maxPedalSpeed; // km/h

    public Bicycle() {
        super("Standard Bicycle");
        this.gearCount = 1;
        this.maxPedalSpeed = 20.0;
    }

    public Bicycle(String vehicleName, int gearCount, double maxPedalSpeed) {
        super(vehicleName);
        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;
    }

    @Override
    public double calculateSpeed() {
        return maxPedalSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Type: Bicycle");
        System.out.println("Gear Count: " + gearCount);
        System.out.println("Max Pedal Speed: " + calculateSpeed() + " km/h");
    }
}

public class VehicleSpeedSystem {
    public static void main(String[] args) {
        Car car = new Car();

        Bicycle bicycle = new Bicycle("Mountain Bike", 21, 35.5);

        double factor = 1.5;

        System.out.println("========== CAR ==========");
        car.displayVehicleDetails();
        System.out.println("calculateSpeed(): " + car.calculateSpeed() + " km/h");
        System.out.println("calculateSpeed(" + factor + "): " + car.calculateSpeed(factor) + " km/h");

        System.out.println();
        System.out.println("======== BICYCLE ========");
        bicycle.displayVehicleDetails();
        System.out.println("calculateSpeed(): " + bicycle.calculateSpeed() + " km/h");
        System.out.println("calculateSpeed(" + factor + "): " + bicycle.calculateSpeed(factor) + " km/h");

        System.out.println();
        System.out.println("===== BASE VEHICLE ======");
        Vehicle v = new Vehicle("Generic Vehicle");
        v.displayVehicleDetails();
        System.out.println("calculateSpeed(): " + v.calculateSpeed() + " km/h");
        System.out.println("calculateSpeed(" + factor + "): " + v.calculateSpeed(factor) + " km/h");
    }
}