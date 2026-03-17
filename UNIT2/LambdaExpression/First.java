// Write a lambda expression to implement the MathOperation functional interface that returns the square of a given integer.
@FunctionalInterface
interface MathOperation {
    int square(int n);
}

public class First {
    public static void main(String[] args) {

        MathOperation obj = (n) -> n * n;

        System.out.println("Square: " + obj.square(5));
    }
}