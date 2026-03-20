// In case both the implemented interfaces contain default methods with same method signature,
//  the implementing class should explicitly specify which default method is to be used or it should override the default method.
interface InterfaceA {
    default void display() {
        System.out.println("Display from InterfaceA");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("Display from InterfaceB");
    }
}


class DefaultDemo implements InterfaceA, InterfaceB {
       public void display() {
        InterfaceA.super.display();
        InterfaceB.super.display();
    }

    public static void main(String[] args) {

        DefaultDemo obj = new DefaultDemo();
        obj.display();
    }
}

