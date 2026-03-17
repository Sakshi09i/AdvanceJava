public class FinalMethod {
    
}
class Animal {
    final void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {      (Error)
void sound() {
        System.out.println("Dog barks");
    }
}

