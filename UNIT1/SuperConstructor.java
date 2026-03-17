// The super keyword can also be used to access the parent class constructor.
// One more important thing is that ‘super’ can call both parametric 
// as well as non-parametric constructors depending on the situation. 

// superclass Person
class Person {
    Person()
    {
        System.out.println("Person class Constructor");
    }
}
//subclass Student extending the Person class
class Student extends Person {
    Student()
    {
        // invoke or call parent class constructor
        super();

        System.out.println("Student class Constructor");
    }
}

// Driver Program
class SuperConstructor {
    public static void main(String[] args)
    {
        Student s = new Student();
    }
}





