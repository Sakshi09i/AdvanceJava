
sealed class Vehicle permits Car, Bike, Truck {
    void show() {
        System.out.println("This is a Vehicle");
    }
}

final class Car extends Vehicle {
    void show() {
        System.out.println("This is a Car");
    }
}

sealed class Bike extends Vehicle permits SportsBike, ElectricBike {
    void show() {
        System.out.println("This is a Bike");
    }
}


final class SportsBike extends Bike {
    void show() {
        System.out.println("This is a SportsBike");
    }
}

non-sealed class ElectricBike extends Bike {
 void show() {
        System.out.println("This is an Electric Bike");
    }
}


non-sealed class Truck extends Vehicle {
    void show() {
        System.out.println("This is a Truck");
    }
}

public class SealedClassDemo {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new SportsBike();
        Vehicle v3 = new ElectricBike();
        Vehicle v4 = new Truck();

        v1.show();
        v2.show();
        v3.show();
        v4.show();
    }
}
