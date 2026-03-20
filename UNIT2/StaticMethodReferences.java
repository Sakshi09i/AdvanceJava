// Syntax: ClassName::staticMethodName

class MathUtil {
    public static int square(int x) {
        return x * x;
    }
}

interface Calculator {
    int calc(int a);
}

public class StaticMethodReferences {
    public static void main(String[] args) {

        // Lambda
        Calculator c1 = (a) -> MathUtil.square(a);

        // Method Reference
        Calculator c2 = MathUtil::square;

        System.out.println(c2.calc(5));
    }
}



