// Compile Time Polymorphism/ Static Polymorphism (Method Overloading) in Java occurs 
// when a class has multiple methods with the same name but different parameters 
// (different type, number, or both). 
// The correct method to call is determined at compile time based on the method signature.
//  This allows for code readability and flexibility.  

class MathOperation {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();

        System.out.println("Sum of two int: " + m.add(5, 10));
        System.out.println("Sum of three int: " + m.add(5, 10, 15));
        System.out.println("Sum of two double: " + m.add(2.5, 3.7));
    }
}


