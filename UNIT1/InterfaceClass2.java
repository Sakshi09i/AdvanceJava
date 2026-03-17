interface TestInterface {
    int VALUE = 10; // same as: public static final int VALUE = 10;
}

class Demo implements TestInterface {
    void show() {
        System.out.println("Value = " + VALUE);
    }
}
public class InterfaceClass2 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();

        // Can also be accessed directly using the interface name
        System.out.println(TestInterface.VALUE);
    }

}
