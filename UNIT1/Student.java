
// Example of a parameterized constructor in Java
public class Student {
    // Data members
    String name;
    int age;

    // Parameterized constructor
    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects using parameterized constructor
        Student s1 = new Student("Rahul", 20);
        Student s2 = new Student("Anita", 22);

        // Display details
        s1.display();
        s2.display();
    }
}
