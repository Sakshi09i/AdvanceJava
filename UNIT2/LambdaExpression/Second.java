// Write a lambda expression to find the maximum of two numbers.
@FunctionalInterface
interface MaxNumber {
    int max(int a, int b);
}

public class Second {
    public static void main(String[] args) {

        Second obj = (a, b) -> (a > b) ? a : b;

        System.out.println("Maximum: " + obj.max(10, 20));
    }
}
