// Example of single inheritance in Java
class Person {
    void displayInfo() {
        System.out.println("I am a person.");
    }
}

// Child class (inherits from Person)
class Student extends Person {
    void displayStudent() {
        System.out.println("I am a student.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        // Create object of Student
        Student s = new Student();

        // Child class can access both parent and its own methods
        s.displayInfo();     // from Person class
        s.displayStudent();  // from Student class
    }
}

