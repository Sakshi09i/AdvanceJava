// Static Variables are shared among all instances of a class. 
// They belong to the class rather than any specific instance, 
// and they can be accessed using the class name without creating an object.
class Student {
    int rollNo;
    String name;
    static String college = "ABC College"; // static variable

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Riya");
        Student s2 = new Student(2, "Aman");

        s1.display();
        s2.display();
    }
}




