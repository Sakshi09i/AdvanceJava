// Static methods belong to the class rather than any instance of the class. 
// They can be called without creating an object of the class. 
// Static methods can only access static data members and 
// cannot refer to "this" or "super" keywords in any way.


// class Demo {
//     static void showMessage() {
//         System.out.println("Hello from static method!");
//     }

//     void display() {
//         System.out.println("This is a non-static method");
//     }
// }

// public class StaticMethod {
//     public static void main(String[] args) {
//         Demo.showMessage();  // No object needed
//         Demo d = new Demo();
//         d.display();         // Needs object
//     }
// }

class Parent {
    static void display() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Static method in Child");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display(); // Output: Static method in Parent
    }
}

