sealed class Person permits Employee, Student {
    void show(){
        System.out.println("Person");
    }
    
}

final class Employee extends Person{
    void show(){
        System.out.println("Employee");
    }
}

final class Student extends Person{
    void show(){
        System.out.println("Student");
    }
}

class Test{
    public static void main(String args[]){
        Person p = new Employee();
        p.show();
        Person p1 = new Student();
        p1.show();

    }
}
