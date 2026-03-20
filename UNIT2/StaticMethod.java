

interface Message {
    // Static method
    static void greet() {
        System.out.println("Hello from Interface");
    }
}

class StaticMethod implements Message {
    public static void main(String[] args) {

        // Calling static method using interface name
        Message.greet();
    }
}
