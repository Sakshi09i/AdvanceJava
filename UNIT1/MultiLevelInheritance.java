
// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class of Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Child class of Dog (Grandchild of Animal)
class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy is weeping.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        // Create object of Puppy class
        Puppy p = new Puppy();

        // Puppy can access methods from all levels
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // from Puppy
    }
}
