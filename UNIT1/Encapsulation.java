// Encapsulation in Java is a fundamental object-oriented programming concept 
// that involves bundling data (variables) and methods (functions) 
// that operate on the data into a single unit, typically a class. 
// It also restricts direct access to some of the object's components, 
// which is a means of preventing accidental interference and misuse of the data. 
// This is achieved through the use of access modifiers like private, protected, and public.

class Student {
    private String name;
    private int age;
    //Public getter and setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        } 
    } 
}
public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
