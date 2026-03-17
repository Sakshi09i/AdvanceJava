public class FinalClass {
    
}
final class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Error: cannot subclass final class
class Car extends Vehicle {
    void run() {
        System.out.println("Car is running");
    }
}
