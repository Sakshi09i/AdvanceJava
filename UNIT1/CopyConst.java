
class CopyConst {
    String name;
    int age;

    // Parameterized constructor
    CopyConst(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    CopyConst(CopyConst s) {
        name = s.name;
        age = s.age;
   }
    

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
       CopyConst s1 = new CopyConst("Rahul", 20);   // normal object creation
       CopyConst s2 = new CopyConst(s1);            // copy constructor used

        s1.display();
        s2.display();
    }
}
