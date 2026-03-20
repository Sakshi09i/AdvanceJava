// private method in interface
interface Bank {
    private void connect() {
        System.out.println("Connecting to server");
    }

    default void withdraw() {
        connect();
        System.out.println("Withdrawal successful");
    }
}

class PrivateMethod implements Bank {
    public static void main(String[] args) {
        PrivateMethod u = new PrivateMethod();
        u.withdraw();
    }
}



