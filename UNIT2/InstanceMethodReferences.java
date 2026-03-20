// Syntax: object::instanceMethodName

class Message {
    public void show() {
        System.out.println("Hello from object");
    }
}

interface MyInterface {
    void display();
}
public class InstanceMethodReferences {
    public static void main(String[] args) {

        Message msg = new Message();

        // Lambda
        MyInterface obj1 = () -> msg.show();

        // Method reference
        MyInterface obj2 = msg::show;

        obj2.display();
    }
}


