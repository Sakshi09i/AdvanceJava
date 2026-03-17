// Abstract class in Java is a class that cannot be instantiated and is often used as a base class for other classes.
// It can contain abstract methods (methods without a body) that must be implemented by subclasses, 
// as well as concrete methods (methods with a body). Abstract classes are declared using the `abstract` keyword.
abstract class Animal {
    // Abstract method (no body)
    abstract void sound();

    // Non-abstract method
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}



public class AbstractClass {
    public static void main(String[] args) {
        Animal a = new Dog();  // upcasting
        a.sound();  // Dog barks
        a.eat();    // This animal eats food
    }

}
