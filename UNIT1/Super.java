
// This scenario occurs when a derived class and base class have the same data members. 
// In that case, there is a possibility of ambiguity for the JVM
class Vehicle {
    int maxSpeed = 120;
}

// sub class Car extending vehicle
class Car extends Vehicle {
    int maxSpeed = 180;

    void display()
    {
        // print maxSpeed from the vehicle class 
        // using super
        System.out.println("Maximum Speed: "+ super.maxSpeed);
    }
}

class Super {
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
    }
}

