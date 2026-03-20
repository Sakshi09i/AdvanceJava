
interface DefaultMethod {
    default void status() {
        System.out.println("Printer is ready");
    }

    void print();   // abstract method
}

class HP implements DefaultMethod{
    public void print() {
        System.out.println("Printing document");
    }

    public static void main(String[] args) {
        HP obj = new HP();
        obj.status();
        obj.print();
    }
}



