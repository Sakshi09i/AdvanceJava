// Constructor chaining is the process of calling one constructor 
// from another constructor with respect to the current object. 
// It can be done in two ways:
// 1. Within the Same Class → using this()
// 2. From the Parent Class → Child Classes ->using super()


// class Demo {
//     Demo() {
//         System.out.println("Default Constructor");
//     }

//     Demo(int x) {
//         this();   // Calls the default constructor
//         System.out.println("Parameterized Constructor: " + x);
//     }
// }


// public class ConstructorChaining1 {
//     public static void main(String[] args) {
//         Demo d = new Demo(10);
//     }

// }

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        super();   // Calls Parent constructor
        System.out.println("Child Constructor");
    }
}

public class ConstructorChaining1 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}



