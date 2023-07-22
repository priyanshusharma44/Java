// Parent class
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    void drive() {
        System.out.println("Driving a car");
    }
}

// Main class
public class DerivedInheritance {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive(); // Output: Driving a vehicle

        Car car = new Car();
        car.drive(); // Output: Driving a car

        Vehicle carAsVehicle = new Car();
        carAsVehicle.drive(); // Output: Driving a car
    }
}
