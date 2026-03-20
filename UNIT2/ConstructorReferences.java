// Syntax: ClassName::new

class Student {
    Student(String name) {
        System.out.println("Welcome " + name);
    }
}

interface StudentFactory {
    Student create(String name);
}

public class ConstructorReferences {
    public static void main(String[] args) {

        // Lambda
        StudentFactory f1 = (name) -> new Student(name);

        // Constructor Reference
        StudentFactory f2 = Student::new;

        f2.create("Sonam");
    }
}


