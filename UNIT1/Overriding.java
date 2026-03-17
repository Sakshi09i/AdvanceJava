// RunTime Polymorphism (Method Overriding) in Java occurs 
// when a subclass provides a specific implementation of a method that is already defined in its superclass.
// The method in the subclass must have the same name, return type, and parameters as the method in the superclass.
// This allows for dynamic method dispatch, where the method to be called is determined 
// at runtime based on the actual object type, rather than the reference type.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        super.sound(); // Call the superclass method (optional) Animal method
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();  // Upcasting to Dog
        a.sound();      // Dog barks

        a = new Cat();  // Upcasting
        a.sound();      // Cat meows
    }
}




