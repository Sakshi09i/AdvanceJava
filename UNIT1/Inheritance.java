class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (inherits Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        // Create object of Dog class
        Dog d = new Dog();

        // Dog can use both its own method and inherited method
        d.eat();   // from Animal class
        d.bark();  // from Dog class
    }

}
