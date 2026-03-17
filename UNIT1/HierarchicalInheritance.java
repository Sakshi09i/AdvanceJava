
// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// First child class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Second child class
class Cat extends Animal {
    void meow() {
                System.out.println("The cat meows.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Dog object
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // own method

        // Cat object
        Cat c = new Cat();
        c.eat();   // inherited from Animal
        c.meow();  // own method
    }
}

