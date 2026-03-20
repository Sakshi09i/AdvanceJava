

@FunctionalInterface
interface Operation {
    int calculate(int a, int b);
}
public class ReturnExpressionLambda {
    public static void main(String[] args) {
        Operation add = (a, b) -> {
 System.out.println("addition");
 return a + b;};
        System.out.println(add.calculate(6, 3));
}
}
